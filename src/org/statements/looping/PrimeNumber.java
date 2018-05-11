package org.statements.looping;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input positive integer: ");

        int n = userInput.nextInt();

        boolean primeNumber = true;

        for (int i=2; i<n; i++) {
            if (n%i == 0)
                primeNumber = false;
        }

        System.out.println(n + " is prime number: " + primeNumber);
    }

}
