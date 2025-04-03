package com.bench_connect.java_8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {  // ----------------------------------

	
	public static Optional<Character> findFirstNonRepeatedChar(String str) {
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }
	
	public static void main(String[] args) {
		String inputString = "swiss";
		
      System.out.println("First non-repeated character: " + findFirstNonRepeatedChar(inputString).orElse(null));

	}

}
