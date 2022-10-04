package com.java8.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

import javax.annotation.Resource;

import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ResourceUtils;

public class ExcelProcessor {
	
	
	
	public static void loadJsonFile() throws IOException {
		
		File resource = ResourceUtils.getFile("classpath:users_details.json"); 
		System.out.println("FILE : "+resource);
		String text = new String(Files.readAllBytes(resource.toPath()));
		System.out.println("JSON STRING :: "+text);
		
	}
	

}
