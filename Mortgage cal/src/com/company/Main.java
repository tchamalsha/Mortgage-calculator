package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte Number_of_months = 12;
        final byte percent =100;
        Scanner scanner = new Scanner(System.in);

       //getting the principal value
        System.out.print("Principal $1K - $10M: ");
        long principal = scanner.nextLong();
        while (principal>10000000 || principal<1000)
        {
            System.out.println("Enter number between $1K - $10M");
            System.out.print("Principal $1K - $10M: ");
            principal = scanner.nextLong();
        }

        //getting annual interest
        System.out.print("Annual interest rate 1-30: ");
        float rate = scanner.nextFloat();
        while (rate>30 || rate<0)
        {
            System.out.println("Enter number between 0 -30");
            System.out.print("Annual interest rate 1-30: ");
            rate = scanner.nextFloat();
        }

        //taking number of years
        System.out.print("Number of years: ");
        int years = scanner.nextInt();
        while (years<0 || years>30)
        {
            System.out.println("Enter number between 0 -30");
            System.out.print("Number of years: ");
            years = scanner.nextInt();
        }

        //calculating monthly interest
        float monthly_rate = rate/(Number_of_months*percent);
        //calculating the mortgage
        double mortgage = principal*(monthly_rate*Math.pow(1+monthly_rate,years*Number_of_months)/(Math.pow(1+monthly_rate,years*Number_of_months)-1));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String Mortgage = currency.format(mortgage);
        System.out.print("Mortgage is: "+ Mortgage);
    }
}
