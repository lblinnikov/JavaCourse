package org.statements.looping;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input two positive integers: ");

        int a = userInput.nextInt();
        int b = userInput.nextInt();

        int GCD; // greatest common divisor
        int sub;

        // Potentially GCD is smallest of both ints even if a=b

        // if a > b switch them so a < b
        if (a > b) {
            sub = a;
            a = b;
            b = sub;
        }
        // then a is first GCD candidate

        for (GCD = a;!((a % GCD == 0) && (b % GCD == 0));GCD--);

        System.out.println("Greatest common divisor is " + GCD);
    }

}
