package org.arrays.hometask;

import java.util.Scanner;

public class Arrays1 {

    public static void main(String... arg) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input integer number n in range 0 to 20: ");

        int arrSize = userInput.nextInt();

        int[] intArr;
        intArr = new int[arrSize]; // memory allocation

        // filling array
        for (int i=0;i<arrSize;i++){
            intArr[i] = 3*(i + 1);
        }

        // printing array
        for (int i=0;i<arrSize;i++){
            System.out.println(intArr[i]);
        }

    }

}
