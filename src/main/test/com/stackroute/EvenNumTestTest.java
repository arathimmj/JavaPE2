package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest evenNumTest;

    @Before
    public void setUp() throws Exception {

        evenNumTest = new EvenNumTest();

    }

    @After
    public void tearDown() throws Exception {
        evenNumTest = null;
    }

    @Test
    public void testEvenNumTestEven(){

        boolean isEven = evenNumTest.isEven(22);

        assertTrue(isEven);

    }

    @Test
    public void testEvenNumTestOdd(){

        boolean isEven = evenNumTest.isEven(23);

        assertFalse(isEven);

    }

}