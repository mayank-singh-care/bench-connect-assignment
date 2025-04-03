package com.bench_connect.java_7;

import java.util.Arrays;
import java.util.Collections;

public class MaxValue {

	
	public static int findMaxValue(Integer[] arr) {
        return Collections.max(Arrays.asList(arr));
    }
	
	public static void main(String[] args) {
		System.out.println(findMaxValue(new Integer[]{1, 43, 15, 66, 87}));
		
		System.out.println(findMaxValue(new Integer[]{-1, -43, -15, -66, -87}));
	}

}
