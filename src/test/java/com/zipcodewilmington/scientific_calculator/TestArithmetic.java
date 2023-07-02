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
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
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

    @Test
    public void testDivisionBy0(){
        in = new Scanner("0 0 17 26");
        StringBuilder sb = new StringBuilder();
        String divMenu1 =
                ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                ("|                                   Calculation Menu                                                 |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|Please enter the number you would like to divide from first:                                        |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|----------------------------------------------------------------------------------------------------|" + '\n');
        String divMenu2 =
                ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                ("|                                   Calculation Menu                                                 |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|Please enter the number you would like to divide        " + ret1 + " by                                     |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|----------------------------------------------------------------------------------------------------|" + '\n');
        String divErrMessage = "You cannot divide by 0. Restarting Program\n";
        sb.append(divMenu1);
        sb.append(divMenu2);
        sb.append(divErrMessage);

        double result = arithmetic.div(in);
        Assert.assertEquals(outContent.toString(), sb.toString());
        Assert.assertEquals(result, 17.0/26.0);
    }
    /*
     * Square tests
     */
    @Test
    public void testSquareInts(){
        in = new Scanner("17");

        double result = arithmetic.square(in);
        Assert.assertEquals(result, 17.0*17.0);
    }

    @Test
    public void testSquareDoubles(){
        in = new Scanner("1.7");

        double result = arithmetic.square(in);
        Assert.assertEquals(result, 1.7*1.7);
    }

    /*
     * Square Root tests
     */
    @Test
    public void testSquareRootInts(){
        in = new Scanner("169");

        double result = arithmetic.sqrt(in);
        Assert.assertEquals(result, 13.0);
    }

    @Test
    public void testSquareRootDoubles(){
        in = new Scanner("1.69");

        double result = arithmetic.sqrt(in);
        Assert.assertEquals(result, 1.3);
    }

    /*
     * Inverse tests
     */
    @Test
    public void testInverse(){
        in = new Scanner("17");

        double result = arithmetic.inv(in);
        Assert.assertEquals(result, 1.0/17.0);
    }

    @Test
    public void testInverseOf0(){
        in = new Scanner("0 17");
        StringBuilder sb = new StringBuilder();
        String invMenu =
                ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                        ("|                                   Calculation Menu                                                 |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|Please enter the number you would like to take the inverse of:                                      |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|----------------------------------------------------------------------------------------------------|" + '\n');
        String invErrMessage = "You cannot take the inverse of 0. Restarting Program\n";
        sb.append(invMenu);
        sb.append(invErrMessage);

        double result = arithmetic.div(in);
        Assert.assertEquals(outContent.toString(), sb.toString());
        Assert.assertEquals(result, 1.0/17.0);
    }

}
