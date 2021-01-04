package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;

public class CatDao_1 {
	Logger logger = Logger.getLogger(CatDao_1.class);
	SqlSessionFactory sqlSessionFactory =null;
	MyBatisCommonFactory mcf = null;
	int result = 0;
	public CatDao_1() {
		mcf = new MyBatisCommonFactory();
		sqlSessionFactory = mcf.getSqlSessionFactory();
	}
//////////////////////////[[고양이 시작]]////////////////////////////////////	
	public List<Map<String, Object>> cat_search(Map<String, Object> pMap) {
		logger.info("cat_search 호출성공");
		List<Map<String,Object>> memList = null;
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			memList = sqlSession.selectList(" ",pMap);
			sqlSession.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트를 할 경우 오라클 서버의 세션이 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야함.
			//주의해야한다. 
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return memList;
	}
	
	public int cat_regist(Map<String, Object> pMap) {
		logger.info("cat_regist 호출성공");
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			result = sqlSession.insert(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return result;
	}
	
	public int cat_modi(Map<String, Object> pMap) {
		logger.info("cat_modi 호출성공");
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			result = sqlSession.update(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return result;
	}
	
	public int cat_del(Map<String, Object> pMap) {
		logger.info("cat_del 호출성공");
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			result = sqlSession.delete(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return result;
	}
///////////////////////////////[[고양이 끝]]///////////////////////////
	
//////////////////////////[[고양이 팔로우 시작]]////////////////////////////////////	
	public List<Map<String, Object>> member_cat_follow_list(Map<String, Object> pMap) {
		logger.info("member_cat_follow_list 호출성공");
		List<Map<String,Object>> memList = null;
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			memList = sqlSession.selectList(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트를 할 경우 오라클 서버의 세션이 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야함.
			//주의해야한다. 
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return memList;
	}
	
	public int member_cat_follow_regist(Map<String, Object> pMap) {
		logger.info("member_cat_follow_regist 호출성공");
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			result = sqlSession.insert(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return result;
	}
	
	public int member_cat_follow_cancel(Map<String, Object> pMap) {
		logger.info("member_cat_follow_cancel 호출성공");
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			result = sqlSession.delete(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return result;
	}
///////////////////////////////[[고양이 팔로우 끝]]///////////////////////////
	
}
