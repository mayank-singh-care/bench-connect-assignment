package com.bench_connect.java_7;

import java.util.Arrays;

public class CurrencyNotes {

	
	public static int minCurrencyNotes(int amount, int[] notes) {
        Arrays.sort(notes);
        int count = 0;
        for (int i = notes.length - 1; i >= 0; i--) {
            count += amount / notes[i];
            System.out.println(notes[i] + " -> " + amount / notes[i]);
            amount %= notes[i];
        }
        return count;
    }
	
	public static void main(String[] args) {
		int[] notes = {100, 500};
        System.out.println("Minimum notes required for Rs 1200: " + minCurrencyNotes(1200, notes));
	}

}
