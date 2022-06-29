package com.example.appointment.slots;



import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Table(name= "slot")
public class Slot {
	
	  @Id
	    @Column(name = "id", nullable = false)
	    private int id;
	  
	    @Column(name = "startTime")
	    private LocalTime startTime;
	    @Column(name = "endTime")
	    private LocalTime endTime;
	    @Column(name = "duration")
	    private Integer duration;
		
		
	    

}
