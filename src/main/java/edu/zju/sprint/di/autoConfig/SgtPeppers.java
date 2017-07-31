package edu.zju.sprint.di.autoConfig;

import org.springframework.stereotype.Component;

import edu.zju.sprint.di.CD;

@Component
public class SgtPeppers implements CD
{
	private String title = "Sgt.Pepper's lonely hearts club band";

	private String artist = "The Beatles";

	public  String play()
	{
		return ("Playing " + title + " by " + artist);
	}


}
