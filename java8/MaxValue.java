package com.bench_connect.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValue {

	
	public static Optional<Integer> findMaxValue(List<Integer> numbers) {
        return numbers.stream().max(Integer::compareTo);
    }
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 34, 678, 3, 15, 13, 21, 1, 3, 15, 100, 10);
		
		 System.out.println("Max value: " + findMaxValue(numbers).orElse(null));
	}

}
