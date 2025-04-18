package com.pluralsight;

import java.util.Scanner;

public class PresentValueCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// Prompt the user to enter the monthly payout
        System.out.print("Enter the monthly payout: ");
        double monthlyPayout = scanner.nextDouble(); // Read the monthly payout (e.g., $3,000)

        // Prompt the user to enter the annual interest rate (as a percentage)
        System.out.print("Enter the expected interest rate (e.g., 2.5): ");
        double annualInterestRate = scanner.nextDouble(); // Read the interest rate (e.g., 2.5%)

        // Prompt the user to enter the number of years to pay out
        System.out.print("Enter the number of years to pay out: ");
        int years = scanner.nextInt(); // Read the number of years (e.g., 20 years)

        // Convert the annual interest rate to a monthly interest rate
        double monthlyInterestRate = annualInterestRate / 100 / 12; // Convert percentage to decimal and divide by 12

        // Calculate the total number of payments (number of months)
        int numberOfPayments = years * 12; // Convert years to months

        // Calculate the present value using the annuity formula
        double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments)) / monthlyInterestRate;
        // Formula Explanation: The formula calculates how much money you need today to fund the annuity

        // Display the present value of the annuity
        System.out.printf("Present Value: %.2f\n", presentValue); // Print the present value rounded to 2 decimal places

        scanner.close(); // Close the scanner
    }
}
