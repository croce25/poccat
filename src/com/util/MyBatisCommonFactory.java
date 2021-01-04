package com.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//공통팀에서 하는 작업임.
public class MyBatisCommonFactory {
	//선언부
	//xml문서로 부터 객체를 주입받아야 하니까 절대로 단독으로 인스턴스화 하면 안됨.
	public SqlSessionFactory sqlSessionFactory = null;
	
	//오라클 서버에 요청할 때(DML)
	//SqlSessionFactory와 의존관계에 있다.
	public SqlSession sqlSession = null;
	//생성자
	
	//초기화
	public void init() {
		try {
// MapperConfig.xml 문서에서 오라클 서버에 대한 정보를 스캔
//물리적으로 떨어져 있는 오라클과 연결통로를 확보하는데 필요한 클래스는 무엇일까요? - SqlSessionFactory
//SqlSessionFactory와 SqlSession중 어느 클래스를 먼저 인스턴스화 해야 할까요? - SqlSession
//의존 관계의 의미를 잘모르겠다?
//SqlSessionFactory, SqlSession 둘 모두 단독으로는 쓰일 수 없다??(의존관계)
			String resource = "oracle/mybatis/Configuration.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			System.out.println("SqlSessionFactory(SqlSessionFactoryBean)"+sqlSessionFactory);	 
			 
		} catch (FileNotFoundException fe) {
			System.out.println("Exception : "+fe.getMessage());
		} catch (IOException ie) {
			System.out.println("Exception : "+ie.getMessage());
		
		} catch (Exception e) {
		System.out.println("Exception : "+e.getMessage());
		}
	}
		//싱글톤 패턴으로 개발을 전개해야 할 때는 메소드로 객체 주입 받도록 한다.
	
	public SqlSessionFactory getSqlSessionFactory() {
		init();//객체 생성이 일어남
		return sqlSessionFactory;
	}
}
