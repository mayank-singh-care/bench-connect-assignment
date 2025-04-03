package com.bench_connect.java_7;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	
	 public static char firstNonRepeatingChar(String str) {
	        Map<Character, Integer> countMap = new LinkedHashMap<>();
	        for (char ch : str.toCharArray()) {
	            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
	        }
	        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
	            if (entry.getValue() == 1) return entry.getKey();
	        }
	        return '_'; // No unique character found
	    }
	 
	public static void main(String[] args) {
		System.out.println(firstNonRepeatingChar("swiss"));
		System.out.println(firstNonRepeatingChar("swiswi"));
	}

}
