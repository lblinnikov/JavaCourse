package org.arrays.hometask;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String... arg) {

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

        // create subset array with length K
        int[] lengthSub;
        lengthSub = new int[length];

        double avg;
        int sum;

        for (int i=0;i<(arrSize-length+1);i++){
            System.arraycopy(intArr, i, lengthSub, 0, length);
            sum = 0;
            for (int j=0;j<length;j++) {
                sum = sum+lengthSub[j];
            }
            avg = (double)sum/length;
            System.out.println("#" + (i + 1) + " set rolling average: " + avg);
        }

    }

}
