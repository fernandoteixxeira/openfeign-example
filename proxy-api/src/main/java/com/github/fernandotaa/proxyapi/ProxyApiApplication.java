package com.github.fernandotaa.proxyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProxyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApiApplication.class, args);
	}

}
