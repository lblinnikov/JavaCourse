package org.java4qa;

import java.util.Locale;
import java.util.Scanner;

public class LineCrosser {
    public static void main(String[] args){

        // TODO Reads two couples of coordinates x1, y1 and x2, y2 and writes out an x coordinate of a point, where the line going through (x1, y1) and (x2, y2) crosses the X axis (y=0).

        Scanner userInput = new Scanner(System.in);
        userInput.useLocale(Locale.US);

        System.out.println("Enter coordinates of FIRST point: ");
        System.out.println("Enter x1: ");
        double x1 = userInput.nextDouble();

        System.out.println("Enter y1: ");
        double y1 = userInput.nextDouble();

        System.out.println("Enter coordinates of SECOND point: ");
        System.out.println("Enter x2: ");
        double x2 = userInput.nextDouble();

        System.out.println("Enter y2: ");
        double y2 = userInput.nextDouble();

        // Calculation block

        // Line equation is y = mx + b"
        // slope

        double m = (y2-y1)/(x2-x1);

        // TODO catch when x2-x1 is ZERO ?

        // b = y-mx
        double b = y1-m*x1;

        System.out.println("Equation of line is y = " + m + "x + " + b );

        // Line crosses X axis if Y=0
        // mx = y-b
        // x = (y-b)/m

        double xAxisCross = (0.0-b)/m;
        System.out.println("X coordinate of crossing X axis is: ");
        System.out.println(xAxisCross);

    }
}