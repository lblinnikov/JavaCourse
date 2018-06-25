package org.java4qabasics;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TriangleArea {
    public static void main(String[] args){

        // Reads lengths of all three sides of a triangle and writes out the triangle area. Hint: use the Heron’s formula.

        Scanner userInput = new Scanner(System.in);
        userInput.useLocale(Locale.US);

        System.out.println("Enter length of FIRST triangle side: ");
        double a = userInput.nextDouble();

        System.out.println("Enter length of SECOND triangle side: ");
        double b = userInput.nextDouble();

        System.out.println("Enter length of THIRD triangle side: ");
        double c = userInput.nextDouble();

        // TODO catch if not a triangle with branching e.g. if a+b<=c

        // Calculation block

        // Heron's formula is A = sqrt(s(s-a)(s-b)(s-c))
        // Semiperimeter s = (a+b+c)/2

        double s = (a+b+c)/2.0;

        double areaHeron = sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of triangle is: " + areaHeron + " square units.");

    }
}