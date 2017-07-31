package edu.zju.sprint.di.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zju.sprint.di.CD;

public class JayPlayer
{

	private CD cd;
	
	@Autowired
	public JayPlayer(CD cd)
	{
		this.cd = cd;
	}

	public CD getCd()
	{
		return cd;
	}

	public void setCd(CD cd)
	{
		this.cd = cd;
	}
	
	
	
	
}
