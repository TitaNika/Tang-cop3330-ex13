/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;
import java.lang.Math;

public class assignment13 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = scan.nextDouble();

        System.out.print("Rate of Interest: ");
        double interest = scan.nextDouble();

        System.out.print("Number of years: ");
        double years = scan.nextDouble();

        System.out.print("Number of times the interest was compounded: ");
        double times= scan.nextDouble();

        double formula1 = (1 + ((interest/100) / times));
        double formula2 = (times * years);
        double formula3 = Math.pow(formula1, formula2);
        double formula4 = principal * formula3;

        String str1 = String.format("%.2f", formula4);

        System.out.println(principal + " invested at " + interest + "% for " + years + " years compounded " + times + " times per year is $" + str1);

    }
}