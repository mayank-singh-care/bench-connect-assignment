package com.bench_connect.java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortValues {

	
	  public static List<Integer> sortValues(List<Integer> numbers) {
	        return numbers.stream().sorted().collect(Collectors.toList());
	    }
	    
	    public static List<Integer> sortValuesDescending(List<Integer> numbers) {
	        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    }
	    
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 34, 678, 3, 15, 13, 21, 1, 3, 15, 100, 10);

      System.out.println("Sorted values: " + sortValues(numbers));
      System.out.println("Sorted values (descending): " + sortValuesDescending(numbers));
	}

}
