package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Arithmetic;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import java.util.Scanner;

public class TestArithmetic {
    private Arithmetic arithmetic;
    private Scanner in;

    @Before
    public void setup(){
        arithmetic = new Arithmetic();
    }

    /*
     * Addition tests
     */
    @Test
    public void testAdditionInts(){
        in = new Scanner("17 26");

        double result = arithmetic.add(in);
        Assert.assertEquals(result, 17.0+26.0);
    }

    @Test
    public void testAdditionDoubles(){
        in = new Scanner("1.7 2.6");

        double result = arithmetic.add(in);
        Assert.assertEquals(result, 1.7+2.6);
    }

    /*
     * Subtraction tests
     */
    @Test
    public void testSubtractionInts(){
        in = new Scanner("17 26");

        double result = arithmetic.sub(in);
        Assert.assertEquals(result, -9.0);
    }

    @Test
    public void testSubtractionDoubles(){
        in = new Scanner("1.7 2.6");

        double result = arithmetic.sub(in);
        Assert.assertEquals(result, 1.7-2.6);
    }

    /*
     * Multiplication tests
     */
    @Test
    public void testMultiplicationInts(){
        in = new Scanner("17 26");

        double result = arithmetic.mult(in);
        Assert.assertEquals(result, 17.0*26.0);
    }

    @Test
    public void testMultiplicationDoubles(){
        in = new Scanner("1.7 2.6");

        double result = arithmetic.mult(in);
        Assert.assertEquals(result, 1.7*2.6);
    }

    /*
     * Division tests
     */
    @Test
    public void testDivisionInts(){
        in = new Scanner("17 26");

        double result = arithmetic.div(in);
        Assert.assertEquals(result, 17.0/26.0);
    }

    @Test
    public void testDivisionDoubles(){
        in = new Scanner("1.7 2.6");

        double result = arithmetic.div(in);
        Assert.assertEquals(result, 4.42);
    }
}
