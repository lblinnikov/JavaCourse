package org.statements.looping;

import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input string terminated by \"\\\": ");

        String inputString = userInput.next();

        // TODO Text Processor

        System.out.println("Processed string:");
        System.out.println(inputString);

    }

}
