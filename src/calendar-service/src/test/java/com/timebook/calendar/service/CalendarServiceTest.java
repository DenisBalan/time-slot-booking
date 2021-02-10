package com.timebook.calendar.service;

import com.timebook.calendar.domain.CalendarTimeSlot;
import com.timebook.calendar.domain.RangeTimeSlot;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CalendarServiceTest {

    @Autowired
    CalendarService calendarService;

    @Test
    public void createRows()
    {
        calendarService.save(new CalendarTimeSlot(0,0,0, new RangeTimeSlot(10,2,2021,16,5,16,45)));
        calendarService.save(new CalendarTimeSlot(1,0,1, new RangeTimeSlot(11,2,2021,17,5,17,19)));
        calendarService.save(new CalendarTimeSlot(2,1,1, new RangeTimeSlot(11,2,2021,10,5,11,0)));
        calendarService.save(new CalendarTimeSlot(3,1,2, new RangeTimeSlot(10,2,2021,8,5,9,0)));

        calendarService.findAll().forEach(System.out::println);
    }

}