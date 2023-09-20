package com.java8.core.concepts.map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapUtility {
    private static Logger logger = LoggerFactory.getLogger(MapUtility.class);
    public static void main(String[] args) {
        // Remove null value objects from map
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("RED","#FF0000");
        hashMap.put("BLACK",null);
        hashMap.put("BLUE","#0000FF");
        hashMap.put("GREEN","#008000");
        hashMap.put("WHITE",null);

        logger.info("HASHMAP BEFORE NULL VALUE REMOVAL : {}", hashMap);
        logger.info("=======================================");
        hashMap.values().removeIf(Objects::isNull);
        logger.info("HASHMAP AFTER NULL VALUE REMOVAL : {}", hashMap);
        logger.info("=======================================");
    }
}
