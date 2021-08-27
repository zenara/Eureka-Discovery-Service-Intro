package com.appdeveloperblog.photoapp.api.account.api_accountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiAccountmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAccountmanagementApplication.class, args);
	}

}
