package org.statements.looping;

import java.util.Scanner;

public class Looping1 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input two integers: ");

        int a = userInput.nextInt();
        int b = userInput.nextInt();

        // init default values
        int divRes = 0;
        int modRes = 0;

        if (a>=b) {
            for (;a > 0;a -= b, divRes++) {
                if (a < b) {
                    modRes = a;
                    break;
                }
            }
        }
        else {
            divRes = 0; // empirical knowledge that integer division of a<b is 0
            modRes = a;
        }
        System.out.println("Division result is " + divRes);
        System.out.println("Modulo result is " + modRes);
    }

}
