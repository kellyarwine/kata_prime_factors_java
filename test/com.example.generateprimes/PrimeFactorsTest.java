package com.example.generateprimes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(JUnit4.class)
public class PrimeFactorsTest {
    private PrimeFactors p;

    @Before
    public void setUp() {
        p = new PrimeFactors();
    }

    @Test
    public void testPrimeOfOne() {
        PrimeFactors p = new PrimeFactors();
        p.factor(1);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(1);
        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testPrimeofTwo() {
        p.factor(2);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testPrimeofFour() {
        p.factor(4);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(2);
        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }

}