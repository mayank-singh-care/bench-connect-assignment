package com.bench_connect.java_8;

import java.util.Random;

public class RandomNumbers {

	
	 public static void printRandomNumbers() {  // ----------------
	        new Random().ints(10, 1, 100).forEach(System.out::println);
	    }
	 
	public static void main(String[] args) {
		System.out.println("Random Numbers:");
        printRandomNumbers();
	}

}
