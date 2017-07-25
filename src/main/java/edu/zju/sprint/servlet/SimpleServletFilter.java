package edu.zju.sprint.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Ref : http://tutorials.jenkov.com/java-servlets/servlet-filters.html
 * 
 * @author jay
 *
 */
public class SimpleServletFilter implements Filter
{

	public void init(FilterConfig filterConfig) throws ServletException
	{
		// TODO Auto-generated method stub

	}

	/**
	 * you can configure your filter in the web.xml in which the class to
	 * filtered is setted
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		// TODO Auto-generated method stub

	}

	public void destroy()
	{
		// TODO Auto-generated method stub

	}

}
