package org.statements.looping;

import java.util.Arrays;
import java.util.Scanner;

public class ArrSecondLargest {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input count of integers: ");

        int n = userInput.nextInt();
        int secondLargest;

        int[] intArr;
        intArr = new int[n]; // memory allocation

        // filling array
        for (int i=0;i<n;i++){
            System.out.println("Input element #" + (i + 1) + ": ");
            intArr[i] = userInput.nextInt();
        }

        System.out.println("Array filled!");

        Arrays.sort(intArr); // sort ASC
        secondLargest = intArr[n-2]; // gets second largest element in sorted arr

        System.out.println("Second largest: " + secondLargest);


    }

 }


