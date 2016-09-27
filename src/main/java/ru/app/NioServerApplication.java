package ru.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
public class NioServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NioServerApplication.class, args);
	}

}
