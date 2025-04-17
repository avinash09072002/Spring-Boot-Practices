package com.nt.Entity;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    
    @Id
    @SequenceGenerator(name = "employee_seq", sequenceName = "employee_seq", initialValue = 22, allocationSize = 1)
   @GeneratedValue(generator = "employee_seq" ,strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    private String name;
    
    private Double salary;
    
    private String depart="it";
    
	/*
	 * @Column(name = "hire_date")
	 * 
	 * @Temporal(TemporalType.DATE)
	 * 
	 * @DateTimeFormat(pattern = "MM-dd-yyyy") // Use the desired format here
	 * private Date hiredate=new Date();
	 */

}
