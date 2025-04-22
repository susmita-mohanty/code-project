package com.instagram;

public class Reverse {

		    public   static void main(String[] args) {
	        int number = 98765;
	        String reversedString = new StringBuilder(String.valueOf(number)).reverse().toString();
	        int reversed = Integer.parseInt(reversedString);

	        System.out.println("Reversed Integer: " + reversed);
	    }
	}
