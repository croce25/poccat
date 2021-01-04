package com.logic;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.dao.FirstBDao_1;
import com.dao.FirstBDao_2;

public class FirstBLogic {
	Logger logger = Logger.getLogger(FirstBLogic.class);
	private FirstBDao_1 fbDao_1 = null;
	private FirstBDao_2 fbDao_2 = null;
	int result = 0;
	public FirstBLogic() {
		fbDao_1 = new FirstBDao_1();
		fbDao_2 = new FirstBDao_2();
	}
	
//////////////////////////////////////////[[입양관리 및 후기 시작]]///////////////////////////////////////////	
	public List<Map<String, Object>> adoption_review_list(Map<String,Object> pMap) {
		logger.info("adoption_review_list 호출 성공");
		List<Map<String,Object>> fbList = null;
		fbList = fbDao_1.adoption_review_list(pMap);
		return fbList;
	}
	
	public List<Map<String, Object>> adoption_review_detail(Map<String,Object> pMap) {
		logger.info("adoption_review_detail 호출 성공");
		List<Map<String,Object>> fbList = null;
		fbList = fbDao_1.adoption_review_detail(pMap);
		return fbList;
	}
	
	public int adoption_review_write(Map<String,Object> pMap) {
		logger.info("adoption_review_write 호출 성공");
		result = fbDao_1.adoption_review_write(pMap);
		return result;
	}
	
	public int adoption_review_modi(Map<String,Object> pMap) {
		logger.info("adoption_review_modi 호출 성공");
		result = fbDao_1.adoption_review_modi(pMap);
		return result;
	}
	
	public int adoption_review_del(Map<String,Object> pMap) {
		logger.info("adoption_review_del 호출 성공");
		result = fbDao_1.adoption_review_del(pMap);
		return result;
	}
//////////////////////////////////////////[[입양관리 및 후기 끝]]///////////////////////////////////////////

//////////////////////////////////////////[[포스팅(신고) 시작]]///////////////////////////////////////////
	public List<Map<String, Object>> posting_list(Map<String,Object> pMap) {
		logger.info("posting_list 호출 성공");
		List<Map<String,Object>> fbList = null;
		fbList = fbDao_2.posting_list(pMap);
		return fbList;
	}
	
	public List<Map<String, Object>> posting_detail(Map<String,Object> pMap) {
		logger.info("posting_detail 호출 성공");
		List<Map<String,Object>> fbList = null;
		fbList = fbDao_2.posting_detail(pMap);
		return fbList;
	}
	
	public int posting_write(Map<String,Object> pMap) {
		logger.info("posting_write 호출 성공");
		result = fbDao_2.posting_write(pMap);
		return result;
	}
	
	public int posting_modi(Map<String,Object> pMap) {
		logger.info("posting_modi 호출 성공");
		result = fbDao_2.posting_modi(pMap);
		return result;
	}
	
	public int posting_del(Map<String,Object> pMap) {
		logger.info("posting_del 호출 성공");
		result = fbDao_2.posting_del(pMap);
		return result;
	}
/////////////////////////////////////////[[포스팅(신고) 끝]]///////////////////////////////////////////
}
