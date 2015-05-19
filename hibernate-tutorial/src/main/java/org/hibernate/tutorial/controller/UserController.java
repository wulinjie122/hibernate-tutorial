package org.hibernate.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/handle41")
	public String handle41(@RequestBody String requestBody){
		System.out.println(requestBody);
		return "success";
	}

}
