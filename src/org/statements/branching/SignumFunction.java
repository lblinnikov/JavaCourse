package org.statements.branching;

import java.util.Locale;
import java.util.Scanner;

public class SignumFunction {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        userInput.useLocale(Locale.US);

        System.out.println("Please input a floating-point number: ");
        float number = userInput.nextFloat();
        int result = 0;

        if (number>0) result = 1;
        else if (number==0) result = 0;
        else if (number<0) result = -1;

        // TODO implement tolerance e.g. 1.0E-15

        System.out.println("Returns " + result);

    }
}
