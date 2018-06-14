package edu.fourfinance.javacourse.oop.objects.methods;

class Palindrome {

    private static boolean isPalindrome(String string) {

        int startPos = 0;
        int endPos = string.length()-1;

        while (endPos>startPos){
            if (string.charAt(startPos)!=string.charAt(endPos)){
                return false;
            }
            startPos++;
            endPos--;
        }
        return true;
    }

    public static void main (String... arg) {

        System.out.println(isPalindrome("ABBA")); //true
        System.out.println(isPalindrome("ADAC")); //false

        System.out.println(isPalindrome("ABBAT")); //false
        System.out.println(isPalindrome("madam")); //true

        System.out.println(isPalindrome("")); //true

    }

}
