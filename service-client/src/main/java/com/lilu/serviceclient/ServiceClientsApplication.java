package com.lilu.serviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//http://localhost:9002/test/hello
@SpringBootApplication
@EnableEurekaClient
public class ServiceClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceClientsApplication.class, args);
	}

}
