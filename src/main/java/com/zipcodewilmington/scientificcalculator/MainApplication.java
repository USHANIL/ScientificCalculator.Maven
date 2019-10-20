package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args)
    {
        Console.println("Welcome to my calculator!");
        String operation = Console.getStringInput("\n Select A (ADD) S (Subtract) M (Multiply) D (Divide) I (Invert Sign) i (Inverse) \n");
        char operator = operation.charAt(0);
        operatorSelect(operator);

        /*
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

         */
    }

    public static void operatorSelect(char operator)
    {
        Calculator cal = new Calculator();


        switch (operator)
        {

            case 'A':
                cal.getTwoNumbers();
                System.out.println( " \n Your Result is "+ cal.add(cal.firstNumber, cal.secondNumber)   );
                break;
            case 'S':
                cal.getTwoNumbers();
                System.out.println( " \n Your Result is "+ cal.subtract(cal.firstNumber, cal.secondNumber)   );
                break;
            case 'M':
                cal.getTwoNumbers();
                System.out.println( " \n Your Result is "+ cal.multiply(cal.firstNumber, cal.secondNumber)   );
                break;
            case 'D':
                cal.getTwoNumbers();
                if (cal.secondNumber != 0) {
                    System.out.println(" \n Your Result is " + cal.divide(cal.firstNumber, cal.secondNumber));
                    break;
                }
                else
                {
                    System.out.println("\n Error: You cannot divide by 0");
                }
            case 'I':
                cal.getOneNumber();
                System.out.println( " \n Invert Sign of " + cal.firstNumber + " is " + cal.invertSign(cal.firstNumber)   );
                break;
            case 'i':
                cal.getOneNumber();
                System.out.println( " \n Inverse  of " + cal.firstNumber + " is " + cal.inverse(cal.firstNumber)   );
                break;
            default:
                System.out.println("\n Please select a valid character");
        }
    }

}
