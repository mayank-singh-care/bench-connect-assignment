package com.bench_connect.java_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueElements {

	
	public static List<Integer> findUniqueElements(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) result.add(entry.getKey());
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(findUniqueElements(new int[]{-1, -2, 3, 3, -2}));
		
		System.out.println(findUniqueElements(new int[]{1, 2, 3, 3, 2, 1}));
	}

}
