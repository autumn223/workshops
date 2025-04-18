package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Prompt the user to enter the deposit amount (Principal)
        System.out.print("Enter the deposit amount (Principal): ");
        double principal = scanner.nextDouble(); // Read the initial deposit amount (e.g., $1,000)

        // Prompt the user to enter the annual interest rate (as a percentage)
        System.out.print("Enter the annual interest rate (e.g., 1.75): ");
        double annualInterestRate = scanner.nextDouble(); // Read the interest rate (e.g., 1.75%)

        // Prompt the user to enter the number of years for the investment
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt(); // Read the number of years for the investment (e.g., 5 years)

        // Calculate the daily interest rate by dividing the annual interest rate by 365 (number of days in a year)
        double dailyInterestRate = annualInterestRate / 100 / 365; // Convert percentage to decimal and divide by 365

        // Calculate the future value using the compound interest formula
        double futureValue = principal * Math.pow(1 + dailyInterestRate, 365 * years);
        // Formula Explanation: Compound interest formula for daily compounding

        // Calculate the total interest earned by subtracting the principal from the future value
        double totalInterest = futureValue - principal; // Future value - Principal = Interest earned

        // Display the results: Future value and total interest earned
        System.out.printf("Future Value: %.2f\n", futureValue); // Print the future value rounded to 2 decimal places
        System.out.printf("Total Interest Earned: %.2f\n", totalInterest); // Print the interest earned rounded to 2 decimal places

        scanner.close(); // Close the scanner
    }
}
