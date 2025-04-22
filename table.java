package com.instagram;

import java.util.Scanner;

public class table {
	
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("please enter your number");
						
			int n = scanner.nextInt();
			
			for(int j=1;j<=10;j++) {
				System.out.println(n*j);
			}

		}

	}
