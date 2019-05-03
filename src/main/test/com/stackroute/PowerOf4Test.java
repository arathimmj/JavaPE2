package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4Test {

    PowerOf4 powerOf4;

    @Before
    public void setUp() throws Exception {

        powerOf4 = new PowerOf4();

    }

    @After
    public void tearDown() throws Exception {

        powerOf4 = null;

    }

    @Test
    public void testCheckPowerOf4WithPowerOf4(){

        boolean isPowerOf4 = powerOf4.checkPowerOf4(64);

        assertTrue(isPowerOf4);

    }

    @Test
    public void testCheckPowerOf4WithNoPowerOf4(){

        boolean isPowerOf4 = powerOf4.checkPowerOf4(55);

        assertFalse(isPowerOf4);

    }

    @Test
    public void testCheckPowerOf4With0(){

        boolean isPowerOf4 = powerOf4.checkPowerOf4(0);

        assertFalse(isPowerOf4);

    }

}