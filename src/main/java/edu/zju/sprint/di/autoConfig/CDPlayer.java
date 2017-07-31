package edu.zju.sprint.di.autoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zju.sprint.di.CD;
import edu.zju.sprint.di.MediaPlayer;


@Component
public class CDPlayer implements MediaPlayer
{
	@Autowired
	private CD cd;

	//@Autowired
/*	public CDPlayer(CD cd)
	{
		this.cd = cd;
	}*/
	
	@Autowired
	public void setCD(CD cd)
	{
		this.cd = cd;
	}


	public CD getCd()
	{
		return cd;
	}


	
	

}
