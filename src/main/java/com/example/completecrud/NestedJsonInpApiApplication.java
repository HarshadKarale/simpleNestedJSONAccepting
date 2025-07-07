package com.example.completecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class NestedJsonInpApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NestedJsonInpApiApplication.class, args);
	}

}
