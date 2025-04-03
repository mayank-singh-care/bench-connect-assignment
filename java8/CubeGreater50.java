package com.bench_connect.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeGreater50 {

	
	public static List<Integer> cubeAndFilter(List<Integer> numbers) {
        return numbers.stream().map(n -> n * n * n).filter(n -> n > 50).collect(Collectors.toList());
    }
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2, 34, 678, 3, 1, 10, 11, 12, 13, 14, 15, 16);
		
		System.out.println("Cubed and filtered list: " + cubeAndFilter(numbers));

	}

}
