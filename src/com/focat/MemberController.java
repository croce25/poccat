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

import com.logic.MemberLogic;
import com.util.HashMapBinder;


public class MemberController implements Action {
	Logger logger = Logger.getLogger(MemberController.class);
	String requestName = null;
	String saveDir = null;
	int result = 0;
	MemberLogic memLogic = null;
	HashMapBinder HmBind = null;
	public MemberController(String requestName,String saveDir) {
		this.requestName=requestName;
		this.saveDir=saveDir;
		memLogic = new MemberLogic();
		
	}

	@Override
	public ModelAndView excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.info("memberController excute호출성공 : "+requestName);
		HmBind = new HashMapBinder(req,saveDir);
		List<Map<String,Object>> memList = null;
		Map<String,Object> pMap = new HashMap<>();
		int result = 0;
		ModelAndView mav = new ModelAndView(req, res);
		HmBind.bind(pMap);
		switch(requestName) {
//////////////////////[[ 회원정보 시작 ]]/////////////////////
		case "member_login":
			memList = new ArrayList<>();
			memList = memLogic.member_login(pMap);
			break;
		case "member_id_check":
			memList = new ArrayList<>();
			memList = memLogic.member_id_check(pMap);
			break;
		case "member_join":
			result = memLogic.member_join(pMap);
			break;
		case "member_modi":
			result = memLogic.member_modi(pMap);
			break;
		case "member_del":
			result = memLogic.member_del(pMap);
			break;
/////////////////////////[[ 회원정보 끝 ]]///////////////////////////
/////////////////////////[[ 친구회원 시작 ]]///////////////////////////
		case "friend_member_list":
			memList = new ArrayList<>();
			memList = memLogic.friend_member_list(pMap);
			break;
		case "friend_member_add":
			result = memLogic.friend_member_add(pMap);
			break;
		case "friend_member_del":
			result = memLogic.friend_member_del(pMap);
			break;
/////////////////////////[[ 친구회원 끝 ]]///////////////////////////			
/////////////////////////[[ 그룹 시작 ]]///////////////////////////			
		case "group_search":
			memList = new ArrayList<>();
			memList = memLogic.group_search(pMap);
			break;
		case "group_create":
			result = memLogic.group_create(pMap);
			break;
		case "group_change_title":
			result = memLogic.group_change_title(pMap);
			break;
		case "group_del":
			result = memLogic.group_del(pMap);
			break;
/////////////////////////[[ 그룹 끝 ]]///////////////////////////
/////////////////////////[[ 그룹 생성 및 가입 시작]]///////////////////////////
		case "group_mem_mygroup":
			memList = new ArrayList<>();
			memList = memLogic.group_mem_mygroup(pMap);
			break;
		case "group_mem_list":
			memList = new ArrayList<>();
			memList = memLogic.group_mem_list(pMap);
			break;
		case "group_mem_join":
			result = memLogic.group_mem_join(pMap);
			break;
		case "group_mem_del":
			result = memLogic.group_mem_del(pMap);
			break;
/////////////////////////[[ 그룹 생성 및 가입 끝]]///////////////////////////
/////////////////////////[[ 그룹게시판 시작]]///////////////////////////
		case "group_board_list":
			memList = new ArrayList<>();
			memList = memLogic.group_board_list(pMap);
			break;
		case "group_board_detail":
			memList = new ArrayList<>();
			memList = memLogic.group_board_detail(pMap);
			break;
		case "group_board_write":
			result = memLogic.group_board_write(pMap);
			break;
		case "group_board_modi":
			result = memLogic.group_board_modi(pMap);
			break;
		case "group_board_del":
			result = memLogic.group_board_del(pMap);
			break;
/////////////////////////[[ 그룹게시판 끝]]///////////////////////////
/////////////////////////[[ 댓글(그룹게시판) 시작]]///////////////////////////
		case "group_board_cmt_list":
			memList = new ArrayList<>();
			memList = memLogic.group_board_cmt_list(pMap);
			break;
		case "group_board_cmt_write":
			result = memLogic.group_board_cmt_write(pMap);
			break;
		case "group_board_cmt_modi":
			result = memLogic.group_board_cmt_modi(pMap);
			break;
		case "group_board_cmt_del":
			result = memLogic.group_board_cmt_del(pMap);
			break;
///////////////////////[[ 댓글(그룹게시판) 끝]]///////////////////////////
		}
//////요청의 결과를 판단하여 forward인지 sendRedirct인지 결정하여 해당하는 값을 결정해주는과정//////			
		if(memList!=null) {
		mav.addObject("rList", memList);
		mav.setIsRedirect(false);
		}
		else if(memList==null) {
			mav.addObject("result", result);//insert, update, delete의 성공여부 판단을 위한 값저장
			mav.setIsRedirect(true);// sendRedirect여부
		}
		mav.setViewName(requestName+".jsp");
		
		return mav;
	}

}
