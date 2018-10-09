package com.stackroute.moviecruiser.MovieCruiserZuulService;

import com.stackroute.moviecruiser.MovieCruiserZuulService.filters.ErrorFilter;
import com.stackroute.moviecruiser.MovieCruiserZuulService.filters.PostFilter;
import com.stackroute.moviecruiser.MovieCruiserZuulService.filters.PreFilter;
import com.stackroute.moviecruiser.MovieCruiserZuulService.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class MovieCruiserZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCruiserZuulServiceApplication.class, args);
	}


	@Bean
	public PreFilter preFilter(){
      return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}


}
