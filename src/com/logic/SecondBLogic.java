package com.logic;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.dao.SecondBDao_1;
import com.dao.SecondBDao_2;

public class SecondBLogic {
	Logger logger = Logger.getLogger(SecondBLogic.class);
	private SecondBDao_1 sbDao_1 = null;
	private SecondBDao_2 sbDao_2 = null;
	int result = 0;
	public SecondBLogic() {
		sbDao_1 = new SecondBDao_1();
		sbDao_2 = new SecondBDao_2();
	}
////////////////////////////////////////자원봉사 공고 시작 /////////////////////////////////////
	public List<Map<String, Object>> volunteer_noti_list(Map<String,Object> pMap) {
		logger.info("volunteer_noti_list 호출 성공");
		List<Map<String,Object>> sbList = null;
		sbList = sbDao_1.volunteer_noti_list(pMap);
		return sbList;
	}
	
	public List<Map<String, Object>> volunteer_noti_detail(Map<String,Object> pMap) {
		logger.info("volunteer_noti_detail 호출 성공");
		List<Map<String,Object>> sbList = null;
		sbList = sbDao_1.volunteer_noti_detail(pMap);
		return sbList;
	}
	
	public int volunteer_noti_write(Map<String,Object> pMap) {
		logger.info("volunteer_noti_write 호출 성공");
		result = sbDao_1.volunteer_noti_write(pMap);
		return result;
	}
	
	public int volunteer_noti_modi(Map<String,Object> pMap) {
		logger.info("volunteer_noti_modi 호출 성공");
		result = sbDao_1.volunteer_noti_modi(pMap);
		return result;
	}
	
	public int volunteer_noti_del(Map<String,Object> pMap) {
		logger.info("volunteer_noti_del 호출 성공");
		result = sbDao_1.volunteer_noti_del(pMap);
		return result;
	}
////////////////////////////////////////자원봉사 공고 종료 /////////////////////////////////////

////////////////////////////////////////자원봉사 신청  시작/////////////////////////////////////	
	public List<Map<String, Object>> volunteer_apply_check(Map<String,Object> pMap) {
		logger.info("volunteer_apply_check 호출 성공");
		List<Map<String,Object>> sbList = null;
		sbList = sbDao_1.volunteer_apply_check(pMap);
		return sbList;
	}
	
	public int volunteer_apply_book(Map<String,Object> pMap) {
		logger.info("volunteer_apply_book 호출 성공");
		result = sbDao_1.volunteer_apply_book(pMap);
		return result;
	}
	public int volunteer_apply_cancel(Map<String,Object> pMap) {
		logger.info("volunteer_apply_cancel 호출 성공");
		result = sbDao_1.volunteer_apply_cancel(pMap);
		return result;
	}
////////////////////////////////////////자원봉사 신청  종료/////////////////////////////////////

////////////////////////////////////////게시판(통합) 시작/////////////////////////////////////
	public List<Map<String, Object>> common_board_list(Map<String,Object> pMap) {
		logger.info("common_board_list 호출 성공");
		List<Map<String,Object>> sbList = null;
		sbList = sbDao_1.common_board_list(pMap);
		return sbList;
	}
	
	public List<Map<String, Object>> common_board_detail(Map<String,Object> pMap) {
		logger.info("common_board_detail 호출 성공");
		List<Map<String,Object>> sbList = null;
		sbList = sbDao_1.common_board_detail(pMap);
		return sbList;
	}
	
	public int common_board_write(Map<String,Object> pMap) {
		logger.info("common_board_write 호출 성공");
		result = sbDao_1.common_board_write(pMap);
		return result;
	}
	
	public int common_board_modi(Map<String,Object> pMap) {
		logger.info("common_board_modi 호출 성공");
		result = sbDao_1.common_board_modi(pMap);
		return result;
	}
	
	public int common_board_del(Map<String,Object> pMap) {
		logger.info("common_board_del 호출 성공");
		result = sbDao_1.common_board_del(pMap);
		return result;
	}
////////////////////////////////////////게시판(통합) 종료/////////////////////////////////////

////////////////////////////////[[후원 공고 시작]]////////////////////////////////////////////
	public List<Map<String, Object>> donation_noti_list(Map<String,Object> pMap) {
		logger.info("donation_noti_list 호출 성공");
		List<Map<String,Object>> sbList = null;
		sbList = sbDao_2.donation_noti_list(pMap);
		return sbList;
	}
	
	public List<Map<String, Object>> donation_noti_detail(Map<String,Object> pMap) {
		logger.info("donation_noti_detail 호출 성공");
		List<Map<String,Object>> sbList = null;
		sbList = sbDao_2.donation_noti_detail(pMap);
		return sbList;
	}
	
	public int donation_noti_write(Map<String,Object> pMap) {
		logger.info("donation_noti_write 호출 성공");
		result = sbDao_2.donation_noti_write(pMap);
		return result;
	}
	
	public int donation_noti_modi(Map<String,Object> pMap) {
		logger.info("donation_noti_modi 호출 성공");
		result = sbDao_2.donation_noti_modi(pMap);
		return result;
	}
	
	public int donation_noti_del(Map<String,Object> pMap) {
		logger.info("donation_noti_del 호출 성공");
		result = sbDao_2.donation_noti_del(pMap);
		return result;
	}
////////////////////////////////////////후원 공고 종료 /////////////////////////////////////

////////////////////////////////////////후원 이력(신청) 시작/////////////////////////////////////	
	public List<Map<String, Object>> donation_check(Map<String,Object> pMap) {
		logger.info("donation_check 호출 성공");
		List<Map<String,Object>> sbList = null;
		sbList = sbDao_2.donation_check(pMap);
		return sbList;
	}
	
	public int donation_book(Map<String,Object> pMap) {
		logger.info("donation_book 호출 성공");
		result = sbDao_2.donation_book(pMap);
		return result;
	}
	public int donation_cancel(Map<String,Object> pMap) {
		logger.info("donation_cancel 호출 성공");
		result = sbDao_2.donation_cancel(pMap);
		return result;
	}
////////////////////////////////////////후원 이력(신청) 종료/////////////////////////////////////
}
