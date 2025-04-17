package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.document.Address;
import com.nt.document.Employee;
import com.nt.service.IServiceManagement;

@Controller
public class EmployeeController {
	
	@Autowired
	private IServiceManagement service;
	
	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	@GetMapping("/show")
	public String showEmployee(Map<String, Object>map) {
		
		List<Employee>employees=service.fetchAllRecord();
		map.put("employee", employees);
		
		return"EmployeeRecord";
	}
	
	@GetMapping("/addEmp")
	public String AddEmployee(@ModelAttribute("employee") Employee employee,
			                   @ModelAttribute("address")Address address) {
		
		return"EmployeeRegister";
	}
	
	@PostMapping("/addEmp")
	public String RegisterEmployee(@ModelAttribute("employee")Employee employee) {
		
		       Employee employee2=service.saveEmployee(employee);
		
		return "redirect:/show";
	}

}
