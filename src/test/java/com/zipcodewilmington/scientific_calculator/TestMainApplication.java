package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.sonatype.guice.bean.containers.Main;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    private MainApplication mainApp;

    @Before
    public void setup(){
        mainApp = new MainApplication();
    }

    @Test
    public void testInitialMemoryValue(){
        Assert.assertEquals(MainApplication.getMemory(), 0.0);
    }

    @Test
    public void testSetMemoryValue(){
        MainApplication.setMemory(9.1);
        Assert.assertEquals(MainApplication.getMemory(), 9.1);
    }

    // Note to Christine: write these after you understand how the program works
    @Test
    public void testSetCurrentValue(){
        // MainApplication.setMemory(9.1);
        // Assert.assertEquals(MainApplication.getMemory(), 9.1);
    }
}
