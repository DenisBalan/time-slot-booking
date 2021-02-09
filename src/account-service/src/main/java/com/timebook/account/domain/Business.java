package com.timebook.account.domain;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

public class Business {

	@Id
	private String name;

	@NotNull
	@Length(min = 1, max = 20)
	private String title;
	
	@NotNull
	private String type;
	
	@NotNull
	private String description;

}
