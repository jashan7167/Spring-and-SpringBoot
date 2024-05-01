package com.startedspringwmk.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CurrencyConfigurationController {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConfigurationController.class, args);
	}

}
