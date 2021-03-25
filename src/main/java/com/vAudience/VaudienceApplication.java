package com.vAudience;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = {"com.vAudience"}) 

public class VaudienceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaudienceApplication.class, args);
	}

}
