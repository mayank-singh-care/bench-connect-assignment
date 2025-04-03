package com.bench_connect.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedElements {

	public static HashMap<Integer, Long> findRepeatedElements(List<Integer> num) {
		 return num.stream()
	                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
	}
	
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>(Arrays.asList(2,3,9,2,8,3));
		
		System.out.println(findRepeatedElements(num));
		
	}

}
