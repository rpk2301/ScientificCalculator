package com.zipcodewilmington.scientificcalculator;

import org.sonatype.guice.bean.containers.Main;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Arithmetic {
    private Scanner scan;
    String welcome =
            ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                    ("|                                   Welcome Menu                                  a) Addition        |" + '\n') +
                    ("|                                                                                 s) Subtraction     |" + '\n') +
                    ("|                                                                                 m) Multiplication  |" + '\n') +
                    ("|Please enter the character of the arithmetic function you would like to use:     d) Division        |" + '\n') +
                    ("|                                                                                 q) Square          |" + '\n') +
                    ("|                                                                                 r) Square Root     |" + '\n') +
                    ("|                                                                                 i) Inverse         |" + '\n') +
                    ("|                                                                                 c) Check Memory    |" + '\n') +
                    ("|----------------------------------------------------------------------------------------------------|" + '\n');

    public Arithmetic() {
        scan = new Scanner(System.in);
    }

    ;

    public void DisplayMenu(Scanner response2) {


        System.out.println(welcome);
        String response = response2.nextLine();
        char character = response.toLowerCase().charAt(0);
        switch (character) {
            case 'a':
                add(run());
                break;
            case 's':
                sub(run());
                break;
            case 'm':
                mult(run());
                break;
            case 'd':
                div(run());
                break;
            case 'q':
                square(run());
                break;
            case 'r':
                sqrt(run());
                break;
            case 'i':
                inv(run());
                break;
            case 'c':
                DisplayMemory(run());
            default:
                System.out.println("");
                System.out.println("");
                System.out.println("You have selected an invalid input.");
                System.out.println("Waiting three seconds and restarting");
                try {
                    Thread.sleep(3000); // Pause for 5 seconds (5000 milliseconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Program Resuming");
                try {
                    Thread.sleep(2000); // Pause for 5 seconds (5000 milliseconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                DisplayMenu(run());
        }
        results(run());
    }

    public static double add(Scanner response) {

        String addi = ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                ("|                                   Calculation Menu                                                 |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|Please enter the number you would like to add first:                                                |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|----------------------------------------------------------------------------------------------------|" + '\n');
        System.out.println(addi);
        double ret1 = response.nextDouble();
        String add2 = ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                ("|                                   Calculation Menu                                                 |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|Please enter the number you would like to add to:    " + ret1 + "                                    " + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|----------------------------------------------------------------------------------------------------|" + '\n');
        System.out.println(add2);
        double ret = response.nextDouble();
        response.nextLine();//This statement consumes the nextline character.

        double a = (ret1 + ret);
        MainApplication.setval(a);

        return a;


    }


    public static double sub(Scanner response) {
        String addi = ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                ("|                                   Calculation Menu                                                 |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|Please enter the number you would like to subtract from first:                                      |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|----------------------------------------------------------------------------------------------------|" + '\n');

        System.out.println(addi);
        double ret1 = response.nextDouble();
        String add2 = ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                ("|                                   Calculation Menu                                                 |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|Please enter the number you would like to subtract from:    " + ret1 + "                             " + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|----------------------------------------------------------------------------------------------------|" + '\n');
        System.out.println(add2);


        double ret2 = response.nextDouble();
        response.nextLine();//This statement consumes the nextline character.
        double fin = (ret1 - ret2);
        MainApplication.setval(fin);
        return fin;

    }


    public static double mult(Scanner response) {
        String addi =
                ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                        ("|                                   Calculation Menu                                                 |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|Please enter the number you would like to Multiply from first:                                      |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|----------------------------------------------------------------------------------------------------|" + '\n');
        System.out.println(addi);
        double ret1 = response.nextDouble();
        String add2 = ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                ("|                                   Calculation Menu                                                 |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|Please enter the number you would like to multiply to:    " + ret1 + "                               " + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|----------------------------------------------------------------------------------------------------|" + '\n');
        System.out.println(add2);
        double ret2 = response.nextDouble();
        response.nextLine();//This statement consumes the nextline character.
        double f = (ret1 * ret2);
        MainApplication.setval(f);
        return f;
    }


    public static double div(Scanner response) {
        String addi =
                ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                        ("|                                   Calculation Menu                                                 |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|Please enter the number you would like to divide from first:                                        |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|----------------------------------------------------------------------------------------------------|" + '\n');
        String add2 = ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                ("|                                   Calculation Menu                                                 |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|Please enter the number you would like to divide        ");
        String add2pt2 = (" by                              " + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|----------------------------------------------------------------------------------------------------|" + '\n');

        double ret1;
        double ret2;
        // things Christine is changing
        do {
            System.out.println(addi);
            ret1 = response.nextDouble();
            System.out.println(add2 + ret1 + add2pt2);
            ret2 = response.nextDouble();
            response.nextLine();//This statement consumes the nextline character.

            if (ret2 == 0) {
                System.out.println("You cannot divide by 0. Restarting Program");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Restarting now");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (ret2 == 0);

        double f = (ret1 / ret2);
        MainApplication.setval(f);
        return f;
    }

    public static double square(Scanner response) {
        String addi =
                ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                        ("|                                   Calculation Menu                                                 |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|Please enter the number you would like to square:                                                   |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|----------------------------------------------------------------------------------------------------|" + '\n');

        System.out.println(addi);
        double ret2 = response.nextDouble();
        response.nextLine();//This statement consumes the nextline character.
        double f = (ret2 * ret2);
        MainApplication.setval(f);
        return f;


    }


    public static double sqrt(Scanner response) {
        String addi =
                ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                        ("|                                   Calculation Menu                                                 |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|Please enter the number you would like to take the square root of                                   |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|----------------------------------------------------------------------------------------------------|" + '\n');

        System.out.println(addi);
        double ret2 = response.nextDouble();
        response.nextLine();//This statement consumes the nextline character.

        double f = Math.sqrt(ret2);
        MainApplication.setval(f);
        return f;
    }


    public static double inv(Scanner response) {
        String addi =
                ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                        ("|                                   Calculation Menu                                                 |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|Please enter the number you would like to take the inverse of:                                      |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|                                                                                                    |" + '\n') +
                        ("|----------------------------------------------------------------------------------------------------|" + '\n');
        double ret2 = 0;
        // things Christine is changing
        do {
            System.out.println(addi);
            ret2 = response.nextDouble();
            response.nextLine();//This statement consumes the nextline character.

            if (ret2 == 0) {
                System.out.println("You cannot take the inverse of 0. Restarting Program");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Restarting now");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (ret2 == 0);

        double inv = 1 / ret2;
        MainApplication.setval(inv);
        return (1 / ret2);
    }

    public void results(Scanner response2) {

        double res = MainApplication.getCurrentVal();

        String addi = ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                ("|                                   Results Menu                                                     |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|The result of your calculation is:    " + res + "                                                    " + '\n') +
                ("|                                                          a)Clear display and do a new calculation  |" + '\n') +
                ("|Please select what you would like to do next              b)Store result in memory                  |" + '\n') +
                ("|                                                          c)Quit App                                |" + '\n') +
                ("|----------------------------------------------------------------------------------------------------|" + '\n');
        System.out.println(addi);
        String response;
        response= response2.nextLine();
        char character = response.toLowerCase().charAt(0);
        switch (character) {
            case 'a':
                ClearDisplay();
                break;
            case 'b':
                StoreMemory(res);
                DisplayMenu(run());
                break;
            case 'c':
                QuitApp();
                break;
            default:
                System.out.println("");
                System.out.println("");
                System.out.println("You have selected an invalid input.");
                System.out.println("Waiting three seconds and restarting");
                try {
                    Thread.sleep(3000); // Pause for 5 seconds (5000 milliseconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Program Resuming");
                try {
                    Thread.sleep(2000); // Pause for 5 seconds (5000 milliseconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                results(run());
        }

    }

    public void QuitApp() {
        System.exit(0);
    }

    public void ClearDisplay() {
        MainApplication.setval(0);
        DisplayMenu(run());
    }


    public Scanner run() {
        return this.scan;

    }

    public void StoreMemory(double CurrentValue) {
        MainApplication.setMemory(CurrentValue);
    }

    public void DisplayMemory(Scanner scan) {

        String menu = ("|----------------------------------------------------------------------------------------------------|" + '\n') +
                ("|                                   Memory Menu            a)Go back to main menu                    |" + '\n') +
                ("|                                                          b)Clear memory                            |" + '\n') +
                ("|                                                          c)Quit App                                |" + '\n') +
                ("|The current value of your memory is:     " + MainApplication.getMemory() + "                         " + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|Please select what you would like to do next                                                        |" + '\n') +
                ("|                                                                                                    |" + '\n') +
                ("|----------------------------------------------------------------------------------------------------|" + '\n');
        System.out.println(menu);
        String scanf = scan.nextLine();
        char character = scanf.toLowerCase().charAt(0);
        switch (character) {
            case 'a':
                DisplayMenu(run());
                break;
            case 'b':
                MainApplication.setMemory(0);
                DisplayMenu(run());
                break;
            case 'c':
                QuitApp();
                break;
            default:
                System.out.println("");
                System.out.println("");
                System.out.println("You have selected an invalid input.");
                System.out.println("Waiting three seconds and restarting");
                try {
                    Thread.sleep(3000); // Pause for 5 seconds (5000 milliseconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Program Resuming");
                try {
                    Thread.sleep(2000); // Pause for 5 seconds (5000 milliseconds)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                DisplayMemory(run());
        }


    }
}
