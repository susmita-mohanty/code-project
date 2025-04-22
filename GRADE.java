package com.instagram;

import java.util.Scanner;

class GRADE {

		    public static void main(String[] args) {
		    	Scanner scanner = new Scanner(System.in);

	       	        System.out.print("Enter the score (0-100): ");
	        int score = scanner.nextInt();

	       	        char grade;

	        if (score >= 90 && score <= 100) {
	            grade = 'A';
	        } else if (score >= 80) {
	            grade = 'B';
	        } else if (score >= 70) {
	            grade = 'C';
	        } else if (score >= 60) {
	            grade = 'D';
	        } else if (score >= 0) {
	            grade = 'F';
	        } else {
	            System.out.println("Invalid score. Please enter a score between 0 and 100.");
	            scanner.close();
	            return; 
	        }

	       	        System.out.println("The grade is: " + grade);

	        	        scanner.close();
	    }
	}
