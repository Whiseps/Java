package com.whiseps.lambda1;

import java.util.Scanner;


public class Operations {
    public static void main (String[] args) {
        Operation isOdd =(a) -> {
            if (a%2==1) {
                return true;
            }
            return false;
        };

        Operation isPrime = a -> {
            if (a < 2) return false;
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) return false;
            }
            return true;
        };

        Operation isPalindrome = a -> {
            if (a < 0) {
                return false;
            }

            int originalNum = a;
            int reversedNum = 0;

            while (a != 0) {
                int digit = a % 10;
                reversedNum = reversedNum * 10 + digit;
                a /= 10;
            }

            if (originalNum == reversedNum) {
                return true;
            }
            return false;
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of tests: ");

        int n = sc.nextInt();

        for (int i = 0;i<n;i++) {
            System.out.println("Enter test code and number");
            int code = sc.nextInt();;
            int number = sc.nextInt();

            if (code == 1) {
                if (isOdd.operation(number)) {
                    System.out.println("ODD");
                } else {
                    System.out.println("EVEN");
                }
            } else if (code == 2) {
                if (isPrime.operation(number)) {
                    System.out.println("PRIME");
                } else {
                    System.out.println("COMPOSITE");
                }
            } else {
                if (isPalindrome.operation(number)) {
                    System.out.println("PALINDROME");
                } else {
                    System.out.println("NOT PALINDROME");
                }
            }
        }
        
        sc.close();
        
    }

}
