package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowingHomePage {
	
	@RequestMapping("/home")
	public String displayHomepage() {
		
		//return the logical view name
		return "welcome";
	}

}
