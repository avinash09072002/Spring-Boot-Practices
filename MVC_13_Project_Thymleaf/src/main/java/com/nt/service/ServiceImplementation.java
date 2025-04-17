package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.Employee;
import com.nt.repository.IEmployeeRepo;


@Service
public class ServiceImplementation implements IService {
	
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public List<Employee> showAllEmployee() {
	    List<Employee> employees = repo.findAll();
	    
	    if (employees.isEmpty()) {
	        throw new RuntimeException("No employees found in the database.");
	    }
	    
	    return employees;
	}
	@Override
	public Employee fetchEmployeebyId(int no) {
	    Optional<Employee> opt = repo.findById(no);
	    
	    if (opt.isPresent()) {
	        return opt.get();
	    } else {
	        throw new IllegalArgumentException("Employee with ID " + no + " not found.");
	    }
	}
@Override
public Employee saveEmployee(Employee employee) {
	// TODO Auto-generated method stub
	return repo.save(employee);
}
@Override
public void deleteEmpbyId(int id) {
	
	repo.deleteById(id);
}



} 
