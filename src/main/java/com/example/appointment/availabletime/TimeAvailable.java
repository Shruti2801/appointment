package com.example.appointment.availabletime;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name= "time_available")
public class TimeAvailable {
	  @Id
	    @Column(name = "id", nullable = false)
	   @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	  
	    @Column(name = "startTime")
	    @JsonFormat(pattern="HH:mm")
	    private LocalTime startTime;
	    @Column(name = "endTime")
	    @JsonFormat(pattern="HH:mm")
	    private LocalTime endTime;
	    @Column(name = "dayname")
	    private String dayName;
}
