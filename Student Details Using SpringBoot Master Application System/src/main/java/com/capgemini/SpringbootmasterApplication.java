package com.capgemini;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootmasterApplication {
	private static final Logger l = LoggerFactory.getLogger(SpringbootmasterApplication.class);

	public static void main(String[] args) {
		l.info("INSIDE MAIN....");

		SpringApplication.run(SpringbootmasterApplication.class, args);

	}

}
