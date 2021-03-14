package com.timebook.calendar.service;

import com.timebook.calendar.domain.Account;
import com.timebook.calendar.domain.timeseries.DataPoint;

import java.util.List;

public interface CalendarService {

	List<DataPoint> findByAccountName(String accountName);

	DataPoint save(String accountName, Account account);

}
