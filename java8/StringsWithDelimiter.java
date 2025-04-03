package com.bench_connect.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsWithDelimiter {

	
	public static String joinStringsWithDelimiter(List<String> list, String delimiter) {
        return list.stream().collect(Collectors.joining(delimiter));
    }
	
	public static void main(String[] args) {
		List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");

      System.out.println("Joined Strings: " + joinStringsWithDelimiter(countries, ", "));

	}

}
