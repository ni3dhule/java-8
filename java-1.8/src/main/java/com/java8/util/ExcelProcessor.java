package com.java8.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java8.model.User;

public class ExcelProcessor {
	
	final static Map<String, Object> cache = new HashMap<>();
	
	public static void loadJsonFile() throws IOException {
		/*
		  File resource = ResourceUtils.getFile("classpath:users_details.json");
		  
		  System.out.println("FILE : "+resource); String jsonString = new
		  String(Files.readAllBytes(resource.toPath()));
		  System.out.println("JSON STRING :: "+jsonString); ObjectMapper mapper = new
		  ObjectMapper(); List<User> listUsers = mapper.readValue(jsonString, new
		  TypeReference<List<User>>(){});
		  System.out.println("Number of records : "+listUsers.size()); 
		  for (User user : listUsers) { 
		  	System.out.println(user); 
		  } 
		  cache.put("users", listUsers);
		 */
		
		
		/*
		 * try (InputStream inputStream =
		 * ClassLoader.getResourceAsStream("/input.txt");BufferedReader reader = new
		 * BufferedReader(new InputStreamReader(inputStream))) { String contents =
		 * reader.lines().collect(Collectors.joining(System.lineSeparator()));
		 * }catch(Exception e) {
		 * 
		 * }
		 */
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("main/resources/app-context.xml");
		
		//File resource = new ClassPathResource("/users_details.json").getFile();
		
		//String text = new String(Files.readAllBytes(resource.toPath()));
		//System.out.println("JSON : "+text);
		
		InputStream in =  new Object() {}.getClass().getClassLoader().getResourceAsStream("users_details.json");
		//InputStream in =  new Object() {}.getClass().getClassLoader().getResourceAsStream("users_details.json");
		System.out.println("I/P Object : "+in);
		
		

	}
	
	
}
