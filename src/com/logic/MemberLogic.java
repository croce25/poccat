package com.logic;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.dao.MemberDao_1;
import com.dao.MemberDao_2;
import com.dao.MemberDao_3;


public class MemberLogic {
	Logger logger = Logger.getLogger(MemberLogic.class);
	private MemberDao_1 memDao_1 = null;
	private MemberDao_2 memDao_2 = null;
	private MemberDao_3 memDao_3 = null;
	int result= 0;
	public MemberLogic() {
		memDao_1 = new MemberDao_1();
		memDao_2 = new MemberDao_2();
		memDao_3 = new MemberDao_3();
	}
/////////////////////////////////[[ MemberDao_1 ]]////////////////////////////////	
	public List<Map<String, Object>> member_login(Map<String,Object> pMap) {
		logger.info("member_login 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memDao_1.member_login(pMap);
		return memList;
	}
	
	public List<Map<String, Object>> member_id_check(Map<String,Object> pMap) {
		logger.info("member_id_check 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memDao_1.member_id_check(pMap);
		return memList;
	}
	
	public int member_join(Map<String,Object> pMap) {
		logger.info("member_join 호출 성공");
		result = memDao_1.member_join(pMap);
		return result;
	}
	
	public int member_modi(Map<String,Object> pMap) {
		logger.info("member_modi 호출 성공");
		result = memDao_1.member_modi(pMap);
		return result;
	}
	
	public int member_del(Map<String,Object> pMap) {
		logger.info("member_del 호출 성공");
		result = memDao_1.member_del(pMap);
		return result;
	}
	
	public List<Map<String, Object>> friend_member_list(Map<String,Object> pMap) {
		logger.info("friend_member_list 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memDao_1.friend_member_list(pMap);
		return memList;
	}
	
	public int friend_member_add(Map<String,Object> pMap) {
		logger.info("friend_member_add 호출 성공");
		result = memDao_1.friend_member_add(pMap);
		return result;
	}
	
	public int friend_member_del(Map<String,Object> pMap) {
		logger.info("friend_member_del 호출 성공");
		result = memDao_1.friend_member_del(pMap);
		return result;
	}
/////////////////////////////////[[ MemberDao_1 끝 ]]//////////////////////////////////

/////////////////////////////////[[ MemberDao_2 시작 ]]////////////////////////////////
	public List<Map<String, Object>> group_search(Map<String,Object> pMap) {
		logger.info("group_search 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memDao_2.group_search(pMap);
		return memList;
	}
	
	public int group_create(Map<String,Object> pMap) {
		logger.info("group_create 호출 성공");
		result = memDao_2.group_create(pMap);
		return result;
	}
	
	public int group_change_title(Map<String,Object> pMap) {
		logger.info("group_change_title 호출 성공");
		result = memDao_2.group_change_title(pMap);
		return result;
	}
	
	public int group_del(Map<String,Object> pMap) {
		logger.info("group_del 호출 성공");
		result = memDao_2.group_del(pMap);
		return result;
	}
	
	public List<Map<String, Object>> group_mem_mygroup(Map<String,Object> pMap) {
		logger.info("group_mem_mygroup 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memDao_2.group_mem_mygroup(pMap);
		return memList;
	}
	
	public List<Map<String, Object>> group_mem_list(Map<String,Object> pMap) {
		logger.info("group_mem_list 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memDao_2.group_mem_list(pMap);
		return memList;
	}
	
	public int group_mem_join(Map<String,Object> pMap) {
		logger.info("group_mem_join 호출 성공");
		result = memDao_2.group_mem_join(pMap);
		return result;
	}
	
//	public int memberUpdate(Map<String,Object> pMap) {
//		logger.info(" 호출 성공");
//		result = memDao_2.memberUpdate(pMap);
//		return result;
//	}
	
	public int group_mem_del(Map<String,Object> pMap) {
		logger.info("group_mem_del 호출 성공");
		result = memDao_2.group_mem_del(pMap);
		return result;
	}
/////////////////////////////////[[ MemberDao_2 끝 ]]/////////////////////////////////
	
/////////////////////////////////[[ MemberDao_3 시작 ]]////////////////////////////////
	public List<Map<String, Object>> group_board_list(Map<String,Object> pMap) {
		logger.info("group_board_list 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memDao_3.group_board_list(pMap);
		return memList;
	}
	
	public List<Map<String, Object>> group_board_detail(Map<String,Object> pMap) {
		logger.info("group_board_detail 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memDao_3.group_board_detail(pMap);
		return memList;
	}
	
	public int group_board_write(Map<String,Object> pMap) {
		logger.info("group_board_write 호출 성공");
		result = memDao_3.group_board_write(pMap);
		return result;
	}
	
	public int group_board_modi(Map<String,Object> pMap) {
		logger.info("group_board_modi 호출 성공");
		result = memDao_3.group_board_modi(pMap);
		return result;
	}
	
	public int group_board_del(Map<String,Object> pMap) {
		logger.info("group_board_del 호출 성공");
		result = memDao_3.group_board_del(pMap);
		return result;
	}
	
	public List<Map<String, Object>> group_board_cmt_list(Map<String,Object> pMap) {
		logger.info("group_board_cmt_list 호출 성공");
		List<Map<String,Object>> memList = null;
		memList = memDao_3.group_board_cmt_list(pMap);
		return memList;
	}
	
	public int group_board_cmt_write(Map<String,Object> pMap) {
		logger.info("group_board_cmt_write 호출 성공");
		result = memDao_3.group_board_cmt_write(pMap);
		return result;
	}
	
	public int group_board_cmt_modi(Map<String,Object> pMap) {
		logger.info("group_board_cmt_modi 호출 성공");
		result = memDao_3.group_board_cmt_modi(pMap);
		return result;
	}
	
	public int group_board_cmt_del(Map<String,Object> pMap) {
		logger.info("group_board_cmt_del 호출 성공");
		result = memDao_3.group_board_cmt_del(pMap);
		return result;
	}

/////////////////////////////////[[ MemberDao_3 끝 ]]////////////////////////////////
}
