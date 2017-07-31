package edu.zju.sprint.di.javaConfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaPlayerConfig.class)
public class JayPlayerTest
{

	@Autowired
	private JayPlayer player;

	@Test
	public void test()
	{
		System.out.println("cd="+player.getCd());
		System.out.println("player="+player);
		assertEquals(player.getCd().play(), "Fantasy by Jay");
	}

}
