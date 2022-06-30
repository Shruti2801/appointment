package com.example.appointment.availabletime;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TimeServices {
	
	@Autowired
	TimeRepo timeRepo;

	public List<TimeAvailable> addAvailableTime(List<TimeAvailable> availableTimes) {
		List<TimeAvailable> output =new ArrayList<>();
		for(TimeAvailable availableTime : availableTimes) {
			TimeAvailable new1 = new TimeAvailable();
			new1.setDayName(availableTime.getDayName());
			new1.setStartTime(availableTime.getStartTime());
			new1.setEndTime(availableTime.getEndTime());
			
			timeRepo.save(new1);
			output.add(new1);
		}
		
		return output;
	}

	public List<TimeAvailable> getAll() {
		
		List<TimeAvailable> availableTimes = timeRepo.findAll();
		
		return availableTimes;
	}

}
