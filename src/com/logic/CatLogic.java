package com.logic;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.dao.CatDao_1;
import com.dao.CatDao_2;
import com.dao.MemberDao_1;

public class CatLogic {
	Logger logger = Logger.getLogger(CatLogic.class);
	private CatDao_1 catDao_1 = null;
	private CatDao_2 catDao_2 = null;
	int result= 0;
	public CatLogic() {
		catDao_1 = new CatDao_1();
		catDao_2 = new CatDao_2();
	}
///////////////////////////////[[ CatDao_1 시작 ]]//////////////////////////	
	public List<Map<String, Object>> cat_search(Map<String,Object> pMap) {
		logger.info("cat_search 호출 성공");
		List<Map<String,Object>> catList = null;
		catList = catDao_1.cat_search(pMap);
		return catList;
	}
	
	public int cat_regist(Map<String,Object> pMap) {
		logger.info("cat_regist 호출 성공");
		result = catDao_1.cat_regist(pMap);
		return result;
	}
	
	public int cat_modi(Map<String,Object> pMap) {
		logger.info("cat_modi 호출 성공");
		result = catDao_1.cat_modi(pMap);
		return result;
	}
	
	public int cat_del(Map<String,Object> pMap) {
		logger.info("cat_del 호출 성공");
		result = catDao_1.cat_del(pMap);
		return result;
	}
	
	public List<Map<String, Object>> member_cat_follow_list(Map<String,Object> pMap) {
		logger.info("member_cat_follow_list 호출 성공");
		List<Map<String,Object>> catList = null;
		catList = catDao_1.member_cat_follow_list(pMap);
		return catList;
	}
	
	public int member_cat_follow_regist(Map<String,Object> pMap) {
		logger.info("member_cat_follow_regist 호출 성공");
		result = catDao_1.member_cat_follow_regist(pMap);
		return result;
	}
	
	
	public int member_cat_follow_cancel(Map<String,Object> pMap) {
		logger.info("member_cat_follow_cancel 호출 성공");
		result = catDao_1.member_cat_follow_cancel(pMap);
		return result;
	}
///////////////////////////////[[ CatDao_1 끝 ]]//////////////////////////
	
///////////////////////////////[[ CatDao_2 시작 ]]//////////////////////////	
	public List<Map<String, Object>> mealcenter_search(Map<String,Object> pMap) {
		logger.info("mealcenter_search 호출 성공");
		List<Map<String,Object>> catList = null;
		catList = catDao_2.mealcenter_search(pMap);
		return catList;
	}
	
	public int mealcenter_regist(Map<String,Object> pMap) {
		logger.info("mealcenter_regist 호출 성공");
		result = catDao_2.mealcenter_regist(pMap);
		return result;
	}
	
	public int mealcenter_update(Map<String,Object> pMap) {
		logger.info("mealcenter_update 호출 성공");
		result = catDao_2.mealcenter_update(pMap);
		return result;
	}
	
	public int mealcenter_del(Map<String,Object> pMap) {
		logger.info("mealcenter_del 호출 성공");
		result = catDao_2.mealcenter_del(pMap);
		return result;
	}
	public List<Map<String, Object>> cat_mealcenter_list(Map<String,Object> pMap) {
		logger.info("cat_mealcenter_list 호출 성공");
		List<Map<String,Object>> catList = null;
		catList = catDao_2.cat_mealcenter_list(pMap);
		return catList;
	}
	
	public int cat_mealcenter_regist(Map<String,Object> pMap) {
		logger.info("cat_mealcenter_regist 호출 성공");
		result = catDao_2.cat_mealcenter_regist(pMap);
		return result;
	}
	
	public int cat_mealcenter_del(Map<String,Object> pMap) {
		logger.info("cat_mealcenter_del 호출 성공");
		result = catDao_2.cat_mealcenter_del(pMap);
		return result;
	}
///////////////////////////////[[ CatDao_2 끝 ]]//////////////////////////
}
