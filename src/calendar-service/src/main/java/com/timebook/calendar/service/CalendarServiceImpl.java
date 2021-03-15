package com.timebook.calendar.service;

import com.google.common.collect.ImmutableMap;
import com.timebook.calendar.domain.*;
import com.timebook.calendar.domain.timeseries.DataPoint;
import com.timebook.calendar.domain.timeseries.DataPointId;
import com.timebook.calendar.domain.timeseries.ItemMetric;
import com.timebook.calendar.domain.timeseries.StatisticMetric;
import com.timebook.calendar.repository.DataPointRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CalendarServiceImpl implements CalendarService {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private DataPointRepository repository;

}
