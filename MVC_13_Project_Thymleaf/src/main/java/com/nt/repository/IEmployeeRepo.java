package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
