package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class TestArithmetic {
    private Arithmetic arithmetic;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Scanner in;

    @Before
    public void setup(){
        arithmetic = new Arithmetic();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    /*
     * Addition tests
     */
    @Test
    public void testAdditionInts(){
        in = new Scanner("17 26");

        double result = arithmetic.add(in);
        Assert.assertEquals(17.0+26.0, result);
    }

    @Test
    public void testAdditionDoubles(){
        in = new Scanner("1.7 2.6");

        double result = arithmetic.add(in);
        Assert.assertEquals(1.7+2.6, result);
    }

    /*
     * Subtraction tests
     */
    @Test
    public void testSubtractionInts(){
        in = new Scanner("17 26");

        double result = arithmetic.sub(in);
        Assert.assertEquals(-9.0, result);
    }

    @Test
    public void testSubtractionDoubles(){
        in = new Scanner("1.7 2.6");

        double result = arithmetic.sub(in);
        Assert.assertEquals(1.7-2.6, result);
    }

    /*
     * Multiplication tests
     */
    @Test
    public void testMultiplicationInts(){
        in = new Scanner("17 26");

        double result = arithmetic.mult(in);
        Assert.assertEquals(17.0*26.0, result);
    }

    @Test
    public void testMultiplicationDoubles(){
        in = new Scanner("1.7 2.6");

        double result = arithmetic.mult(in);
        Assert.assertEquals(1.7*2.6, result);
    }

    /*
     * Division tests
     */
    @Test
    public void testDivisionInts(){
        in = new Scanner("17 26");

        double result = arithmetic.div(in);
        Assert.assertEquals(17.0/26.0, result);
    }

    @Test
    public void testDivisionDoubles(){
        in = new Scanner("1.7 2.6");

        double result = arithmetic.div(in);
        Assert.assertEquals(4.42, result);
    }

    @Test
    public void testDivisionBy0(){
        in = new Scanner("0 0 17 26");
        String divErrMessage = "You cannot divide by 0. Restarting Program";

        double result = arithmetic.div(in);
        Assert.assertTrue(outContent.toString().contains(divErrMessage));
        Assert.assertEquals(17.0/26.0, result);
    }
    /*
     * Square tests
     */
    @Test
    public void testSquareInts(){
        in = new Scanner("17");

        double result = arithmetic.square(in);
        Assert.assertEquals(17.0*17.0, result);
    }

    @Test
    public void testSquareDoubles(){
        in = new Scanner("1.7");

        double result = arithmetic.square(in);
        Assert.assertEquals(1.7*1.7, result);
    }

    /*
     * Square Root tests
     */
    @Test
    public void testSquareRootInts(){
        in = new Scanner("169");

        double result = arithmetic.sqrt(in);
        Assert.assertEquals(13.0, result);
    }

    @Test
    public void testSquareRootDoubles(){
        in = new Scanner("1.69");

        double result = arithmetic.sqrt(in);
        Assert.assertEquals(1.3, result);
    }

    /*
     * Inverse tests
     */
    @Test
    public void testInverse(){
        in = new Scanner("17");

        double result = arithmetic.inv(in);
        Assert.assertEquals(1.0/17.0, result);
    }

    @Test
    public void testInverseOf0(){
        in = new Scanner("0 17");
        String invErrMessage = "You cannot take the inverse of 0. Restarting Program";

        double result = arithmetic.div(in);
        Assert.assertTrue(outContent.toString().contains(invErrMessage));
        Assert.assertEquals(1.0/17.0, result);
    }
}
