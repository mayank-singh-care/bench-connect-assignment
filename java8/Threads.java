package com.bench_connect.java_8;

public class Threads {

	
	public static void createThreadWithLambda() {        
        Thread thread = new Thread(() -> System.out.println("Thread running using Lambda!"));
        thread.start();
    }
	
	public static void main(String[] args) {
		createThreadWithLambda();
	}

}
