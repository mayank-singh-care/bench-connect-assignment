package com.bench_connect.java_7;

import java.util.ArrayList;

public class Fibonacci {

	
	public static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;   //  swap  b  &  a+b
            a = b;
            b = temp;
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		fibonacci(10);
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(1);
		
//		ArrayList<Integer> output = arr.stream().map((a, b) -> a + b).collect(Collectors.toList());;
		
	}

}
