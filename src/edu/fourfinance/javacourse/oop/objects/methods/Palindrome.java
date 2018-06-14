package edu.fourfinance.javacourse.oop.objects.methods;

class Palindrome {

    private static boolean isPalindrome(String string) {
        int startPos = 0;
        int endPos = string.length()-1;
        while (endPos>startPos){
            if (string.charAt(startPos)!=string.charAt(endPos)) return false;
            startPos++;
            endPos--;
        }
        return true;
    }

    private static boolean isPalindromeRecursive(String string){
        int length = string.length();
        if (length<2) return true;
        else {
            if (string.charAt(0) != string.charAt(length - 1)) return false;
            else return isPalindromeRecursive(string.substring(1, length-1));
        }
    }

    public static void main (String... arg) {

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

}
