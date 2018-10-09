package com.stackroute.moviecruiser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors
				.basePackage("com.stackroute.moviecruiser"))
				.paths(regex("/api/movie.*")).build();
	}

	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo("Authentication using JWT", 
				"Spring Boot REST API for authentication", "1.0",
				"Terms of service",
				new Contact("StackRoute", "https:www.stackroute.in", "chandan.mishra@stackroute.in"), 
				"Apache License Version 2.0",
				"https://www.apache.org/licenses/LICENSE-2.0", null);
		return apiInfo;
		
		 
	}
}