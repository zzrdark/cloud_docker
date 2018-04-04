package com.zzr.eureka_server_4_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer44Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer44Application.class, args);
	}
}
