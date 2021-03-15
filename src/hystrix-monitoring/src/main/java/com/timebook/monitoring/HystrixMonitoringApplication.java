package com.timebook.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixMonitoringApplication.class, args);
	}
}
