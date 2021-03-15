package com.timebook.calendar.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.timebook.calendar.domain.timeseries.RangeTimeSlot;
import java.util.List;

@Document(collection = "accounts")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

	@Valid
	@NotNull
	private List<RangeTimeSlot> slots;

	public List<RangeTimeSlot> getSlots() {
		return slots;
	}

	public void setSlots(List<RangeTimeSlot> slots) {
		this.slots = slots;
	}

}
