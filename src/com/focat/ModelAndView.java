package com.focat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;


public class ModelAndView {
	Logger logger = Logger.getLogger(ModelAndView.class);
	HttpServletRequest req = null;
	HttpServletResponse res = null;
	String viewName = null;
	boolean isRedirect = false;
	List<Map<String,Object>> reqList = new ArrayList<>();
	
	
	public ModelAndView() {}
	public ModelAndView(HttpServletRequest req) {
		this.req = req;
	}
	public ModelAndView(HttpServletRequest req, HttpServletResponse res) {
		this.req = req;
		this.res = res;
	}
	/*
	 * ModelAndView mav = new ModelAndView();
	 * mav.setViewName(login/login);
	 * @param viewName
	 * *************************************/
	public void setViewName(String viewName) {// 응답페이지로 나갈 페이지 이름 결정하기
//		String commands[] = viewName.split("/");
//		viewName = commands[1];
//		logger.info("viewName : "+viewName);
		this.viewName = viewName;
	}
	public void setIsRedirect(boolean isRedirect) {
		this.isRedirect=isRedirect;
	}
	public void addObject(String name,Object obj) {//scope가 request일때 값을 유지하기
		Map<String,Object> rMap = new HashMap<>();
		rMap.put(name, obj);
		reqList.add(rMap);
		//req.setAttribute("reqList", reqList);
	}
}
