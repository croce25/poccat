package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;


public class MemberDao_1 {
	Logger logger = Logger.getLogger(MemberDao_1.class);
	SqlSessionFactory sqlSessionFactory =null;
	MyBatisCommonFactory mcf = null;
	int result = 0;
	public MemberDao_1() {
		mcf = new MyBatisCommonFactory();
		sqlSessionFactory = mcf.getSqlSessionFactory();
	}
//////////////////////////////[[회원정보 시작]]//////////////////////////////
	public List<Map<String, Object>> member_login(Map<String, Object> pMap) {
		logger.info("member_login 호출성공");
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
	
	public List<Map<String, Object>> member_id_check(Map<String, Object> pMap) {
		logger.info("member_id_check 호출성공");
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
	
	public int member_join(Map<String, Object> pMap) {
		logger.info("member_join 호출성공");
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
	
	public int member_modi(Map<String, Object> pMap) {
		logger.info("member_modi 호출성공");
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
	
	public int member_del(Map<String, Object> pMap) {
		logger.info("member_del 호출성공");
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
//////////////////////////////[[회원정보 끝]]//////////////////////////////
	
//////////////////////////////[[친구-회원 시작]]//////////////////////////////
	public List<Map<String, Object>> friend_member_list(Map<String, Object> pMap) {
		logger.info("friend_member_list 호출성공");
		List<Map<String,Object>> memList = null;
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			memList = sqlSession.selectList(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return memList;
	}
	
	public int friend_member_add(Map<String, Object> pMap) {
		logger.info("friend_member_add 호출성공");
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
	
	public int friend_member_del(Map<String, Object> pMap) {
		logger.info("friend_member_del 호출성공");
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
//////////////////////////////[[친구-회원 끝]]//////////////////////////////
}
