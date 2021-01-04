package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;

public class FirstBDao_2 {
	Logger logger = Logger.getLogger(FirstBDao_2.class);
	SqlSessionFactory sqlSessionFactory =null;
	MyBatisCommonFactory mcf = null;
	int result = 0;
	public FirstBDao_2() {
		mcf = new MyBatisCommonFactory();
		sqlSessionFactory = mcf.getSqlSessionFactory();
	}
	public List<Map<String, Object>> posting_list(Map<String, Object> pMap) {
		logger.info("posting_list 호출성공");
		List<Map<String,Object>> FBList = null;
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			FBList = sqlSession.selectList(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트를 할 경우 오라클 서버의 세션이 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야함.
			//주의해야한다. 
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return FBList;
	}
	
	public List<Map<String, Object>> posting_detail(Map<String, Object> pMap) {
		logger.info("posting_detail 호출성공");
		List<Map<String,Object>> FBList = null;
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			FBList = sqlSession.selectList(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return FBList;
	}
	
	public int posting_write(Map<String, Object> pMap) {
		logger.info("posting_write 호출성공");
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
	
	public int posting_modi(Map<String, Object> pMap) {
		logger.info("posting_modi 호출성공");
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
	
	public int posting_del(Map<String, Object> pMap) {
		logger.info("posting_del 호출성공");
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
}
