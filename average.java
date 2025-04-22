package com.instagram;

import java.util.Scanner;

public class average {

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        	        double[] numbers = new double[n];

	        	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextDouble();
	        }

	        	        double sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum += numbers[i];
	        }
	        double average = sum / n;

	        	        System.out.println("The average is: " + average);

	       	        scanner.close();
	    }
	}