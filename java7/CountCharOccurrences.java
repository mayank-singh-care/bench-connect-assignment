package com.bench_connect.java_7;

import java.util.HashMap;
import java.util.Map;

public class CountCharOccurrences {

	
	public static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        return countMap;
    }
	
	public static void main(String[] args) {
		System.out.println(countCharacterOccurrences("hello"));
	}

}
