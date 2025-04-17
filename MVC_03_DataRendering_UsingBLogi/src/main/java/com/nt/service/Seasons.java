package com.nt.service;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class Seasons {

	public String getSeason() {
		
		LocalDateTime lTime=LocalDateTime.now();
		int month=lTime.getMonthValue();
		
		if(month>=1&&month<=4) {
			return"summer";
		}else {
			return "Winter";
		}
	}
}
