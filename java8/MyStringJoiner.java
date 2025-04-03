package com.bench_connect.java_8;
import java.util.StringJoiner;

public class MyStringJoiner {

	    public static void main(String[] args) {
	        // Creating a StringJoiner with a comma as a delimiter
	        StringJoiner sj = new StringJoiner(", ");  // ~ String.join(",")
	        
	        sj.add("Apple");
	        sj.add("Banana");
	        sj.add("Cherry");

	        System.out.println(sj); // Output: Apple, Banana, Cherry
	    }
	    
//	    Joins multiple strings with a delimiter (separator).
//	    Optionally adds a prefix and suffix to the final result.
//	    Provides better performance than using string concatenation (+ operator).
//	    Supports dynamic string addition using add() method.
}
