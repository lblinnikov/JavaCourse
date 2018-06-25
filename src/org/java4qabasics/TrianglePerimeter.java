package org.java4qabasics;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TrianglePerimeter {
    public static void main(String[] args){

        // Reads lengths of legs of a right-angled triangle and writes out a perimeter of the triangle.

        Scanner userInput = new Scanner(System.in);
        userInput.useLocale(Locale.US);

        System.out.println("Enter length of FIRST triangle leg: ");
        double leg1 = userInput.nextDouble();

        System.out.println("Enter length of SECOND triangle leg: ");
        double leg2 = userInput.nextDouble();

        // Calculation block

        // Fixed remove pow()

        double hypotenuse = sqrt(leg1*leg1 + leg2*leg2);

        double perimeter = leg1 + leg2 + hypotenuse;

        System.out.println("Perimeter of right triangle is: " + perimeter);

    }
}