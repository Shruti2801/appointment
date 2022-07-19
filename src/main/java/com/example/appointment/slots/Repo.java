package com.example.appointment.slots;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Slot , Integer>{

}
