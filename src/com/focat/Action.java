package com.focat;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	public ModelAndView excute(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException;
}
