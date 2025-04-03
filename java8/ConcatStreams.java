package com.bench_connect.java_8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreams {

	
	 public static <T> Stream<T> concatenateStreams(Stream<T> stream1, Stream<T> stream2) {
	        return Stream.concat(stream1, stream2);
	    }
	 
	public static void main(String[] args) {
		
      System.out.println(concatenateStreams(Stream.of(1, 2, 3), Stream.of(4, 5, 6)).collect(Collectors.toList()));
	}

}
