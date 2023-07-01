package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
private static double CurrentValue=0;
    public MainApplication()
    {

    }
    public static void main(String[] args) {
        Arithmetic menus = new Arithmetic();
        menus.DisplayMenu(menus.run());
    }
    public static double getCurrentVal()
    {
        return CurrentValue;
    }
    public  static  double  setval(double f)
    {
    CurrentValue = f;
    return f;
    }
}