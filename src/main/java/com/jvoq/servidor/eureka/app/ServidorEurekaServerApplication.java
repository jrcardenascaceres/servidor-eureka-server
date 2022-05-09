package com.jvoq.servidor.eureka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServidorEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServidorEurekaServerApplication.class, args);
	}

}
