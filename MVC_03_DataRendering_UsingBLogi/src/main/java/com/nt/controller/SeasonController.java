package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.Seasons;

@Controller
public class SeasonController {
	
	@Autowired
	private Seasons service;
	
	@RequestMapping("/")
	public String showHome() {
		
		
		return"welcome";
		
	}
	@RequestMapping("/season")
	public String Showseasons(Model model) {
		String msg=service.getSeason();
		model.addAttribute("msg", msg);
		
		return"season";
		
	}

}
