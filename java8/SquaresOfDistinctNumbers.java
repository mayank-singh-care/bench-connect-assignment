package com.bench_connect.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresOfDistinctNumbers {

	
	public static List<Integer> findSquaresOfDistinctNumbers(List<Integer> numbers) {
        return numbers.stream()
                .distinct()                      // set - no duplicates
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
	
	public static void main(String[] args) {
		
		List<Integer> numbers2 = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		
		System.out.println("Squares of distinct numbers: " + findSquaresOfDistinctNumbers(numbers2));
	}

}
