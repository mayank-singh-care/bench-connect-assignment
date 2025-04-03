package com.bench_connect.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWith1 {

	
	public static List<Integer> findNumbersStartingWith1(List<Integer> numbers) {
        return numbers.stream().filter(n -> String.valueOf(n).startsWith("1")).collect(Collectors.toList());
    }
	
	public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(2, 34, 678, 3, 15, 13, 21, 1, 3, 15, 100, 10);

		System.out.println("Numbers starting with 1: " + findNumbersStartingWith1(numbers));
	}

}
