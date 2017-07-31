package edu.zju.sprint.di.autoConfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoPlayerConfig.class)
public class CDPlayerTest
{
	// @Autowired
	@Autowired
	private CDPlayer player;

	@Test
	public void test()
	{
		assertNotNull(player.getCd());
//		assertEquals(player.getCd().play(),"Fantasy by Jay");
//		assertEquals(player.getCd().play(),"Playing Sgt.Pepper's lonely hearts"
//				+ " club band by The Beatles");
	}

}
