package com.stackroute.moviecruiser.MovieCruiserConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
//which pulls in all the required setup through the auto-configure annotation @EnableConfigServer:
public class MovieCruiserConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCruiserConfigServerApplication.class, args);
	}
}
