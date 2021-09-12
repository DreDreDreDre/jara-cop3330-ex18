package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main( String[] args )
    {
        String tempInput = "";
        String cfInput = "";
        double tempInputConversion;
        double tempConversion;
        Scanner sc = new Scanner(System.in);

        while(!cfInput.equals("C") && !cfInput.equals("F") && !cfInput.equals("c") && !cfInput.equals("f"))
        {
            System.out.println( "Press C to convert from Fahrenheit to Celsius." );
            System.out.println("Press F to convert from Celsius to Fahrenheit.");
            System.out.print("Your choice: ");
            cfInput = sc.nextLine();

            if(cfInput.equals("C") || cfInput.equals("c"))
            {
                while(!tempInput.matches("[0123456789.]+"))
                {
                    System.out.println("Please enter the temperature in Fahrenheit: ");
                    tempInput = sc.nextLine();
                    if(tempInput.matches("[0123456789.]+"))
                    {
                        tempInputConversion = Double.parseDouble(tempInput);
                        tempConversion = (tempInputConversion - 32) * 5 / 9;
                        System.out.println("The temperature in Celsius is " + tempConversion + ".");
                        break;
                    }
                }
                break;
            }
            else if(cfInput.equals("F") || cfInput.equals("f"))
            {
                while(!tempInput.matches("[0123456789.]+"))
                {
                    System.out.println("Please enter the temperature in Celsius: ");
                    tempInput = sc.nextLine();
                    if(tempInput.matches("[0123456789.]+"))
                    {
                        tempInputConversion = Double.parseDouble(tempInput);
                        tempConversion = (tempInputConversion * 9/5) + 32;
                        System.out.println("The temperature in Fahrenheit is " + tempConversion + ".");
                        break;
                    }
                }
                break;
            }
            else
            {
                System.out.println("You must enter a C or an F.");
            }
        }
        sc.close();
    }
}
