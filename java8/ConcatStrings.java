package com.bench_connect.java_8;

public class ConcatStrings {   // ----------------------

	
	 public static String concatenateStrings(String str1, String str2) {
	        return str1.concat(str2);
	    }
	 
	public static void main(String[] args) {
		System.out.println("Concatenated Strings: " + concatenateStrings("Hello", " World"));
	}

}
