package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.document.Teacher;
import com.nt.service.ITeacherService;

@Controller
public class TeacherController {
	
	@Autowired
	private ITeacherService service;
	
	
	@GetMapping("/")
	public String showHome() {
		
		return "Home";
	}
   
	@GetMapping("/show")
	
	public String showTeacherData(Model model) {
		List<Teacher> teachers=service.showTeacher();
		model.addAttribute("teachers", teachers);
		return "teachersData";
	}
	
	@GetMapping("/register")
	public String showRegistratioinPage(Model model) {
	    model.addAttribute("teacher", new Teacher());  // <-- add this line
	    return "registration";
	}
	
	@PostMapping("/register")
	public String RegisterTeacher(@ModelAttribute("teacher")Teacher teacher, Model model, RedirectAttributes attributes) {
		
		Teacher teacher2=service.saveTeacher(teacher);
		attributes.addFlashAttribute("msg", "registered successfully");
		
		return "redirect:/";
	}
}
