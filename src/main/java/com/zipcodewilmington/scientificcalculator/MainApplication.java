package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    private static double CurrentValue = 0;
    private static double Memory = 0;

    public static void main(String[] args) {
        Arithmetic menus = new Arithmetic();
        menus.DisplayMenu(menus.run());
    }

    public static double getCurrentVal() {
        return CurrentValue;
    }

    public static double getMemory() {
        return Memory;
    }

    public static void setMemory(double memory) {
        Memory = memory;
    }

    public static void setval(double f) {
        CurrentValue = f;
    }
}