package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable memberVariable;

    @Before
    public void setUp() throws Exception {

        memberVariable = new MemberVariable();

    }

    @After
    public void tearDown() throws Exception {

        memberVariable = null;

    }

    @Test
    public void display() {

        memberVariable.display();

    }
}