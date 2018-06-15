package edu.fourfinance.javacourse.oop.objects.methods;


import static edu.fourfinance.javacourse.oop.objects.methods.Hanoi.hanoiTower;
import static edu.fourfinance.javacourse.oop.objects.methods.Palindrome.isPalindrome;
import static edu.fourfinance.javacourse.oop.objects.methods.Palindrome.isPalindromeRecursive;
import static edu.fourfinance.javacourse.oop.objects.methods.Power.intPower;
import static edu.fourfinance.javacourse.oop.objects.methods.Power.intPowerRecursive;

class Tests {

    private static void palindromeTest(){

        System.out.println("----PALINDROME-TEST----");

        System.out.println(isPalindrome("ABBA")); //true
        System.out.println(isPalindrome("ADAC")); //false

        System.out.println(isPalindrome("ABBAT")); //false
        System.out.println(isPalindrome("madam")); //true

        System.out.println(isPalindrome("")); //true

        System.out.println("-------RECURSIVE-------");

        System.out.println(isPalindromeRecursive("ABBA")); //true
        System.out.println(isPalindromeRecursive("ADAC")); //false

        System.out.println(isPalindromeRecursive("ABBAT")); //false
        System.out.println(isPalindromeRecursive("madam")); //true

        System.out.println(isPalindromeRecursive("")); //true

    }

    private static void powerTest(){

        System.out.println("---------POWER---------");

        System.out.println(
                intPower(2,2)
        );

        System.out.println(
                intPower(2,1)
        );

        System.out.println(
                intPower(2,0)
        );

        System.out.println(
                intPower(1,0)
        );

        System.out.println(
                intPower(0,1)
        );

        System.out.println(
                intPower(0,0)
        );

        System.out.println("-------RECURSIVE-------");

        System.out.println(
                intPowerRecursive(2,2)
        );

        System.out.println(
                intPowerRecursive(2,1)
        );

        System.out.println(
                intPowerRecursive(2,0)
        );

        System.out.println(
                intPowerRecursive(1,0)
        );

        System.out.println(
                intPowerRecursive(0,1)
        );

        System.out.println(
                intPowerRecursive(0,0)
        );

    }

    private static void hanoiTest(){
        System.out.println("-------HANOI-------");
        int n = 4;
        hanoiTower(n, 'A', 'C', 'B');
    }

    public static void main(String... arg) {
        palindromeTest();
        powerTest();
        hanoiTest();
    }

}

