package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;


public class MemberDao_2 {
	Logger logger = Logger.getLogger(MemberDao_2.class);
	SqlSessionFactory sqlSessionFactory =null;
	MyBatisCommonFactory mcf = null;
	int result = 0;
	public MemberDao_2() {
		mcf = new MyBatisCommonFactory();
		sqlSessionFactory = mcf.getSqlSessionFactory();
	}
////////////////////////////////[[그룹 시작]]/////////////////////////////////
	public List<Map<String, Object>> group_search(Map<String, Object> pMap) {
		logger.info("group_search 호출성공");
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
	
	public int group_create(Map<String, Object> pMap) {
		logger.info("group_create 호출성공");
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
	
	public int group_change_title(Map<String, Object> pMap) {
		logger.info("group_change_title 호출성공");
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
	
	public int group_del(Map<String, Object> pMap) {
		logger.info("group_del 호출성공");
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
////////////////////////////////[[그룹 끝]]/////////////////////////////////

////////////////////////////////[[그룹 생성 및 가입 시작]]/////////////////////////
	public List<Map<String, Object>> group_mem_mygroup(Map<String, Object> pMap) {
		logger.info("group_mem_mygroup 호출성공");
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
	
	public List<Map<String, Object>> group_mem_list(Map<String, Object> pMap) {
		logger.info("group_mem_list 호출성공");
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
	
	public int group_mem_join(Map<String, Object> pMap) {
		logger.info("group_mem_join 호출성공");
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
	
//	public int memberUpdate(Map<String, Object> pMap) {
//		logger.info(" 호출성공");
//		SqlSession sqlSession = null;
//		try {
//			sqlSession = sqlSessionFactory.openSession();
//			result = sqlSession.update(" ",pMap);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if(sqlSession != null) {
//				sqlSession.close();
//			}
//		}
//		return result;
//	}
	
	public int group_mem_del(Map<String, Object> pMap) {
		logger.info("group_mem_del 호출성공");
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
////////////////////////////////[[그룹 생성 및 가입 끝]]/////////////////////////
}
