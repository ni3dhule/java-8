package com.java8;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.java8.config.ApplicationContextProvider;
import com.java8.util.ExcelProcessor;

@SpringBootApplication
@AutoConfiguration
@ComponentScan
@Configuration
public class Application {
	
	ApplicationContextProvider appContextProvider;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
