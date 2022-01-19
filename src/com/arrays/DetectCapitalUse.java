package com.arrays;

public class DetectCapitalUse {

    public boolean detectCapitalUse(String word) {
        char[] wordArray = word.toCharArray();
        for (int i = 0; i < wordArray.length; i++) {
            if (checkerSmall(wordArray[i]) && checkerCapital(wordArray[i+1])) return false;
        }
        return true;
    }

    public boolean checkerCapital(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public boolean checkerSmall(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static void main(String[] args) {
        DetectCapitalUse obj = new DetectCapitalUse();
        System.out.println(obj.detectCapitalUse("Flag"));
    }
}

