package com.bench_connect.java_7;

public class StringWeight {

	
	public static int findStringWeight(String str) {
        int weight = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {   // check valid string characters
                weight += (ch - 'a' + 1);
            }
        }
        return weight;
    }
	
	public static void main(String[] args) {
		System.out.println(findStringWeight("Apple"));
		System.out.println(findStringWeight("Mayank Singh"));
	}

}
