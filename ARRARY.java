package com.instagram;

public class ARRARY {
		    public static void main(String[] args) {
	        
	        int[] originalArray = {11, 29, 36, 48, 50};

	       int[] copiedArray = new int[originalArray.length];

	    	        for (int i = 0; i < originalArray.length; i++) {
	            copiedArray[i] = originalArray[i];
	        }

	       	        System.out.println("Copied Array (using loop):");
	        for (int value : copiedArray) {
	            System.out.print(value + " ");
	        }
	    }
	}

