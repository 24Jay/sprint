package edu.zju.sprint.mvc.page;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticPageController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(StaticPageController.class);

	@RequestMapping(value = "/staticHome", method = RequestMethod.GET)
	public String staticHome()
	{
		LOGGER.info("StaticPageController staticHome()");
		return "staticHome";
	}

	@RequestMapping(value = "/finalStatic", method = RequestMethod.GET)
	public String redirect()
	{
		return "redirect:/page/finalStatic.html";
	}

}
