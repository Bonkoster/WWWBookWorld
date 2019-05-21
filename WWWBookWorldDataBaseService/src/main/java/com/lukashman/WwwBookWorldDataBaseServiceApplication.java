package com.lukashman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.lukashman.repository"})
@EnableEurekaClient
public class WwwBookWorldDataBaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WwwBookWorldDataBaseServiceApplication.class, args);
	}

}
