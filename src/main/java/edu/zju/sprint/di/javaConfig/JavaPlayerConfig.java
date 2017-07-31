package edu.zju.sprint.di.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import edu.zju.sprint.di.CD;

@Configuration
//@PropertySource("...")
public class JavaPlayerConfig
{
	@Autowired
	Environment env;
	
	
	private JayCD cd;
/*	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public JayCD create()
	{
		return new JayCD();
	}
	*/
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public JayPlayer aPlayer()
	{
		return new JayPlayer(cd);
	}
}
