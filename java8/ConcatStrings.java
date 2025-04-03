package com.bench_connect.java_8;

public class ConcatStrings {   // ----------------------

	
	 public static String concatenateStrings(String str1, String str2) {
	        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + s2;  //	str1.concat(str2);         
	         return concatenate.apply(str1, str2);
	    }
	 
	public static void main(String[] args) {
		System.out.println("Concatenated Strings: " + concatenateStrings("Hello", " World"));
	}

}
