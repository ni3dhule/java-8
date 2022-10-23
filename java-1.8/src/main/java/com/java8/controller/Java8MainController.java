package com.java8.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java8.config.ApplicationContextProvider;
import com.java8.model.User;
import com.java8.util.ExcelProcessor;

@RestController
@RequestMapping("/api/java8/*")
public class Java8MainController {

	@Autowired
	private ApplicationContextProvider applicationContextProvider;
	
	private static Map<String, Object> contextCache = null;
	
	@GetMapping("home")
	public String home(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("application context : "+applicationContextProvider.getApplicationContext());
		System.out.println("Loading the json file :::");
		try {
			contextCache = ExcelProcessor.loadJsonFile();
		} catch (Exception e) {
			System.out.println("Exception Occured : "+e);
		}
        return contextCache.toString();
	}
	
	@GetMapping("user/males")
	@SuppressWarnings("unchecked")
	public List<User> maleUsers(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("HTTP Request details : "+request.toString());
		List<User> result = null;
		try {
			contextCache = ExcelProcessor.loadJsonFile();
			List<User> alUsers = (List<User>) contextCache.get("users");
			Stream<User> stm = alUsers.stream();
			List<User> resultMales = stm.filter(user -> user.getGender().equalsIgnoreCase("Male")).collect(Collectors.toList());
			System.out.println("Males User : "+resultMales);
			result = resultMales;
		} catch (Exception e) {
			System.out.println("Exception Occured : "+e);
		}
		return result;
	}
	
}
