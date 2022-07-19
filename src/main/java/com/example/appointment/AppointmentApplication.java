package com.example.appointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
@ComponentScan({"com.example.appointment"})
@EnableJpaRepositories({"com.example.appointment.repository","com.example.appointment.slots"})
public class AppointmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentApplication.class, args);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static DateTime EndOfDay(this DateTime date)
//	{
//		return new DateTime(date.Year, date.Month, date.Day, 23, 59, 59, 999);
//	}
//
//	public static DateTime StartOfDay(this DateTime date)
//	{
//		return new DateTime(date.Year, date.Month, date.Day, 0, 0, 0, 0);
//	}

}
