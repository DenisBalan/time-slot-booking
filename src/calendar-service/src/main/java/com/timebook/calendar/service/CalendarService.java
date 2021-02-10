package com.timebook.calendar.service;

import com.timebook.calendar.domain.CalendarTimeSlot;
import com.timebook.calendar.repository.CalendarTimeSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService {

    @Autowired
    private CalendarTimeSlotRepository calendarTimeSlotRepository;

    private final MongoTemplate mongoTemplate;

    CalendarService(MongoTemplate mongoTemplate)
    {
        this.mongoTemplate = mongoTemplate;
    }

    public void save(CalendarTimeSlot calendarTimeSlot)
    {
        calendarTimeSlotRepository.save(calendarTimeSlot);

    }

    public void deleteById(long id)
    {
        calendarTimeSlotRepository.deleteById(id);
    }

    public void delete(CalendarTimeSlot calendarTimeSlot)
    {
        calendarTimeSlotRepository.delete(calendarTimeSlot);
    }

    public List<CalendarTimeSlot> findByUserId(long userId)
    {
        Query query = new Query()
                .addCriteria(Criteria.where("userId").is(userId));

        return mongoTemplate.find(query,CalendarTimeSlot.class);
    }

    public List<CalendarTimeSlot> findAll()
    {
        return mongoTemplate.findAll(CalendarTimeSlot.class);
    }


}
