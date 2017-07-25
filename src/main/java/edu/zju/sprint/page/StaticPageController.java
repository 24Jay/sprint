package edu.zju.sprint.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticPageController
{

	@RequestMapping(value = "/staticHome", method = RequestMethod.GET)
	public String staticHome()
	{
		return "staticHome";
	}

	@RequestMapping(value = "/finalStatic", method = RequestMethod.GET)
	public String redirect()
	{
		return "redirect:/page/finalStatic.html";
	}

}
