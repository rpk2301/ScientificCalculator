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
        Assert.assertEquals(0.0, MainApplication.getMemory());
    }

    @Test
    public void testSetMemoryValue(){
        MainApplication.setMemory(9.1);
        Assert.assertEquals(9.1, MainApplication.getMemory());
    }

    @Test
    public void testInitialCurrentValue(){
        Assert.assertEquals(0.0, MainApplication.getCurrentVal());
    }

    @Test
    public void testSetCurrentValue(){
         MainApplication.setval(9.1);
         Assert.assertEquals(9.1, MainApplication.getCurrentVal());
    }
}
