package org.arrays.hometask;

import java.util.Scanner;

public class Arrays5 {

    public static void main(String... arg) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input width/height of array N: ");

        int rows = userInput.nextInt();
        int columns = rows;

        int[][] arr2dim = new int[rows][columns]; // memory allocation

        // filling array
        for (int r=0;r<rows;r++){
            arr2dim[r] = new int[rows-r];
            for (int c=0;c<columns;c++){
                arr2dim[c] = new int[columns-c];
            }
        }

        // printing array
        for (int r=0;r<rows;r++){
            System.out.println(arr2dim[r]);
            for (int c=0;c<columns;c++){
                System.out.println(arr2dim[c]);
            }
        }

    }

}
