package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;

public class SecondBDao_1 {
	Logger logger = Logger.getLogger(SecondBDao_1.class);
	SqlSessionFactory sqlSessionFactory =null;
	MyBatisCommonFactory mcf = null;
	int result = 0;
	public SecondBDao_1() {
		mcf = new MyBatisCommonFactory();
		sqlSessionFactory = mcf.getSqlSessionFactory();
	}
////////////////////////////////////////자원봉사 공고 시작 /////////////////////////////////////
	public List<Map<String, Object>> volunteer_noti_list(Map<String, Object> pMap) {
		logger.info("swDesignExam 호출성공");
		List<Map<String,Object>> SBList = null;
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			SBList = sqlSession.selectList(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트를 할 경우 오라클 서버의 세션이 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야함.
			//주의해야한다. 
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return SBList;
	}
	public List<Map<String, Object>> volunteer_noti_detail(Map<String, Object> pMap) {
		logger.info("swDesignExam 호출성공");
		List<Map<String,Object>> SBList = null;
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			SBList = sqlSession.selectList(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return SBList;
	}
	
	public int volunteer_noti_write(Map<String, Object> pMap) {
		logger.info(" 호출성공");
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
	
	public int volunteer_noti_modi(Map<String, Object> pMap) {
		logger.info(" 호출성공");
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
	
	public int volunteer_noti_del(Map<String, Object> pMap) {
		logger.info(" 호출성공");
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
////////////////////////////////////////자원봉사 공고 종료 /////////////////////////////////////

////////////////////////////////////////자원봉사 신청  시작/////////////////////////////////////
	public List<Map<String, Object>> volunteer_apply_check(Map<String, Object> pMap) {
		logger.info("swDesignExam 호출성공");
		List<Map<String,Object>> SBList = null;
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			SBList = sqlSession.selectList(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트를 할 경우 오라클 서버의 세션이 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야함.
			//주의해야한다. 
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return SBList;
	}
	
	public int volunteer_apply_book(Map<String, Object> pMap) {
		logger.info(" 호출성공");
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
	
	public int volunteer_apply_cancel(Map<String, Object> pMap) {
		logger.info(" 호출성공");
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
////////////////////////////////////////자원봉사 신청  종료/////////////////////////////////////

////////////////////////////////////////게시판(통합) 시작/////////////////////////////////////
	public List<Map<String, Object>> common_board_list(Map<String, Object> pMap) {
		logger.info("swDesignExam 호출성공");
		List<Map<String,Object>> SBList = null;
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			SBList = sqlSession.selectList(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//아래 코드를 하지 않고 테스트를 할 경우 오라클 서버의 세션이 갯수가 풀로 차게 되어서 오라클 서버를 재기동해야함.
			//주의해야한다. 
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return SBList;
	}
	public List<Map<String, Object>> common_board_detail(Map<String, Object> pMap) {
		logger.info("swDesignExam 호출성공");
		List<Map<String,Object>> SBList = null;
		SqlSession sqlSession = null;
		try {
			sqlSession = sqlSessionFactory.openSession();
			SBList = sqlSession.selectList(" ",pMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return SBList;
	}
	
	public int common_board_write(Map<String, Object> pMap) {
		logger.info(" 호출성공");
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
	
	public int common_board_modi(Map<String, Object> pMap) {
		logger.info(" 호출성공");
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
	
	public int common_board_del(Map<String, Object> pMap) {
		logger.info(" 호출성공");
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
