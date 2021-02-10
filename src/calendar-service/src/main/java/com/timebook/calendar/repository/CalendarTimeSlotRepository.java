package com.timebook.calendar.repository;

import com.timebook.calendar.domain.CalendarTimeSlot;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CalendarTimeSlotRepository extends MongoRepository<CalendarTimeSlot,Long> {
    
}
