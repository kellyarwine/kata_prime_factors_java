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

    @Test
    public void testPrimeofThree() {
        p.factor(3);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(3);
        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testPrimeofEight() {
        p.factor(8);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(2);
        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testPrimeofSix() {
        p.factor(6);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(3);
        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testPrimeofNine() {
        p.factor(9);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(3);
        expectedResult.add(3);
        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testPrimeofTen() {
        p.factor(10);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(5);
        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testPrimeof48() {
        p.factor(48);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(3);
        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testPrimeof2LargePrimes() {
        p.factor(8191*130171);
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(8191);
        expectedResult.add(130171);
        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testPrimeof2tothe1000th() {
        p.factor( Math.pow(2,1000) );

        List<Integer> expectedResult = new ArrayList<Integer>();

        for (int i = 0; i < 1000; i++) {
            expectedResult.add(2);
        }

        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }

    @Test
    public void testPrimeof2tothe19thLess1() {
        p.factor( Math.pow(2,19) - 1 );

        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(524287);

        List <Integer> result = p.itsFactors;
        assertEquals(expectedResult, result);
    }


}