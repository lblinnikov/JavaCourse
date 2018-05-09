package org.statements.branching;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input a year: ");
        int year = userInput.nextInt();
        String days = "";

        if (((year % 4) == 0) && ((year % 100) != 0)) days = "6";
        else if ((year % 400) == 0) days = "6";
        else days = "5";

        System.out.println("Year " + year + " has 36" + days + " days.");

    }
}
