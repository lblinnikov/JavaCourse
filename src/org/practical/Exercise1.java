package org.practical;

public class Exercise1 {
    public static void main(String... arg) {

        int startPos = 0; // defines when start to print out chars
        int offset = 0;

        int space = 2; // defines value of whitespace amount

        String chr = "#";
        String whtspc = " ";

        //loop for printing out whitespaces
        // in first iteration 0, second 1, third 2 whitespaces
        for (startPos = 0; startPos<=2; startPos++) {
            whtspc = whtspc+whtspc;
            System.out.print(whtspc);
            System.out.println("");
        }


    }
}
