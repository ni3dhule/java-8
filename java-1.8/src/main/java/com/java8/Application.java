package com.java8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java8.util.ExcelProcessor;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Loading the json file :::");
		try {
			ExcelProcessor.loadJsonFile();
		} catch (Exception e) {
			System.out.println("Exception Occured : "+e);
		}
		SpringApplication.run(Application.class, args);
	}

}
