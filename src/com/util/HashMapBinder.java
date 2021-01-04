package com.util;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class HashMapBinder {
		
	  public HttpServletRequest req = null;
	  MultipartRequest multi = null;
	  String saveDir = null;
	  
	   public HashMapBinder() {//디폴트생성자
	      
	   }
	   
	   public HashMapBinder(HttpServletRequest req, String saveDir) {
	      this.req = req;//원본을 사용해야한다.   서블릿에서 인스턴스화   
	      this.saveDir = saveDir; //서블릿에서 받아온 파일저장경로
	      
	   }
	   
	   public void bind(Map<String, Object> target) {
	      target.clear();
	     
	      int maxSize =  3 * 1024 * 1024;//3MB
	      String encoding = "UTF-8";
	      boolean isMulti = ServletFileUpload.isMultipartContent(req);//boolean타입. ??????
          if(isMulti) {
                System.out.println("파일전송 Form입니다");
                try {
					multi = new MultipartRequest(req, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
					Enumeration<String> en = multi.getParameterNames();
					while(en.hasMoreElements()) {//hasMoreElement는 boolean타입 메서드
	      	    	    String name = (String) en.nextElement();
	      				String[] values = multi.getParameterValues(name);		
	      				for (String value : values) {
	      					target.put(name,value);
	      				}   
	      	      }
					Enumeration<String> files = multi.getFileNames();//form태그안에 속성이 file인 input태그의 name값을 가져온다.
					while(files.hasMoreElements()) {//hasMoreElement는 boolean타입 메서드
	      	    	    String name = (String) files.nextElement();
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
	     
	   }
}
