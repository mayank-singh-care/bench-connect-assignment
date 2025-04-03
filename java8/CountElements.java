package com.bench_connect.java_8;

import java.util.Arrays;
import java.util.List;

public class CountElements {

	
	public static long countElements(List<Integer> numbers) {
        return numbers.stream().count();
    }
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 34, 678, 3, 15, 13, 21, 1, 3, 15, 100, 10);
		System.out.println("Total elements count: " + countElements(numbers));
	}

}
