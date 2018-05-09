package org.java4qa;

import java.util.Locale;
import java.util.Scanner;

public class CollinearCheck {
    public static void main(String[] args){

        // TODO Reads coordinates of three points in a plane and writes out whether the points are all positioned on a single line.

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

        System.out.println("Enter coordinates of THIRD point: ");
        System.out.println("Enter x3: ");
        double x3 = userInput.nextDouble();

        System.out.println("Enter y3: ");
        double y3 = userInput.nextDouble();

        // Calculation block

        boolean collinear = (y1 - y2) * (x1 - x3) == (y1 - y3) * (x1 - x2);

        double area = (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
        boolean collinearByZeroArea = area == 0;


        System.out.println("It's " + collinear + " that points are one one line.");

        System.out.println("It's also " + collinearByZeroArea + " that points are one one line because area of triangle they are creating is " + area + " square units.");


    }
}