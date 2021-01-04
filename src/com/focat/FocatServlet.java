package com.focat;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;



public class FocatServlet extends HttpServlet {
	Logger logger = Logger.getLogger(FocatServlet.class);
	Action action = null;
	ModelAndView mav = null;
	String command = null;
	
	public void init(ServletConfig config) throws ServletException{
		//해당 서블릿의 초기화를 담당한다. 
		//예를 들면 오라클 서버의 물리적인 정보들? DataSource, Connection 물리기 위한 사전 정보들 초기화작업
		logger.info("init 호출성공");
	}
	
	public void doService(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{
			logger.info("doService호출 성공");
			ServletContext context = getServletContext();
			String saveDir = req.getSession().getServletContext().getRealPath("/UpLoad");
			String url = req.getRequestURI();
			String path = req.getContextPath();
			command = url.substring(path.length()+1,url.lastIndexOf("."));
			logger.info("url : "+url);
			logger.info("path : "+path);
			logger.info("command : "+command);
			action = ControllerMapper.getController(command,saveDir);
			mav = action.excute(req, res);
			if(mav.isRedirect==false) {
				System.out.println(mav.viewName);
				RequestDispatcher view = mav.req.getRequestDispatcher("/WEB-INF/views/"+mav.viewName);
				view.forward(req, res);
			}else {
				res.sendRedirect("/WEB-INF/views/"+mav.viewName);
			}
					
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{
			logger.info("doGet호출 성공");
			doService(req,res);	
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{
			logger.info("doPost호출 성공");
			doService(req,res);	
	}
}
