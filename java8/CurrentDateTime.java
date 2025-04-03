package com.bench_connect.java_8;

import java.time.LocalDateTime;

public class CurrentDateTime {

	public static void printCurrentDateTime() {
        System.out.println("Current Date and Time: " + LocalDateTime.now());
    }
	
	public static void main(String[] args) {
		printCurrentDateTime();
	}

}
