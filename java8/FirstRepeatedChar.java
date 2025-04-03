package com.bench_connect.java_8;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FirstRepeatedChar {

	
	public static Optional<Character> findFirstRepeatedChar(String str) {
        Set<Character> seen = new HashSet<>();
        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seen.add(c))
                .findFirst();
    }
	
	public static void main(String[] args) {
		String inputString = "swiss";
		
		System.out.println("First repeated character: " + findFirstRepeatedChar(inputString).orElse(null));
	}

}
