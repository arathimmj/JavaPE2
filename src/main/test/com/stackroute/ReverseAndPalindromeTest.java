package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseAndPalindromeTest {

    ReverseAndPalindromeResult reverseAndPalindromeResult;
    ReverseAndPalindromeResult expectedReverseAndPalindromeResult;
    ReverseAndPalindrome reverseAndPalindrome;
    String expectedReverseString;
    String reverseString;
    boolean expectedIsPalindrome;
    boolean isPalindrome;

    @Before
    public void setUp() throws Exception {

        reverseAndPalindromeResult = new ReverseAndPalindromeResult();
        expectedReverseAndPalindromeResult = new ReverseAndPalindromeResult();
        reverseAndPalindrome = new ReverseAndPalindrome();
        expectedReverseString = "";
        reverseString ="";
        expectedIsPalindrome = false;
        isPalindrome = false;
    }

    @After
    public void tearDown() throws Exception {

        reverseAndPalindromeResult = null;
        expectedReverseAndPalindromeResult = null;
        reverseAndPalindrome = null;
        expectedReverseString = null;
        reverseString = null;
        expectedIsPalindrome = false;
        isPalindrome = false;

    }

    @Test
    public void testReverseString(){

        expectedReverseString = "etuoRkcatS";

        reverseString = reverseAndPalindrome.reverseString("StackRoute");

        assertEquals(expectedReverseString,reverseString);

    }

    @Test(expected = NullPointerException.class)
    public void testReverseStringWithNull(){

        reverseString = reverseAndPalindrome.reverseString(null);

    }

    @Test
    public void testPalindromeNotPalindrome(){

        isPalindrome = reverseAndPalindrome.checkPalindrome("StackRoute", "etuoRkcatS");

        assertFalse(isPalindrome);
    }

    @Test
    public void testPalindromePalindrome(){

        isPalindrome = reverseAndPalindrome.checkPalindrome("malayalam", "malayalam");

        assertTrue(isPalindrome);
    }

    @Test(expected = NullPointerException.class)
    public void testPalindromeWithNull(){

        isPalindrome = reverseAndPalindrome.checkPalindrome(null, null);

    }

    @Test
    public void testReverseStringAndCheckIfPalindromeNotPalindrome(){

        expectedReverseAndPalindromeResult.setReverseString("etuoRkcatS");
        expectedReverseAndPalindromeResult.setIsPalindrome(false);

        reverseAndPalindromeResult = reverseAndPalindrome.reverseStringAndCheckIfPalindrome("StackRoute");

        assertEquals(expectedReverseAndPalindromeResult.getReverseString(), reverseAndPalindromeResult.getReverseString());
        assertFalse(reverseAndPalindromeResult.getIsPalindrome());
    }

    @Test
    public void testReverseStringAndCheckIfPalindromePalindrome(){

        expectedReverseAndPalindromeResult.setReverseString("malayalam");
        expectedReverseAndPalindromeResult.setIsPalindrome(true);

        reverseAndPalindromeResult = reverseAndPalindrome.reverseStringAndCheckIfPalindrome("malayalam");

        assertEquals(expectedReverseAndPalindromeResult.getReverseString(), reverseAndPalindromeResult.getReverseString());
        assertTrue(reverseAndPalindromeResult.getIsPalindrome());
    }

    @Test(expected = NullPointerException.class)
    public void testReverseStringAndCheckIfPalindromeWithNull(){

        reverseAndPalindromeResult = reverseAndPalindrome.reverseStringAndCheckIfPalindrome(null);

    }

}