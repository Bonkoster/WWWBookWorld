package com.lukashman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableEurekaServer
public class WwwBookWorldEurikaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WwwBookWorldEurikaServerApplication.class, args);
	}

}
