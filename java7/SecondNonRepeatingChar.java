package com.bench_connect.java_7;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondNonRepeatingChar {

	
	public static char secondNonRepeatingChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
                if (count == 2) return entry.getKey();
            }
        }
        return '_';
    }
	
	public static void main(String[] args) {
		System.out.println(secondNonRepeatingChar("swiss"));
	}

}
