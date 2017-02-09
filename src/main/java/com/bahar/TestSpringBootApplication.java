package com.bahar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringBootApplication {
	private static final Logger logger = LogManager.getLogger(TestSpringBootApplication.class.getName());

	public static void main(String[] args) {
		logger.info("Application Started");
		SpringApplication.run(TestSpringBootApplication.class, args);
	}
}
