package org.statements.looping;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input two positive integers: ");

        int m = userInput.nextInt();
        int n = userInput.nextInt();

        int GCD; // greatest common divisor
        int sub; // substitute

        // Potentially GCD is smallest of both ints even if m=n

        // if m > n
        // switch them so m < n
        // TODO define swap var in swap block
        if (m > n) {
            sub = m;
            m = n;
            n = sub;
        }
        // then m is first GCD candidate
        // TODO Euclid's algorythm instead of decreasing
        for (GCD = m;!((m % GCD == 0) && (n % GCD == 0));GCD--);

        System.out.println("Greatest common divisor is " + GCD);
    }

}
