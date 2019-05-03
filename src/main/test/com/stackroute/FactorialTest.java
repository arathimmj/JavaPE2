package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial fact;

    @Before
    public void setUp() throws Exception {

        fact = new Factorial();
    }

    @After
    public void tearDown() throws Exception {

        fact = null;
    }

    @Test
    public void getFactorial() {

        fact.getFactorial();

    }
}