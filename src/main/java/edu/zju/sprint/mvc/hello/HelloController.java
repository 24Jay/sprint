package edu.zju.sprint.mvc.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController
{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model)
	{
		
		LOGGER.info("HelloController printHello()");
		model.addAttribute("message", "Hello, Spring Mvc FrameWork!");
		return "hello";
	}

}
