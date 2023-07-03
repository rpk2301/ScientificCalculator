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
    @Before
    public void setup(){
    }

    @Test
    public void testInitialMemoryValue(){
        Assert.assertEquals(0.0, MainApplication.getMemory(), 0.01);
    }

    @Test
    public void testSetMemoryValue(){
        MainApplication.setMemory(9.1);
        Assert.assertEquals(9.1, MainApplication.getMemory(), 0.01);
    }

    @Test
    public void testCurrentValue(){
        Assert.assertEquals(0.0, MainApplication.getCurrentVal(), 0.01);
        MainApplication.setval(9.1);
        Assert.assertEquals(9.1, MainApplication.getCurrentVal(), 0.01);
    }
}
