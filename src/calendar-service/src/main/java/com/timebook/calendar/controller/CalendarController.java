package com.timebook.calendar.controller;

import com.timebook.calendar.domain.CalendarTimeSlot;
import com.timebook.calendar.repository.CalendarTimeSlotRepository;
import com.timebook.calendar.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="/calendar/api/v1")
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @GetMapping(path = "/all")
    public List<CalendarTimeSlot> getAllCalendarTimeSlots()
    {
        return calendarService.findAll();
    }

    @PostMapping(path="/add")
    public String saveCalendarTimeSlot(@RequestBody CalendarTimeSlot calendarTimeSlot)
    {
        calendarService.save(calendarTimeSlot);
        return "Done";
    }

    @DeleteMapping(path="/delete/{id}")
    public String deleteCalendarTimeSlot(@PathVariable long id)
    {
        calendarService.deleteById(id);
        return "Done";
    }

    @GetMapping(path="/get_by_user_id/{userId}")
    public List<CalendarTimeSlot> getCalendarTimeSlotsByUserId(@PathVariable long userId)
    {
        return calendarService.findByUserId(userId);
    }

}
