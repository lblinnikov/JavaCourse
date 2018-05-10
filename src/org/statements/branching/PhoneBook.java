package org.statements.branching;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String region = "";
        String regCode = "";

        System.out.println("Please input your land-line telephone number: ");

        long lPhoneNum = userInput.nextLong();
        String sPhoneNum = Long.toString(lPhoneNum);

        if (sPhoneNum.length() > 9) System.out.println("Number too long! Expected 9 digits.");
        else if (sPhoneNum.length() < 9) System.out.println("Number too short! Expected 9 digits.");
        else {

            if (sPhoneNum.startsWith("2")) {
                regCode = "2";
                region = "Prague";
            } else {
                regCode = sPhoneNum.substring(0, 2);
                if (regCode.equals("31") || regCode.equals("32")) region = "Central Bohemian";
                else if (regCode.equals("35")) region = "Karlovy Vary";
                else if (regCode.equals("37")) region = "Plzen";
                else if (regCode.equals("38") || regCode.equals("39")) region = "South Bohemian";
                else if (regCode.equals("41") || regCode.equals("47")) region = "Usti nad Labem";
                else if (regCode.equals("46")) region = "Pardubice";
                else if (regCode.equals("48")) region = "Liberec";
                else if (regCode.equals("49")) region = "Hradec Kralove";
                else if (regCode.equals("51") || regCode.equals("53") || regCode.equals("54")) region = "South Moravian";
                else if (regCode.equals("55") || regCode.equals("59")) region = "Moravian-Silesian";
                else if (regCode.equals("56")) region = "Vysoсina";
                else if (regCode.equals("57")) region = "Zlin";
                else if (regCode.equals("58")) region = "Olomouc";
                else region = "Unknown";
            }

            // switch with String? possible in Java 7 and higher...?

            // I could use also startsWith() on codes which are 2 digits, couldn't see any downside of this method

            System.out.println("Regional code is " + regCode);
            System.out.println("Number belongs to " + region + " Region.");

        }

    }
}
