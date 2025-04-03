package com.bench_connect.java_7;

import java.util.ArrayList;
import java.util.List;

public class StringsStartingWithS {

	
	public static List<String> filterStringsStartingWithS(String[] arr) {
        List<String> result = new ArrayList<>();
        for (String str : arr) {
            if (str.toLowerCase().startsWith("s")) {
                result.add(str);
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(filterStringsStartingWithS(new String[]{"Apple", "Sample", "seaRch", "caT"}));
	}

}
