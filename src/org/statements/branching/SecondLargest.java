package org.statements.branching;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input four integers entering each + line break (ENTER): ");

        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();
        int d = userInput.nextInt();

        int substitute;
        int secondLargest;

        // TODO find second largest

        // Comparing with each other and assigning values to largest/secondLargest variable?

        // compare first pair
        // gets bigger in 1st position
        if (a < b) {
            substitute = a;
            a = b;
            b = substitute;
        }
        // compare last pair
        // gets bigger in 3rd position
        if (c < d) {
            substitute = c;
            c = d;
            d = substitute;
        }
        // compare bigger candidate from first pair with bigger candidate from last pair
        // gets biggest into 1st position
        if (a < c) {
            substitute = a;
            a = c;
            c = substitute;
        }

        /* here we compare only 2nd, 3rd, 4th because 1st position is reserved with biggest
        and we don't sort everything till the end because we don't care about last two element order,
        only about 2nd highest
         */
        // compare 2nd and 3rd
        // gets bigger to 2nd position
        if (b < c) {
            substitute = b;
            b = c;
            c = substitute;
        }
        // compare bigger candidate with last element
        // gets biggest from this trio into 2nd position (b)
        if (b < d) {
            substitute = b;
            b = d;
            d = substitute;
        }

        secondLargest = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        System.out.println("Second largest number is " + secondLargest);

    }
}
