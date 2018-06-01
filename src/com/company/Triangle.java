package com.company;

import java.util.Scanner;


public class Triangle {

    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Entry 0 to exist");

        System.out.print("First Side of the triangle ? ");
        num1 = keyboard.nextDouble();

        System.out.print("Second Side of the triangle? ");
        num2 = keyboard.nextDouble();

        System.out.print("Third side of the triangle? ");
        num3 = keyboard.nextDouble();

        while(num1 != 0 && num2 !=0 && num3 !=0 ) {
          if(num1 == num2 && num1 == num3 && num2 == num3){
              System.out.println("The data entered reflects a equilateral triangle.");

          }
          else {

              if(Math.pow(num1,2)== Math.pow(num2,2)+ Math.pow(num3,2)
                      || Math.pow(num2,2)== Math.pow(num1,2) + Math.pow(num3,2)
                      || Math.pow(num3,2)== Math.pow(num1,2)+ Math.pow(num2,2))
              {
                  System.out.println("The data entered reflects a Right angled Triangle \n ...............................");
              }
              else{
                  System.out.println("The data entered reflects a not an equilateral triangle \n .............................");
              }
          }
            System.out.print("First Side of the triangle ? ");
            num1 = keyboard.nextDouble();

            System.out.print("Second Side of the triangle? ");
            num2 = keyboard.nextDouble();

            System.out.print("Third side of the triangle? ");
            num3 = keyboard.nextDouble();
        }
        System.out.println(".........................\nThank you for using the system");


    }
}

