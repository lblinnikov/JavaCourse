package org.java4qa;

import java.util.Locale;
import java.util.Scanner;

public class SmartTimeConverter {
    public static void main(String[] args){

        // TODO Reads a length of a time period as a number of seconds and writes out how many days, hours, minutes and seconds it represents.

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter length of time period in seconds: ");

        int period = userInput.nextInt();

        // Calculation block

        int minutes = period/60;
        int hours = minutes/60;
        int days = hours/24;

        int seconds = period % 60;
        minutes = minutes % 60;
        hours = hours % 24;

        System.out.println(period + " seconds in total is: ");

        System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds.");

    }
}