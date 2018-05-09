package org.java4qabasics;

import java.util.Locale;
import java.util.Scanner;

public class MyExerciseProgram1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.US);

        System.out.print("Enter base: ");

        double base = reader.nextDouble();

        System.out.print("Enter percentage: ");

        double percent = reader.nextDouble();

        double value =  percent / 100.0 * base;

        System.out.println(percent + "% of " + base + " gives " + value);

    }

    /*
    private double calculatePercent (int base, int percent) {
        return percent / 100.0 * base;
    }

    private double setValues (int base, int percent) {

    }
    */

}
