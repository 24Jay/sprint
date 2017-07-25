package edu.zju.sprint.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController
{

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model)
	{
		model.addAttribute("message", "Hello, Spring Mvc FrameWork!");
		return "hello";
	}

}
