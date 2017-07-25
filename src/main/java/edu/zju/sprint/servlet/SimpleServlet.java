package edu.zju.sprint.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SimpleServlet extends GenericServlet
{

	@Override
	public void destroy()
	{
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init(ServletConfig config) throws ServletException
	{
		// TODO Auto-generated method stub
		super.init(config);
	}

	@Override
	public void init() throws ServletException
	{
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException
	{
		String yesOrNoParam = req.getParameter("param");

		if ("yes".equals(yesOrNoParam))
		{

			res.getWriter().write("<html><body>You said yes!</body></html>");
		}

		if ("no".equals(yesOrNoParam))
		{

			res.getWriter().write("<html><body>You said no!</body></html>");
		}
	}

}
