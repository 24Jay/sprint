package edu.zju.sprint.mvc.reqParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/param")
public class RequestParameterController
{
	@RequestMapping(method=RequestMethod.GET)
	public String query(@RequestParam("id") int id)
	{
		return "useid="+id;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String path(@PathVariable("id") int id)
	{
		return "pathvariable#"+id;
	}
	
	
	
}
