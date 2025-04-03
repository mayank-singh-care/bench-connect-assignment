package com.bench_connect.java_7;

import java.util.Map;

public class Numerology {

	
	public static int numerologyNumber(String name) {
        Map<Character, Integer> numerologyMap = Map.ofEntries(
            Map.entry('A', 1), Map.entry('I', 1), Map.entry('J', 1), Map.entry('Q', 1), Map.entry('Y', 1),
            Map.entry('B', 2), Map.entry('K', 2), Map.entry('R', 2),
            Map.entry('C', 3), Map.entry('G', 3), Map.entry('L', 3), Map.entry('S', 3),
            Map.entry('D', 4), Map.entry('M', 4), Map.entry('T', 4),
            Map.entry('E', 5), Map.entry('H', 5), Map.entry('N', 5), Map.entry('X', 5),
            Map.entry('U', 6), Map.entry('V', 6), Map.entry('W', 6),
            Map.entry('O', 7), Map.entry('Z', 7),
            Map.entry('F', 8), Map.entry('P', 8)
        );
        int sum = 0;
        for (char ch : name.toUpperCase().replaceAll("[^A-Z]", "").toCharArray()) {
            sum += numerologyMap.getOrDefault(ch, 0);
        }
        while (sum > 9) sum = sum / 10 + sum % 10;
        return sum;
    }
	
	public static void main(String[] args) {
		System.out.println(numerologyNumber("S. KANAPATHY"));
		
		System.out.println(numerologyNumber("MAYANK SINGH"));
	}

}
