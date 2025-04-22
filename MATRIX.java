package com.instagram;

public class MATRIX {

	public static void main(String[] args) {
	
			     int[][] matrixA = {
		            {3, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        int[][] matrixB = {
		            {9, 8, 7},
		            {6, 5, 4},
		            {3, 2, 6}
		        };

		           int rows = matrixA.length;
		        int cols = matrixA[0].length;

		        int[][] resultMatrix = new int[rows][cols];

		           for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
		            }
		        }

		        		        System.out.println("Resultant Matrix after Addition:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(resultMatrix[i][j] + " ");
		            }
		            System.out.println(); // Move to the next line after each row
		        }
		    }
		}

