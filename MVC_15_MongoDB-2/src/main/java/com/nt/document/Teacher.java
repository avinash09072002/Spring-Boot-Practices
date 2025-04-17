package com.nt.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Teacher {
	
	@Id
	private String tid;
	
	private String name;
	
	private Address address;

}
