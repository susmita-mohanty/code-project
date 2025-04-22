package com.instagram;

public class SUBTRACTION {

		    public static void main(String[] args) {
	        int[][] matrixA = {
	            {10, 20, 30},
	            {40, 50, 60},
	            {70, 80, 90}
	        };

	        int[][] matrixB = {
	            {9, 8, 7},
	            {36, 5, 4},
	            {3, 2, 1}
	        };

	       	  int rows = matrixA.length;
	        int cols = matrixA[0].length;

	          int[][] resultMatrix = new int[rows][cols];

	      	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
	            }
	        }
	       	        System.out.println("Result Matrix after Subtraction:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(resultMatrix[i][j] + " ");
	            }
	            System.out.println(); 
	        }
	    }
	}
