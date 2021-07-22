package com.jong.test;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args) {
		HashMap<String, String>dictionary = new HashMap<>();
		
		dictionary.put("apocalypse", "A sword of Justice");
		dictionary.put("zipline", "A special forces zipline for fast escape");
		dictionary.put("bearded dragon", "A friendly pet and guardian of the underworld");
		System.out.println(dictionary);
		
		//get value from map using key
		String key = "apocalypse";
		String value = dictionary.get(key);
		System.out.println("The value for the key: " + key + " is " + value);
		
		//define a new TreeMap
		TreeMap<String, String> sortedDictionary = new TreeMap<>();
		sortedDictionary.putAll(dictionary);
		System.out.println(sortedDictionary);
		
		//add another element
		sortedDictionary.put("choco", "A tasty treat");
		System.out.println(sortedDictionary);
		
		//add another element
		sortedDictionary.put("choco", "A super delicious food that is weak to sunlight");
		System.out.println(sortedDictionary);
		
		//create a Set of keys
		Set<String> keys = sortedDictionary.keySet();
		
		for(String s:keys) {
			System.out.println("key: " + s);
		}
		
		
	}

}
