package edu.zju.sprint.di.autoConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zju.sprint.di.CD;
import junit.framework.TestCase;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AutoPlayerConfig.class)
public class SgtPeppersTest extends TestCase
{

	@Autowired
	private CD cd;
	
	
	@Test
	public void cdNotNull()
	{
		assertNotNull(cd);
	}

}
