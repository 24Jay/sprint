package edu.zju.sprint.di.xmlConfig;

import edu.zju.sprint.di.CD;
import edu.zju.sprint.di.MediaPlayer;

public class EasonPlayer implements MediaPlayer
{
	private CD cd;
	
	public EasonPlayer(CD cd)
	{
		this.cd = cd;
	}

}
