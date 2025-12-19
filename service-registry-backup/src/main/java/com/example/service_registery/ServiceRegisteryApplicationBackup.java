package com.example.service_registery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegisteryApplicationBackup {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegisteryApplicationBackup.class, args);
	}

}
