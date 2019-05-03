package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordFrequencyInFileTest {

    WordFrequencyInFile wordFrequencyInFile;

    @Before
    public void setUp() throws Exception {

        wordFrequencyInFile = new WordFrequencyInFile();
    }

    @After
    public void tearDown() throws Exception {

        wordFrequencyInFile = null;
    }

    @Test
    public void findWordFrequency() {

        wordFrequencyInFile.findWordFrequency();

    }
}