package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/")
	public ModelAndView hello(ModelAndView mv) {
		mv.addObject("msg", "hello to spring mvc");
		System.out.println("hello....");
		mv.setViewName("hello");
		return mv;
	}
}
