package com.example.appointment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;


public class abc {
	@Value("${slot.time.monday}")
	private static String mon;
	
	public static void main(String[] args) {
		
		System.out.println(mon);
		  LocalDate date = LocalDate.now();    

		List<LocalDateTime> list = new ArrayList<>();
		 LocalDateTime datetime1 = LocalDateTime.of(date.getYear(), date.getMonth(), date.getDayOfMonth(), 9, 00);
		 LocalDateTime datetime2 = LocalDateTime.of(date.getYear(), date.getMonth(), date.getDayOfMonth(), 20, 00);;

		 LocalTime time = LocalTime.of(9,00); 
		 LocalTime time1 = LocalTime.of(20,00);  
		 
		while(time.compareTo(time1) < 0) {
			
		System.out.println(time + "-"+ time.plusMinutes(30));	
			
		time = time.plusMinutes(30); 
		  
		}
	}
	
	

}