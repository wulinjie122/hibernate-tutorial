package org.hibernate.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/helloworld")
	public String helloWorld(Model model) {
		model.addAttribute("message", "Hello World!");
		//FileCopyUtils.co
		return "helloworld/index";
	}

}
