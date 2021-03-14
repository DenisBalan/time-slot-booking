package com.timebook.calendar.controller;

import com.timebook.calendar.domain.Account;
import com.timebook.calendar.domain.timeseries.DataPoint;
import com.timebook.calendar.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@RestController
public class CalendarController {

	@Autowired
	private CalendarService CalendarService;

	@RequestMapping(value = "/current", method = RequestMethod.GET)
	public List<DataPoint> getCurrentAccountCalendar(Principal principal) {
		return CalendarService.findByAccountName(principal.getName());
	}

	@PreAuthorize("#oauth2.hasScope('server') or #accountName.equals('demo')")
	@RequestMapping(value = "/{accountName}", method = RequestMethod.GET)
	public List<DataPoint> getCalendarByAccountName(@PathVariable String accountName) {
		return CalendarService.findByAccountName(accountName);
	}

	@PreAuthorize("#oauth2.hasScope('server')")
	@RequestMapping(value = "/{accountName}", method = RequestMethod.PUT)
	public void saveAccountCalendar(@PathVariable String accountName, @Valid @RequestBody Account account) {
		CalendarService.save(accountName, account);
	}
}
