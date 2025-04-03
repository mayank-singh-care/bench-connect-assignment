package com.bench_connect.java_7;

public class TotalChars {

	
	public static int totalCharacters(String str) {
        return str.replace(" ", "").length();    // --------------- check for symbols & numbers also ??
    }
	
	public static void main(String[] args) {
		System.out.println(totalCharacters("hello world"));
	}

}
