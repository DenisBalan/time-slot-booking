package com.timebook.notification.service;

import com.timebook.notification.domain.NotificationType;
import com.timebook.notification.domain.Recipient;

import java.util.List;

public interface RecipientService {

	Recipient findByAccountName(String accountName);

	List<Recipient> findReadyToNotify(NotificationType type);

	Recipient save(String accountName, Recipient recipient);

	void markNotified(NotificationType type, Recipient recipient);
}
