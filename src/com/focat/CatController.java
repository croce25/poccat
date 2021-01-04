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

import com.logic.CatLogic;
import com.util.HashMapBinder;

public class CatController implements Action{
	Logger logger = Logger.getLogger(CatController.class);
	String requestName = null;
	String saveDir = null;
	int result = 0;
	CatLogic catLogic = null;
	HashMapBinder HmBind = null;
	public CatController(String requestName,String saveDir) {
		this.requestName=requestName;
		this.saveDir=saveDir;
		catLogic = new CatLogic();
		
	}

	@Override
	public ModelAndView excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.info("CatController excute호출성공 : "+requestName);
		HmBind = new HashMapBinder(req, saveDir);
		List<Map<String,Object>> catList = null;
		Map<String,Object> pMap = new HashMap<>();
		int result = 0;
		ModelAndView mav = new ModelAndView(req, res);
		HmBind.bind(pMap);
////////////////////[[고양이정보]]///////////////////
		switch(requestName) {
		case "cat_search":
			catList = new ArrayList<>();
			catList = catLogic.cat_search(pMap);
			break;
		case "cat_regist":
			result = catLogic.cat_regist(pMap);
			break;
		case "cat_modi":
			result = catLogic.cat_modi(pMap);
			break;
		case "cat_del":
			result = catLogic.cat_del(pMap);
			break;
////////////////////[[고양이정보 끝]]///////////////////
////////////////////[[고양이 팔로우 시작]]///////////////////
		case "member_cat_follow_list":
			catList = new ArrayList<>();
			catList = catLogic.member_cat_follow_list(pMap);
			break;
		case "member_cat_follow_regist":
			result = catLogic.member_cat_follow_regist(pMap);
			break;
		case "member_cat_follow_cancel":
			result = catLogic.member_cat_follow_cancel(pMap);
			break;
////////////////////[[고양이 팔로우 끝]]///////////////////
////////////////////[[급식소 정보 시작]]///////////////////
		case "mealcenter_search":
			catList = new ArrayList<>();
			catList = catLogic.mealcenter_search(pMap);
			break;
		case "mealcenter_regist":
			result = catLogic.mealcenter_regist(pMap);
			break;
		case "mealcenter_update":
			result = catLogic.mealcenter_update(pMap);
			break;
		case "mealcenter_del":
			result = catLogic.mealcenter_del(pMap);
			break;
////////////////////[[급식소 정보 끝]]///////////////////
////////////////////[[고양이-급식소 시작]]///////////////////
		case "cat_mealcenter_list":
			catList = new ArrayList<>();
			catList = catLogic.mealcenter_search(pMap);
			break;
		case "cat_mealcenter_regist":
			result = catLogic.cat_mealcenter_regist(pMap);
			break;
		case "cat_mealcenter_del":
			result = catLogic.cat_mealcenter_del(pMap);
			break;
////////////////////[[고양이-급식소 끝]]///////////////////	
		}
//////요청의 결과를 판단하여 forward인지 sendRedirct인지 결정하여 해당하는 값을 결정해주는과정//////		
		if(catList!=null) {
		mav.addObject("rList", catList);
		mav.setIsRedirect(false);
		}
		else if(catList==null) {
			mav.addObject("result", result);//insert, update, delete의 성공여부 판단을 위한 값저장
			mav.setIsRedirect(true);// sendRedirect여부
		}
		mav.setViewName(requestName+".jsp");
		
		return mav;
	}

}
