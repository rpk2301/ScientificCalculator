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
        in = new Scanner("17 26 \n");

        double result = arithmetic.add(in);
        Assert.assertEquals(17.0+26.0, result, 0.01);
    }

    @Test
    public void testAdditionDoubles(){
        in = new Scanner("1.7 2.6 \n");

        double result = arithmetic.add(in);
        Assert.assertEquals(1.7+2.6, result, 0.01);
    }

    /*
     * Subtraction tests
     */
    @Test
    public void testSubtractionInts(){
        in = new Scanner("17 26 \n");

        double result = arithmetic.sub(in);
        Assert.assertEquals(-9.0, result, 0.01);
    }

    @Test
    public void testSubtractionDoubles(){
        in = new Scanner("1.7 2.6 \n");

        double result = arithmetic.sub(in);
        Assert.assertEquals(1.7-2.6, result, 0.01);
    }

    /*
     * Multiplication tests
     */
    @Test
    public void testMultiplicationInts(){
        in = new Scanner("17 26 \n");

        double result = arithmetic.mult(in);
        Assert.assertEquals(17.0*26.0, result, 0.01);
    }

    @Test
    public void testMultiplicationDoubles(){
        in = new Scanner("1.7 2.6 \n");

        double result = arithmetic.mult(in);
        Assert.assertEquals(1.7*2.6, result, 0.01);
    }

    /*
     * Division tests
     */
    @Test
    public void testDivisionInts(){
        in = new Scanner("17 26 \n");

        double result = arithmetic.div(in);
        Assert.assertEquals(17.0/26.0, result, 0.01);
    }

    @Test
    public void testDivisionDoubles(){
        in = new Scanner("1.7 2.6 \n");

        double result = arithmetic.div(in);
        Assert.assertEquals(1.7/2.6, result, 0.01);
    }

    @Test
    public void testDivisionBy0(){
        in = new Scanner("0 \n 0 \n 17 26 \n");
        String divErrMessage = "You cannot divide by 0.";

        double result = arithmetic.div(in);
        Assert.assertTrue(outContent.toString().contains(divErrMessage));
        Assert.assertEquals(17.0/26.0, result, 0.01);
    }
    /*
     * Square tests
     */
    @Test
    public void testSquareInts(){
        in = new Scanner("17 \n");

        double result = arithmetic.square(in);
        Assert.assertEquals(17.0*17.0, result, 0.01);
    }

    @Test
    public void testSquareDoubles(){
        in = new Scanner("1.7 \n");

        double result = arithmetic.square(in);
        Assert.assertEquals(1.7*1.7, result, 0.01);
    }

    /*
     * Square Root tests
     */
    @Test
    public void testSquareRootInts(){
        in = new Scanner("169 \n");

        double result = arithmetic.sqrt(in);
        Assert.assertEquals(13.0, result, 0.01);
    }

    @Test
    public void testSquareRootDoubles(){
        in = new Scanner("1.69 \n");

        double result = arithmetic.sqrt(in);
        Assert.assertEquals(1.3, result, 0.01);
    }

    /*
     * Inverse tests
     */
    @Test
    public void testInverse(){
        in = new Scanner("17 \n");

        double result = arithmetic.inv(in);
        Assert.assertEquals(1.0/17.0, result, 0.01);
    }

    @Test
    public void testInverseOf0(){
        in = new Scanner("0 \n 17 \n");
        String invErrMessage = "You cannot take the inverse of 0.";

        double result = arithmetic.inv(in);
        Assert.assertTrue(outContent.toString().contains(invErrMessage));
        Assert.assertEquals(1.0/17.0, result, 0.01);
    }
}
