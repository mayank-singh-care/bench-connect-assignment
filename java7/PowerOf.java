package com.bench_connect.java_7;

public class PowerOf {

	
	 public static boolean isPowerOfTen(int num) {
	        return Math.log10(num) % 1 == 0;  // check if log10 is int or not
	    }

	    public static boolean isPowerOfTwo(int num) {
	        return (num > 0) && (num & (num - 1)) == 0;
	    }

	    public static boolean isPowerOfFive(int num) {
	        while (num > 1) {
	            if (num % 5 != 0) return false;
	            num /= 5;
	        }
	        return num == 1;
	    }
	    
	public static void main(String[] args) {
		
		System.out.println(isPowerOfTen(100));
		System.out.println(isPowerOfTen(80));
          
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(57));
        
        System.out.println(isPowerOfFive(25));
        System.out.println(isPowerOfFive(15));
	}

}
