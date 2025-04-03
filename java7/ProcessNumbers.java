package com.bench_connect.java_7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProcessNumbers {

	
	public static void processNumbers(List<Integer> numbers) {
        // 1. Get only single-digit numbers
        List<Integer> singleDigits = numbers.stream()
                .filter(n -> n < 10)
                .collect(Collectors.toList());
        System.out.println("Single-digit numbers: " + singleDigits);

        // 2. Separate even and odd numbers
        Map<String, List<Integer>> evenOddMap = numbers.stream()
                .collect(Collectors.groupingBy(n -> (n % 2 == 0) ? "even" : "odd"));
        System.out.println("Even numbers: " + evenOddMap.get("even"));
        System.out.println("Odd numbers: " + evenOddMap.get("odd"));

        // 3. Get all prime numbers
        List<Integer> primeNumbers = numbers.stream()
                .filter(ProcessNumbers::isPrime)
                .collect(Collectors.toList());
        System.out.println("Prime numbers: " + primeNumbers);
    }
	
	private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 43, 15, 66, 87, 89, 9, 10, 22, 34, 23, 89, 54);
        processNumbers(numbers);
	}

}
