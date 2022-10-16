package com.java8.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java8.config.ApplicationContextProvider;
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
			(applicationContextProvider.getApplicationContext()).se
		} catch (Exception e) {
			System.out.println("Exception Occured : "+e);
		}
		/*response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // send HTML page to client
        out.println("<html>");
        out.println("<head><title>A Test Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Test</h1>");
        out.println("<p>Simple servlet for testing.</p>");
        out.println("</body></html>");*/
		//return "Home page loaded successfully";
        return contextCache.toString();
	}
	
	/*
	 	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // send HTML page to client
        out.println("<html>");
        out.println("<head><title>A Test Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Test</h1>");
        out.println("<p>Simple servlet for testing.</p>");
        out.println("</body></html>");
	 */
	
}
