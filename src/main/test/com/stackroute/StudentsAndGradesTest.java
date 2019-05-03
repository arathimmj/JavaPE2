package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsAndGradesTest {

    MinMaxAvg minMaxAvg;
    MinMaxAvg expectedMinMaxAvg;
    StudentsAndGrades studentsAndGrades;

    @Before
    public void setUp() throws Exception {

        minMaxAvg = new MinMaxAvg();
        expectedMinMaxAvg = new MinMaxAvg();
        studentsAndGrades = new StudentsAndGrades();

    }

    @After
    public void tearDown() throws Exception {

        minMaxAvg = null;
        expectedMinMaxAvg = null;
        studentsAndGrades = null;

    }

    @Test
    public void testMinMaxAvg(){

        int[] arr = {86, 65, 98, 79};

        expectedMinMaxAvg.setMin(65);
        expectedMinMaxAvg.setMax(98);
        expectedMinMaxAvg.setAvg(82);

        minMaxAvg = studentsAndGrades.findMinMaxAvg(4, arr);

        assertEquals(minMaxAvg.getAvg(), expectedMinMaxAvg.getAvg(), 0.02);

    }
}