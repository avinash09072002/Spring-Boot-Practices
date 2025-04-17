package com.nt.document;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Address {
	
	
	private String city;
	private String pincode;

}
