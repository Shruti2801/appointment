package com.example.appointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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
