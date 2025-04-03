package com.bench_connect.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {

	
	public static List<Integer> findDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
	
	 public static List<Integer> removeDuplicates(List<Integer> numbers) {
	        return numbers.stream()
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))   //  accepts & returns the same value
	                .entrySet().stream()
	                .filter(entry -> entry.getValue() <= 1)
	                .map(Map.Entry::getKey)
	                .collect(Collectors.toList());
	    }
	
	public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(1, 5, 8, 3, 1, 5, 2);

      System.out.println("Duplicate elements: " + findDuplicates(numbers));
      
      System.out.println("List after removing duplicates: " + removeDuplicates(numbers));
	}

}
