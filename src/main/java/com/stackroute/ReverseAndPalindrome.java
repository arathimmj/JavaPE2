package com.stackroute;

class ReverseAndPalindromeResult{

    private String reverseString;

    private boolean isPalindrome;

    public boolean getIsPalindrome() {
        return isPalindrome;
    }

    public void setIsPalindrome(boolean palindrome) {
        isPalindrome = palindrome;
    }

    public String getReverseString() {
        return reverseString;
    }

    public void setReverseString(String reverseString) {
        this.reverseString = reverseString;
    }
}

public class ReverseAndPalindrome {

    public String reverseString(String str){

        String reverseString = "";

        try{
            for (int i=str.length()-1;i>=0;i--){
                reverseString = reverseString + str.charAt(i);
            }
        }
        catch (Exception e){
            throw e;
        }

        return reverseString;
    }

    public boolean checkPalindrome(String str, String revString){

        if (str.equals(revString))
            return true;
        else
            return false;
    }

    public ReverseAndPalindromeResult reverseStringAndCheckIfPalindrome(String str){

        ReverseAndPalindromeResult reverseAndPalindromeResult = new ReverseAndPalindromeResult();
        String revString;
        boolean isPalindrome;

        try{
            revString = reverseString(str);
        }
        catch (Exception e){
            throw e;
        }
        reverseAndPalindromeResult.setReverseString(revString);

        try {
            isPalindrome = checkPalindrome(str, reverseAndPalindromeResult.getReverseString());
        }
        catch (Exception e){
            throw e;
        }

        reverseAndPalindromeResult.setIsPalindrome(isPalindrome);

        return reverseAndPalindromeResult;
    }
}
