package edu.zju.sprint.log;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger
{
	private static final Logger LOGGER = LoggerFactory.getLogger(TestLogger.class);
	public static void main(String []ar)
	{
		BasicConfigurator.configure();
		System.out.println("Test [slf4j-log4j] for a common java application");
		LOGGER.info("A info log {}, {} !","zhangjie","hello");
		LOGGER.debug("A debug log!");
	}
}
