package com.bench_connect.java_8;

import java.util.Arrays;
import java.util.List;

public class StringsGreaterThan5 {

	
	public static long countStringsGreaterThan5(List<String> list) {
        return list.stream().filter(s -> s.length() > 5).count();
    }
	
	public static void main(String[] args) {
		List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		
		System.out.println("Count of strings > 5: " + countStringsGreaterThan5(countries));
	}

}
