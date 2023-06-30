package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    
    
    Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
     //   Console.println("Welcome to my calculator!");
     //   String s = Console.getStringInput("Enter a string");
     //   Integer i = Console.getIntegerInput("Enter an integer");
     //   Double d = Console.getDoubleInput("Enter a double.");

      //  Console.println("The user input %s as a string", s);
      //  Console.println("The user input %s as a integer", i);
      //  Console.println("The user input %s as a d", d);

    DisplayMenu();




    }

    public static void DisplayMenu()
    {
        StringBuilder welcome = new StringBuilder();
        welcome.append("|----------------------------------------------------------------------------------------------------|" + '\n');
        welcome.append("|                                   Welcome Menu                                  a) Addition        |" +  '\n');
        welcome.append("|                                                                                 s) Subtraction     |" +  '\n');
        welcome.append("|                                                                                 m) Multiplication  |" +  '\n');
        welcome.append("|Please enter the character of the arithmetic function you would like to use:     d) Division        |" +  '\n');
        welcome.append("|                                                                                 q) Square          |" +  '\n');
        welcome.append("|                                                                                 r) Square Root     |" +  '\n');
        welcome.append("|                                                                                 i) Inverse         |" +  '\n');
        welcome.append("|----------------------------------------------------------------------------------------------------|"+    '\n');

        String WelcomeMenu = welcome.toString();
        System.out.println(WelcomeMenu);
        scan.next()
    }


}
