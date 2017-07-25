package edu.zju.sprint.mvc.exception;

public class SpringException extends RuntimeException
{
	private String msg;

	public SpringException(String s)
	{
		this.msg = s;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

}
