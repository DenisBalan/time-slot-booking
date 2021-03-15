package com.timebook.calendar.domain.timeseries;

import com.timebook.calendar.domain.Currency;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

@Document(collection = "datapoints")

public class DataPoint {

	@Id
	private DataPointId id;

	private Set<RangeTimeSlot> rangeTimeSlots;

	public DataPointId getId() {
		return id;
	}

	public void setId(DataPointId id) {
		this.id = id;
	}

	public Set<RangeTimeSlot> getRangeTimeSlots() {
		return rangeTimeSlots;
	}

	public void setRangeTimeSlots(Set<RangeTimeSlot> rangeTimeSlots) {
		this.rangeTimeSlots = rangeTimeSlots;
	}
}
