package com.timebook.notification.service;

import com.timebook.notification.domain.NotificationType;
import com.timebook.notification.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
