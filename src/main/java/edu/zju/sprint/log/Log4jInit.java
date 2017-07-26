package edu.zju.sprint.log;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/***
 * 余下待处理问题，如何去处理日志写入权限，因为暂时需要先在/var/log目录下创建相应的文件，然后写入日志
 * @author jay
 *
 */
public class Log4jInit extends HttpServlet
{
	private String path = "";

	private static final Logger LOGGER = LoggerFactory.getLogger(Log4jInit.class);

	@Override
	public void init() throws ServletException
	{
		super.init();
		String prefix = getServletContext().getRealPath("/");
		String file = getInitParameter("log4j-init-file");
		path = prefix + file;
		LOGGER.info("Init log4jInit servlet!");
		PropertyConfigurator.configure(path);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		LOGGER.info("Test GET foR Log4jInit servlet!-------");
		resp.getWriter()
				.write("<html><h2>log4j.properties path -----: </h2><body>" + path + "</body></hmtl>");
	}
}
