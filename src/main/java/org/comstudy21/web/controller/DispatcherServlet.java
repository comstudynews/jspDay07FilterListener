package org.comstudy21.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.comstudy21.web.listener.SessionListener;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext context;
	PrintWriter out;
	HttpSession session;

	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		session = request.getSession();
		
		context.log(">>>> doGet - DispatcherServlet");

		out = response.getWriter();
		out.println("<h1>컴스터디 웹앱 실행</h1>");
		out.println("<p>현재 실행 세션 : " + SessionListener.getActiveSessions()+"</p>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		context.log(">>>> doPost - DispatcherServlet");
	}
}
