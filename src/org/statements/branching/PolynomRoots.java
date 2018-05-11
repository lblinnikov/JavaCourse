package org.statements.branching;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PolynomRoots {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        userInput.useLocale(Locale.US);

        // ax^2 + bx + c = 0

        System.out.println("Please input three floating point numbers: ");

        float a = userInput.nextFloat();
        float b = userInput.nextFloat();
        float c = userInput.nextFloat();

        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");

        double discriminant;
        double x1;
        double x2;

        // D = b^2 - 4ac

        discriminant = (b * b) - 4 - (a * c);

        if (discriminant>0) {
            x1 = (-b - sqrt(discriminant)) / (2 * a);
            x2 = (-b + sqrt(discriminant)) / (2 * a);
            System.out.println("Two roots, x1 = " + x1 + " and x2 = " + x2);
        }
        else if (discriminant==0) {
            x1 = - (b/(2 * a));
            x2 = x1;
            System.out.println("One root or x1 = " + x1 + " and x2 = " + x2);
        }
        else if (discriminant<0){
            System.out.println("No roots in real numbers.");
        }


    }
}
