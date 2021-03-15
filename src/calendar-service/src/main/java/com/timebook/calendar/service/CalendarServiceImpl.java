package com.timebook.calendar.service;

import com.timebook.calendar.domain.*;
import com.timebook.calendar.domain.timeseries.*;
import com.timebook.calendar.domain.timeseries.DataPoint;
import com.timebook.calendar.domain.timeseries.DataPointId;
import com.timebook.calendar.repository.DataPointRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CalendarServiceImpl implements CalendarService {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private DataPointRepository repository;
	@Override
	public List<DataPoint> findByAccountName(String accountName) {
		Assert.hasLength(accountName);
		return repository.findByIdAccount(accountName);
	}

	@Override
	public DataPoint save(String accountName, Account account) {

		Instant instant = LocalDate.now().atStartOfDay()
				.atZone(ZoneId.systemDefault()).toInstant();

		DataPointId pointId = new DataPointId(accountName, Date.from(instant));

		Set<RangeTimeSlot> slots = account.getSlots().stream()
				.collect(Collectors.toSet());

		DataPoint dataPoint = new DataPoint();
		dataPoint.setId(pointId);
		dataPoint.setRangeTimeSlots(slots);

		log.debug("new datapoint has been created: {}", pointId);

		return repository.save(dataPoint);
	}

}
