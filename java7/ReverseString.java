package com.bench_connect.java_7;

public class ReverseString {   // --------------------------

	
	public static String reverseStringPreserveOrder(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            sb.insert(0, ch);
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(reverseStringPreserveOrder("I am Java Developer"));
	}

}
