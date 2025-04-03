package com.bench_connect.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertString {

	
	public static String convertToUpperAndJoin(List<String> countries) {
        return countries.stream()
                .map(String::toUpperCase)  // Class::function
                .collect(Collectors.joining(", "));
    }
	
	
	public static List<String> convertToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static List<String> convertToLowerCase(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }
    
	public static void main(String[] args) {
		
		 List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		 
		 System.out.println("Uppercase and joined: " + convertToUpperAndJoin(countries));
		 
		 System.out.println("Uppercase List: " + convertToUpperCase(countries));
	        System.out.println("Lowercase List: " + convertToLowerCase(countries));
	        
	}

}
