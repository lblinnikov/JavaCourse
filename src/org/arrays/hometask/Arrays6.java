package org.arrays.hometask;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays6 {
    public static void main(String... arg) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input count of integers: ");

        int n = userInput.nextInt();

        int[] intArr;
        intArr = new int[n]; // memory allocation

        // filling array
        for (int i=0;i<n;i++){
            System.out.println("Input element #" + (i + 1) + ": ");
            intArr[i] = userInput.nextInt();
        }

        Arrays.sort(intArr); // sort ASC

        // print out
        for (int i=0;i<n;i++){
            System.out.println(intArr[i]);
        }

    }

 }


