package com.timebook.calendar.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RangeTimeSlot {
    private int day;
    private int month;
    private int year;
    private int beginHour;
    private int beginMinute;
    private int endHour;
    private int endMinute;
}
