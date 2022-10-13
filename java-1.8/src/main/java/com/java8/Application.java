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
	
	private static Map<String, Object> contextCache = null;
	
	public static void main(String[] args) {
		System.out.println("Loading the json file :::");
		try {
			contextCache = ExcelProcessor.loadJsonFile();
		} catch (Exception e) {
			System.out.println("Exception Occured : "+e);
		}
		SpringApplication.run(Application.class, args);
	}

}
