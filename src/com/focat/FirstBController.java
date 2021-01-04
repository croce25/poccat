package com.focat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.logic.FirstBLogic;
import com.oreilly.servlet.MultipartRequest;
import com.util.HashMapBinder;

public class FirstBController implements Action{
	Logger logger = Logger.getLogger(FirstBController.class);
	String requestName = null;
	String saveDir = null;
	int result = 0;
	FirstBLogic fbLogic = null;
	HashMapBinder HmBind = null;
	MultipartRequest multiReq = null;
	public FirstBController(String requestName, String saveDir) {
		this.requestName=requestName;
		this.saveDir=saveDir;
		fbLogic = new FirstBLogic();
		
	}
	
	@Override
	public ModelAndView excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.info("FirtstBController excute호출성공 : "+requestName);
		
		//multiReq = new MultipartRequest(req, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		HmBind = new HashMapBinder(req, saveDir);
		List<Map<String,Object>> fbList = new ArrayList<>();
		Map<String,Object> pMap = new HashMap<>();
		int result = 0;
		ModelAndView mav = new ModelAndView(req, res);
		HmBind.bind(pMap);
///////////////////////////////[[입양관리 및 후기 시작]]///////////////////////////////
		switch(requestName) {
		case "adoption_review_list":
			fbList = new ArrayList<>();
			fbList = fbLogic.adoption_review_list(pMap);
			break;
		case "adoption_review_detail":
			fbList = new ArrayList<>();
			fbList = fbLogic.adoption_review_detail(pMap);
			break;
		case "adoption_review_write":
			result = fbLogic.adoption_review_write(pMap);
			break;
		case "adoption_review_modi":
			result = fbLogic.adoption_review_modi(pMap);
			break;
		case "adoption_review_del":
			result = fbLogic.adoption_review_del(pMap);
			break;
///////////////////////////////[[입양관리 및 후기 끝]]///////////////////////////////
///////////////////////////////[[포스팅 및 신고 시작]]///////////////////////////////
		case "posting_list":
			fbList = new ArrayList<>();
			fbList = fbLogic.posting_list(pMap);
			break;
		case "posting_detail":
			fbList = new ArrayList<>();
			fbList = fbLogic.posting_detail(pMap);
			break;
		case "posting_write":
			result = fbLogic.posting_write(pMap);
			break;
		case "posting_modi":
			result = fbLogic.posting_modi(pMap);
			break;
		case "posting_del":
			result = fbLogic.posting_del(pMap);
			break;
///////////////////////////////[[포스팅 및 신고 끝]]///////////////////////////////
		}
//////////요청의 결과를 판단하여 forward인지 sendRedirct인지 결정하여 해당하는 값을 결정해주는과정//////			
		if(fbList!=null) {
		mav.addObject("rList", fbList);
		mav.setIsRedirect(false);
		}
		else if(fbList==null) {
			mav.addObject("result", result);//insert, update, delete의 성공여부 판단을 위한 값저장
			mav.setIsRedirect(true);// sendRedirect여부
		}
		mav.setViewName(requestName+".jsp");
		
		return mav;
	}

}
