package com.example.appointment.availabletime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/available-time")
public class TimeController {


	@Autowired
	TimeServices timeServices;
	
	 @PostMapping("/add")
	    public ResponseEntity<List<TimeAvailable>> getSlots(@RequestBody List<TimeAvailable> timeAvailable ) {
	        List<TimeAvailable> response = timeServices.addAvailableTime(timeAvailable);

	        return new ResponseEntity<>(response, HttpStatus.OK);

	    }
	 

	 @GetMapping("/get-all")
	    public ResponseEntity<List<TimeAvailable>> getAll() {
	        List<TimeAvailable> response = timeServices.getAll();

	        return new ResponseEntity<>(response, HttpStatus.OK);

	    }
}
