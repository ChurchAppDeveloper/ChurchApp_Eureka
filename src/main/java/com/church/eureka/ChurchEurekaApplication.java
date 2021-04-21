package com.church.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  // act as zuul proxy.
@EnableEurekaServer
public class ChurchEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChurchEurekaApplication.class, args);
	}

}
