package org.arrays.hometask;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input length K: ");

        int length = userInput.nextInt();

        System.out.println("Please input count N of Integer array elements: ");

        int arrSize = userInput.nextInt();

        int[] intArr;
        intArr = new int[arrSize]; // memory allocation

        // filling array
        for (int i=0;i<arrSize;i++){
            System.out.println("Input element #" + (i + 1) + ": ");
            intArr[i] = userInput.nextInt();
        }

        // manipulations
        //
        for (int i=(arrSize-1);i>=0;i--){
            System.out.println(intArr[i]);
        }

    }

}
