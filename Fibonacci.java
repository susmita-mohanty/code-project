package com.instagram;

public class Fibonacci 
{
	    public static void main(String[] args)
	    {
	        System.out.println("Fibonacci series from 1 to 20:");
	        printFibonacci(1, 1);
	    }

	    public static void printFibonacci(int a, int b) {
	        if (a > 20) return; 
	        System.out.print(a + " ");
	        printFibonacci(b, a + b); 
	    }
	}
