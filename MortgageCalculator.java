package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the loan amount (Principal)
        System.out.print("Enter the loan amount (Principal): ");
        double principal = scanner.nextDouble(); // Read the principal amount (e.g., $53,000)

        // Prompt the user to enter the annual interest rate (as a percentage)
        System.out.print("Enter the annual interest rate (e.g., 7.625): ");
        double annualInterestRate = scanner.nextDouble(); // Read the interest rate (e.g., 7.625%)

        // Prompt the user to enter the loan term in years
        System.out.print("Enter the loan term in years: ");
        int years = scanner.nextInt(); // Read the loan term in years (e.g., 15 years)

        // Convert the annual interest rate to a monthly interest rate
        double monthlyInterestRate = annualInterestRate / 100 / 12; // Convert percentage to decimal and divide by 12
        // Calculate the total number of payments (loan term in months)
        int numberOfPayments = years * 12; // Convert years to months (e.g., 15 years = 180 months)

        // Calculate the monthly payment using the mortgage formula
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        // Formula Explanation: The formula calculates how much the borrower has to pay each month

        // Calculate the total interest paid over the life of the loan
        double totalInterest = monthlyPayment * numberOfPayments - principal; // Total payment over loan term - principal

        // Display the results: Monthly payment and total interest
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment); // Print the monthly payment rounded to 2 decimal places
        System.out.printf("Total Interest Paid: %.2f\n", totalInterest); // Print the total interest paid rounded to 2 decimal places

        scanner.close(); // Close the scanner 
    }
}
