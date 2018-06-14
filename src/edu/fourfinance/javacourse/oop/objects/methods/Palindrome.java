package edu.fourfinance.javacourse.oop.objects.methods;

class Palindrome {

    static boolean isPalindrome(String string) {
        int startPos = 0;
        int endPos = string.length()-1;
        while (endPos>startPos){
            if (string.charAt(startPos)!=string.charAt(endPos)) return false;
            startPos++;
            endPos--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String string){
        int length = string.length();
        if (length<2) return true;
        else {
            if (string.charAt(0) != string.charAt(length - 1)) return false;
            else return isPalindromeRecursive(string.substring(1, length-1));
        }
    }
}
