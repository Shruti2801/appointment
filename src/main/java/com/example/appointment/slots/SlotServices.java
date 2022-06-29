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
import org.springframework.stereotype.Service;



@Service
public class SlotServices {
	
	@Autowired
	Repo repo;
	@Value("${slot.time.monday}")
	private String mon;
	@Value("${slot.time.tuesday}")
	private String tue;
	
	 private static final Logger logger = LoggerFactory.getLogger(SlotServices.class);
	 
	 
	public List<Slot> getSlots(Integer duration, LocalDate date) {
		List<Slot> slots = new ArrayList<>();
		System.out.println(mon);
		
		
		int day = date.getDayOfWeek().getValue();
		String dayto = getDay(day);
		String[] timeslots = dayto.split(",");
		
		for(String timeslot : timeslots) {
			String[] t = timeslot.split("-");
		
		
		 LocalTime time = LocalTime.parse(t[0].strip()); 
		 LocalTime time1 = LocalTime.parse(t[1].strip());  
		
		 
		while(time.compareTo(time1) < 0) {
		Slot slot = new Slot();
		slot.setStartTime(time);
		time = time.plusMinutes(duration); 
		
		slot.setEndTime(time);
		slot.setDuration(duration);
		
		slots.add(slot);
		}
		}
		
		return slots;
	}


	private String getDay(int day) {
//		if(day==0)
//			return sun;
		if(day==1)
			return mon;
		if(day==2)
			return tue;
		return null;
	}
	
	

}
