package com.bench_connect.java_7;

import java.util.Arrays;

public class SecondSmallestNumber {

	
	public static int secondSmallest(int[] arr, int index, int first, int second) {   // recurrsion   -------------
        if (index == arr.length) return second;
        if (arr[index] < first) {
            second = first;
            first = arr[index];
        } else if (arr[index] > first && arr[index] < second) {
            second = arr[index];
        }
        return secondSmallest(arr, index + 1, first, second);
    }
	
	
	public static int findSecondSmallest(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }
	
	public static void main(String[] args) {
		System.out.println(secondSmallest(new int[]{5, 2, 8, 3, 1}, 0, Integer.MAX_VALUE, Integer.MAX_VALUE));
		
		System.out.println(findSecondSmallest(new int[]{-1, -10, 20, 42, -13, 0, 100}));
	}

}
