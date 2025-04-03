package com.bench_connect.java_7;

import java.util.Arrays;

public class Anagram {

	// same number of characters in diff order
	public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
	
	public static void main(String[] args) {
		System.out.println(isAnagram("Dog", "god"));
		System.out.println(isAnagram("Dogg", "god"));
		System.out.println(isAnagram("Dog", "Cat"));
	}

}
