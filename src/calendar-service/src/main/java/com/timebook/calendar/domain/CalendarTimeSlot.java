package com.timebook.calendar.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "CalendarTimeSlot")
public class CalendarTimeSlot {

  @Id
  private long id;
  private long userId;
  private long serviceId;
  private RangeTimeSlot rangeTimeSlot;

}
