package org.statements.looping;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input positive integer: ");

        int n = userInput.nextInt();
        long result = 1; // init value for factorial of 1

        for (int factorial = 2;factorial <= n;factorial++) {
            result = result * factorial;
        }

        System.out.println(n + "! = " + result);
    }

}
