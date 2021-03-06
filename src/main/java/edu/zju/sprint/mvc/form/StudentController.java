package edu.zju.sprint.mvc.form;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.zju.sprint.mvc.exception.SpringException;

@Controller
public class StudentController
{

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student()
	{
		LOGGER.info("StudentController student()");
		return new ModelAndView("student", "command", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	@ExceptionHandler(
		{ SpringException.class })
	public String addStudent(@ModelAttribute("springWeb") Student student, Model model)
	{
		if (student.getName().length() < 5)
			throw new SpringException("Given name is too short!");
		model.addAttribute("name", student.getName());

		if (student.getAge() < 10)
			throw new SpringException("Given age is too low!");

		model.addAttribute("id", student.getId());
		return "result";

	}

}
