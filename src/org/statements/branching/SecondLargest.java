package org.statements.branching;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input four floating point numbers entering each number + line break (ENTER): ");

        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();
        int d = userInput.nextInt();

        int subsitute;
        int secondLargest;

        // TODO find second largest

        // Comparing with each other and assigning values to largest/secondLargest variable?

        // compare first pair
        // gets bigger in 1st position
        if (a < b) {
            subsitute = a;
            a = b;
            b = subsitute;
        }
        // compare last pair
        // gets bigger in 3rd position
        if (c < d) {
            subsitute = c;
            c = d;
            d = subsitute;
        }
        // compare bigger candidate from first pair with bigger candidate from last pair
        // gets biggest into 1st position
        if (a < c) {
            subsitute = a;
            a = c;
            c = subsitute;
        }

        /* here we compare only 2nd, 3rd, 4th because 1st position is reserved with biggest
        and we don't sort everything till the end because we don't care about last two element order,
        only about 2nd highest
         */
        // compare 2nd and 3rd
        // gets bigger to 2nd position
        if (b < c) {
            subsitute = b;
            b = c;
            c = subsitute;
        }
        // compare bigger candidate with last element
        // gets biggest from this trio into 2nd position (b)
        if (b < d) {
            subsitute = b;
            b = d;
            d = subsitute;
        }

        secondLargest = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        System.out.println("Second largest number is " + secondLargest);

    }
}
