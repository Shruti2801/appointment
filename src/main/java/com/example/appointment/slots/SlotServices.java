package com.example.appointment.slots;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Service
public class SlotServices {
	
	@Autowired(required=true)
	private Repo repo;
	
	@Value("${slot.time.monday}")
	private String mon;
	@Value("${slot.time.tuesday}")
	private String tue;
	@Value("${slot.time.wednesday}")
	private String wed;
	@Value("${slot.time.thursday}")
	private String thur;
	@Value("${slot.time.friday}")
	private String fri;
	@Value("${slot.time.saturday}")
	private String sat;
	@Value("${slot.time.sunday}")
	private String sun;
	
	 private static final Logger logger = LoggerFactory.getLogger(SlotServices.class);
	 
	 
	public List<Slot> getSlots(Integer duration, LocalDate date) {
		List<Slot> slots = new ArrayList<>();
		System.out.println(mon);
		
		int day = date.getDayOfWeek().getValue();
		String dayto = getDay(day);
		String[] timeslots = dayto.split(",");
		
		for(String timeslot : timeslots) {
			String[] t = timeslot.split("-");
		
		
		 LocalTime startTime = LocalTime.parse(t[0].strip()); 
		 LocalTime endTime = LocalTime.parse(t[1].strip());  
		
		 
		while(startTime.compareTo(endTime) < 0) {
		Slot slot = new Slot();
		LocalTime newTime = startTime.plusMinutes(duration);
		if(newTime.compareTo(endTime) > 0)
			break;
		slot.setStartTime(startTime);
		slot.setEndTime(newTime);
		slot.setDuration(duration);
		
		startTime = startTime.plusMinutes(duration); 
		slots.add(slot);
		}
		}
		
		return slots;
	}


	private String getDay(int day) {
		if(day==0)
			return sun;
		if(day==1)
			return mon;
		if(day==2)
			return tue;
		if(day==3)
			return wed;
		if(day==4)
			return thur;
		if(day==5)
			return fri;
		if(day==6)
			return sat;
		
		return null;
		
	}
	
	

}
