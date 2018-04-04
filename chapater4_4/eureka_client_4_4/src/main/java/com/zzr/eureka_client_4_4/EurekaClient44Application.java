package com.zzr.eureka_client_4_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClient44Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient44Application.class, args);
	}
}
