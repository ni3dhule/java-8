package com.java8.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java8.model.User;

public class ExcelProcessor {

	final static Map<String, Object> cache = new HashMap<>();

	public static Map<String, Object> loadJsonFile() throws IOException {

		InputStream is = new Object() {}.getClass().getClassLoader().getResourceAsStream("users_details.json");

		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String contents = reader.lines().collect(Collectors.joining(""));

		ObjectMapper mapper = new ObjectMapper();
		List<User> listUsers = mapper.readValue(contents, new TypeReference<List<User>>() {});
		System.out.println("Number of records : " + listUsers.size());
		for (User user : listUsers) {
			System.out.println(user);
		}
		cache.put("users", listUsers);
		return cache;
	}
	
	public static Date getDate(String strDate, String strFormat) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(strFormat);
		System.out.println("Format : "+strFormat);
		Date date = sdf.parse(strDate);
		return date;
	}

}
