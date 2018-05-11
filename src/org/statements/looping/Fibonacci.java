package org.statements.looping;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input positive integer: ");

        int k = userInput.nextInt();
        int fib1 = 1;
        int fib2 = 1;
        int fib;

        System.out.print(fib1 + " " + fib2);

        for (int i = 2; i<k; i++){
            fib = fib1 + fib2;
            System.out.print(" " + fib);
            fib1 = fib2;
            fib2 = fib;

        }

    }

 }


