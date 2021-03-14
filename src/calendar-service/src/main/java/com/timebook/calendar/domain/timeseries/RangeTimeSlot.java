package com.timebook.calendar.domain.timeseries;

import com.timebook.calendar.domain.Currency;
import com.timebook.calendar.domain.TimePeriod;

import java.math.BigDecimal;
import java.util.*;

@Getter
@Setter
public class RangeTimeSlot {

	private Date begin;

	private Date end;

	public RangeTimeSlot(Date begin, Date end) {
		this.begin = begin;
		this.end = end;
	}
}
