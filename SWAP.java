package com.instagram;

public class SWAP {
	
	    public static void main(String[] args) {
	        int a = 5; // First number
	        int b = 10; // Second number

	        System.out.println("Before Swapping: a = " + a + ", b = " + b);

	        // Swapping using arithmetic operations
	        a = a + b; // Step 1: a now contains the sum of a and b
	        b = a - b; // Step 2: b is now the original value of a
	        a = a - b; // Step 3: a is now the original value of b

	        System.out.println("After Swapping: a = " + a + ", b = " + b);
	    }
	}


