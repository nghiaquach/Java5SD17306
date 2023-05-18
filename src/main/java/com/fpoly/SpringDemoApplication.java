package com.fpoly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringDemoApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)   
	{  
		return application.sources(SpringDemoApplication.class);  
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
