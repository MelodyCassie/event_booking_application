package com.eventbooking.EventBooking.data.repository;

import com.eventbooking.EventBooking.data.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo  extends JpaRepository<Event,Long> {

}
