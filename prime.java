package com.instagram;

import java.util.Scanner;

public class prime {

    public  static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(number + " is " + (isPrime ? "a prime number." : "not a prime number."));
    }
}