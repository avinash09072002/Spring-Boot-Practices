package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataRenderingOperations {
	
	@RequestMapping("/")
	public String dataRendering(Map<String, Object> map) {
		map.put("favColors", new String[] {"red", "yellow"});
		map.put("friends", List.of("ranjest", "ritesh", "rahul")); // Corrected 'frinds' to 'friends'
		map.put("phno", Set.of(23333L, 3322L, 33333L)); // Added 'L' to make them Long literals
		
		return "data";
	}
}
