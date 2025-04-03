package com.bench_connect.java_7;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	
	public static String removeDuplicateWords(String sentence) {
        Set<String> words = new LinkedHashSet<>(Arrays.asList(sentence.split(" ")));  // preserve the order
        return String.join(" ", words);
    }
	
	public static void main(String[] args) {
		System.out.println(removeDuplicateWords("Good day day bye bye"));

		System.out.println(removeDuplicateWords("Good day bye day bye"));

	}

}
