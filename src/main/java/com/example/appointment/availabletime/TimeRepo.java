package com.example.appointment.availabletime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appointment.slots.Slot;

public interface TimeRepo extends JpaRepository< TimeAvailable , Integer >{

}
