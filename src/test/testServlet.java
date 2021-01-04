package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("*.ssg")
public class testServlet extends HttpServlet {
	Logger logger = Logger.getLogger(testServlet.class);
	 MultipartRequest multi = null;
	public void doService(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
					logger.info("doService호출 성공");
					ServletContext context = getServletContext();
					//String saveDir = context.getRealPath("/UpLoad");
					String saveDir = req.getSession().getServletContext().getRealPath("/UpLoad");
					
					logger.info(saveDir);
					 Map<String, Object> target = new HashMap<>();
					      int maxSize =  3 * 1024 * 1024;//3MB
					      String encoding = "UTF-8";
					      boolean isMulti = ServletFileUpload.isMultipartContent(req);//boolean타입. ??????
				          if(isMulti) {
				                System.out.println("파일전송 Form입니다");
				                try {
									multi = new MultipartRequest(req, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
									 logger.info("체크포인트1");
									Enumeration<String> en = multi.getParameterNames();
									logger.info("체크포인트2");
									while(en.hasMoreElements()) {//hasMoreElement는 boolean타입 메서드
					      	    	    String name = (String) en.nextElement();
					      	    	    logger.info(name);
					      				String[] values = multi.getParameterValues(name);		
					      				for (String value : values) {
					      					target.put(name,value);
					      					 logger.info(value);
					      				}   
					      	      }
									logger.info("체크포인트3");
									Enumeration<String> files = multi.getFileNames();//form태그안에 속성이 file인 input태그의 name값을 가져온다.
									logger.info("체크포인트4");
									while(files.hasMoreElements()) {//hasMoreElement는 boolean타입 메서드
										String name = files.nextElement();
										logger.info("체크포인트5"+name);
					      				String file = multi.getFilesystemName(name);//서버상에 실제로 저장된 파일이름.		
					      				target.put(name, "/forcat/UpLoad/"+file);
										}
				                } catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
				          }else {
				                System.out.println("일반전송 Form입니다");
				                Enumeration<String> en = req.getParameterNames();//getParameter로 받아오는 값의 리턴타입은 String이므로 Enumeration의 타입도 String으로 한다.
				      	      while(en.hasMoreElements()) {//hasMoreElement는 boolean타입 메서드
				      	    	    String name = (String) en.nextElement();
				      				String[] values = req.getParameterValues(name);		
				      				for (String value : values) {
				      					target.put(name,value);
				      				}   
				      	      }
				          }
				          //PrintWriter out = res.getWriter();
				          //out.print(target);
				          req.setAttribute("rmap", target);
				          RequestDispatcher view = req.getRequestDispatcher("/UpLoadResult.jsp");
							view.forward(req, res);
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
