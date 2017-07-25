package edu.zju.sprint.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HPServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		super.doGet(req, resp);
		resp.getWriter().write("This is a HttpServlet GET response!");

		// redirect to other website
		resp.sendRedirect("https://github.com/24Jay");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		super.doPost(req, resp);

		/**
		 * session : stored in servlet container
		 */
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");

		/**
		 * RequestDispather
		 */
		RequestDispatcher dis = req.getRequestDispatcher("/anotherURL");
		dis.forward(req, resp);
		dis.include(req, resp);

		/**
		 * ServletContext : contains meta information for your web application
		 * attributes stored in ServletContext available for all visitors;
		 * session attributes are just available to a single user
		 */
		ServletContext context = req.getServletContext();
		ServletContext cont = req.getSession().getServletContext();

		/**
		 * Cookie : store on the client machine
		 */
		Cookie[] cookies = req.getCookies();
		Cookie mycoo = new Cookie("name", "Jay");
		mycoo.setMaxAge(24 * 60 * 60);// 24 hours
		// set 0 or -1 to delete the cookie
		mycoo.setMaxAge(0);
		resp.addCookie(mycoo);

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		super.service(req, resp);
	}

}
