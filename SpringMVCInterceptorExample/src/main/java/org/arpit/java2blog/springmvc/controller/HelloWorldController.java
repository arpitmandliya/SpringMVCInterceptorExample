package org.arpit.java2blog.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
 
	@RequestMapping("/helloworld")
	public ModelAndView hello() {
 
		return new ModelAndView("hello");
	}
}
