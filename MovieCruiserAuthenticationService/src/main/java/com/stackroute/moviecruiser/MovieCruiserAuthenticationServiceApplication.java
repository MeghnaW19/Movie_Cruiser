package com.stackroute.moviecruiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

//import com.stackroute.moviecruiser.config.JwtFilter;

@EnableDiscoveryClient
@SpringBootApplication
public class MovieCruiserAuthenticationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCruiserAuthenticationServiceApplication.class, args);

	}
	
}