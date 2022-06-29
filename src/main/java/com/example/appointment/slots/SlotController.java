package com.example.appointment.slots;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlotController {

	@Autowired 
	SlotServices slotServices;
	
	 @GetMapping("/get-slots/{duration}")
	    public ResponseEntity<List<Slot>> getSlots(@PathVariable Integer duration , @RequestParam("dateTime") 
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)  LocalDate date) {
	        List<Slot> response = slotServices.getSlots(duration,date);

	        return new ResponseEntity<>(response, HttpStatus.OK);

	    }
	
}
