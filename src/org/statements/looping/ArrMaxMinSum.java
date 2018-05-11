package org.statements.looping;

import java.util.Arrays;
import java.util.Scanner;

public class ArrMaxMinSum {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input count of integers: ");

        int n = userInput.nextInt();
        int sum = 0;
        int max;
        int min;

        int[] intArr;
        intArr = new int[n]; // memory allocation

        // filling array
        for (int i=0;i<n;i++){
            System.out.println("Input element #" + (i + 1) + ": ");
            intArr[i] = userInput.nextInt();
            sum = sum + intArr[i];
        }

        System.out.println("Array filled!");

        Arrays.sort(intArr); // sort ASC
        min = intArr[0]; // gets first (smallest) element in sorted arr
        max = intArr[n-1]; // gets last (biggest) element in sorted arr

        System.out.println("Results: ");
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);

    }

 }


