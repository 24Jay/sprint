package edu.zju.sprint.di.javaConfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaPlayerConfig.class)
public class JavaPlayerConfigTest
{
	@Autowired
	private JayPlayer player;

	
	@Autowired
	private JayCD cd;
	
	@Test
	public void test()
	{
		
		System.out.println("cd="+cd+", player.getCd()="+player.getCd());
		System.out.println("player="+player);
		assertNotNull(cd);
		assertEquals(player.getCd().play(), "Fantasy by Jay");
	}

}
