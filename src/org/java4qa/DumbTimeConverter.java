package org.java4qa;

import java.util.Locale;
import java.util.Scanner;

public class DumbTimeConverter {
    public static void main(String[] args){

        // TODO Reads a length of a time period as a number of seconds and writes out how many days, hours, minutes and seconds it represents.

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter length of time period in seconds: ");

        int seconds = userInput.nextInt();

        // Calculation block

        int minutes = seconds/60;
        int hours = minutes/60;
        int days = hours/24;

        System.out.println("Time period is: ");

        System.out.println(days + " days, or");
        System.out.println(hours + " hours, or");
        System.out.println(minutes + " minutes, or");
        System.out.println(seconds + " seconds");

    }
}