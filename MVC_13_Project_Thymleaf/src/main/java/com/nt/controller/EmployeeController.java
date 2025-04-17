package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.Entity.Employee;
import com.nt.service.IService;

@Controller
public class EmployeeController {
    @Autowired
    private IService service;

    @GetMapping("/")
    public String showHome() {
        return "home";
    }

    @GetMapping("/report")
    public String showReport(Map<String, Object> map, @ModelAttribute("employee") Employee employee) {
        List<Employee> empList = service.showAllEmployee();
        map.put("empList", empList);
        return "empReport";
    }

    @GetMapping("/edit")
    public String showEditPage(@RequestParam("no") int no, Map<String, Object> map) {
        Employee employee2 = service.fetchEmployeebyId(no);
        if (employee2 == null) {
            throw new IllegalArgumentException("Employee not found with ID: " + no);
        }
        System.out.println("Editing Employee: " + employee2);
        map.put("employee", employee2);
        return "emp_edit";
    }


    @PostMapping("/edit")
    public String showEdits(@ModelAttribute("employee") Employee employee) {
        service.saveEmployee(employee);
        return "redirect:/report"; // Redirect to the report page after saving
    }
    
    @RequestMapping("/delete")
    public String deleteEmployee(@RequestParam("no")int id, Map<String, Object>map) {
    	try {
			service.deleteEmpbyId(id);
		} catch (Exception e) {
          e.printStackTrace();
		}
    	
    	return"redirect:/report";
    }
    
    
    @GetMapping("/add")
    public String showAddPage(@ModelAttribute("employee") Employee employee) {
        return "addPage";
    }

    @PostMapping("/add")
    public String AddingEmployee(@ModelAttribute("employee") Employee employee, Map<String, Object> map) {
        Employee savedEmployee = service.saveEmployee(employee);
        return "redirect:/report";
    }
}