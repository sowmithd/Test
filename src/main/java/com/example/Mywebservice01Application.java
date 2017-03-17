package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication this is equivalent to below
@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class Mywebservice01Application {

	public static void main(String[] args) {
		SpringApplication.run(Mywebservice01Application.class, args);
	}
}
