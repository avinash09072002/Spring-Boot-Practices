package com.nt.service;

import java.util.List;

import com.nt.Entity.Employee;

public interface IService {
	
     public List<Employee> showAllEmployee();
     
     public Employee fetchEmployeebyId(int no);
     
     public Employee saveEmployee(Employee employee);
     
     public void deleteEmpbyId(int id);
}
