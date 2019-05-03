package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class readFileAndPrintTest {

    ReadFileAndPrint readFileAndPrint;

    @Before
    public void setUp() throws Exception {

        readFileAndPrint = new ReadFileAndPrint();

    }

    @After
    public void tearDown() throws Exception {

        readFileAndPrint = null;

    }

    @Test
    public void readAndPrintFile() {

        readFileAndPrint.readAndPrintFile();

    }
}