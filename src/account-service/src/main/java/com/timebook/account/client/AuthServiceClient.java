package com.timebook.account.client;

import com.timebook.account.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "authentication-service")
public interface AuthServiceClient {

	@RequestMapping(method = RequestMethod.POST, value = "/uaa/users", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	void createUser(User user);

}
