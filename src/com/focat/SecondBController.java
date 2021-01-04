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

import com.logic.SecondBLogic;
import com.util.HashMapBinder;

public class SecondBController implements Action{
	Logger logger = Logger.getLogger(FirstBController.class);
	String requestName = null;
	String saveDir = null;
	int result = 0;
	SecondBLogic sbLogic = null;
	HashMapBinder HmBind = null;
	public SecondBController(String requestName,String saveDir) {
		this.requestName=requestName;
		this.saveDir=saveDir;
		sbLogic = new SecondBLogic();
		
	}

	@Override
	public ModelAndView excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.info("SecondBController excute호출성공 : "+requestName);
		HmBind = new HashMapBinder(req, saveDir);
		List<Map<String,Object>> sbList = new ArrayList<>();
		Map<String,Object> pMap = new HashMap<>();
		int result = 0;
		ModelAndView mav = new ModelAndView(req, res);
		HmBind.bind(pMap);
/////////////////////////////[[자원봉사 공고 시작]]//////////////////////////
		switch(requestName) {
		case "volunteer_noti_list":
			sbList = new ArrayList<>();
			sbList = sbLogic.volunteer_noti_list(pMap);
			break;
		case "volunteer_noti_detail":
			sbList = new ArrayList<>();
			sbList = sbLogic.volunteer_noti_detail(pMap);
			break;
		case "volunteer_noti_write":
			result = sbLogic.volunteer_noti_write(pMap);
			break;
		case "volunteer_noti_modi":
			result = sbLogic.volunteer_noti_modi(pMap);
			break;
		case "volunteer_noti_del":
			result = sbLogic.volunteer_noti_del(pMap);
			break;
/////////////////////////////[[자원봉사 공고 종료]]//////////////////////////			
/////////////////////////////[[자원봉사 신청 시작]]//////////////////////////			
		case "volunteer_apply_check":
			sbList = new ArrayList<>();
			sbList = sbLogic.volunteer_apply_check(pMap);
			break;
		case "volunteer_apply_book":
			result = sbLogic.volunteer_apply_book(pMap);
			break;
		case "volunteer_apply_cancel":
			result = sbLogic.volunteer_apply_cancel(pMap);
			break;
/////////////////////////////[[자원봉사 신청 종료]]//////////////////////////			
/////////////////////////////[[게시판(통합) 시작]]//////////////////////////			
		case "common_board_list":
			sbList = new ArrayList<>();
			sbList = sbLogic.common_board_list(pMap);
			break;
		case "common_board_detail":
			sbList = new ArrayList<>();
			sbList = sbLogic.common_board_detail(pMap);
			break;
		case "common_board_write":
			result = sbLogic.common_board_write(pMap);
			break;
		case "common_board_modi":
			result = sbLogic.common_board_modi(pMap);
			break;
		case "common_board_del":
			result = sbLogic.common_board_del(pMap);
			break;
/////////////////////////////[[게시판(통합) 종료]]//////////////////////////			
/////////////////////////////[[후원 공고 시작]]//////////////////////////			
		case "donation_noti_list":
			sbList = new ArrayList<>();
			sbList = sbLogic.donation_noti_list(pMap);
			break;
		case "donation_noti_detail":
			sbList = new ArrayList<>();
			sbList = sbLogic.donation_noti_detail(pMap);
			break;
		case "donation_noti_write":
			result = sbLogic.donation_noti_write(pMap);
			break;
		case "donation_noti_modi":
			result = sbLogic.donation_noti_modi(pMap);
			break;
		case "donation_noti_del":
			result = sbLogic.donation_noti_del(pMap);
			break;
/////////////////////////////[[후원 공고 종료]]//////////////////////////			
/////////////////////////////[[후원 이력(신청) 시작]]//////////////////////////			
		case "donation_check":
			sbList = new ArrayList<>();
			sbList = sbLogic.donation_check(pMap);
			break;
		case "donation_book":
			result = sbLogic.donation_book(pMap);
			break;
		case "donation_cancel":
			result = sbLogic.donation_cancel(pMap);
			break;
/////////////////////////////[[후원 이력(신청) 종료]]//////////////////////////
		}
		
//////요청의 결과를 판단하여 forward인지 sendRedirct인지 결정하여 해당하는 값을 결정해주는과정//////			
		if(sbList!=null) {
		mav.addObject("rList", sbList);
		mav.setIsRedirect(false);
		}
		else if(sbList==null) {
			mav.addObject("result", result);//insert, update, delete의 성공여부 판단을 위한 값저장
			mav.setIsRedirect(true);// sendRedirect여부
		}
		mav.setViewName(requestName+".jsp");
		
		return mav;
	}

}
