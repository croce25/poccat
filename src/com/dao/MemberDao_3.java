package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;


public class MemberDao_3 {
	Logger logger = Logger.getLogger(MemberDao_3.class);
	SqlSessionFactory sqlSessionFactory =null;
	MyBatisCommonFactory mcf = null;
	int result = 0;
	public MemberDao_3() {
		mcf = new MyBatisCommonFactory();
		sqlSessionFactory = mcf.getSqlSessionFactory();
	}
////////////////////////////////[[그룹게시판 시작]]/////////////////////////////////
	public List<Map<String, Object>> group_board_list(Map<String, Object> pMap) {
		logger.info("group_board_list 호출성공");
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
	
	public List<Map<String, Object>> group_board_detail(Map<String, Object> pMap) {
		logger.info("group_board_detail 호출성공");
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
	
	public int group_board_write(Map<String, Object> pMap) {
		logger.info("group_board_write 호출성공");
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
	
	public int group_board_modi(Map<String, Object> pMap) {
		logger.info("group_board_modi 호출성공");
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
	
	public int group_board_del(Map<String, Object> pMap) {
		logger.info("group_board_del 호출성공");
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
////////////////////////////////[[그룹게시판 끝]]/////////////////////////////////

////////////////////////////////[[댓글(그룹게시판) 시작]]/////////////////////////
	
	public List<Map<String, Object>> group_board_cmt_list(Map<String, Object> pMap) {
		logger.info("group_board_cmt_list 호출성공");
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
	
	public int group_board_cmt_write(Map<String, Object> pMap) {
		logger.info("group_board_cmt_write 호출성공");
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
	
	public int group_board_cmt_modi(Map<String, Object> pMap) {
		logger.info("group_board_cmt_modi 호출성공");
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
	
	public int group_board_cmt_del(Map<String, Object> pMap) {
		logger.info("group_board_cmt_del 호출성공");
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
////////////////////////////////[[댓글(그룹게시판) 끝]]/////////////////////////
}
