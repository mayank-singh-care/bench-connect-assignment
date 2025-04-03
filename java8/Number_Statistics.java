package com.bench_connect.java_8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Number_Statistics {

	
	public static void findStatistics(List<Integer> numbers) {
        IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
    }
	
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		
		 findStatistics(num);

	}

}
