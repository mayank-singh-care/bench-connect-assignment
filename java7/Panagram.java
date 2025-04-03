package com.bench_connect.java_7;

public class Panagram {

	// All alphabets of English Language
	public static boolean isPangram(String str) {
        str = str.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
		
		System.out.println(isPangram("I AM THE BEST"));
	}

}
