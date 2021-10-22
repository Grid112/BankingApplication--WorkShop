package com.bridgelabz;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    //In this Method Assigned '0' to savingsBalance & annualInterestRate
    public SavingsAccount() {
        savingsBalance = 0;
        annualInterestRate = 0;
    }
    /*
        This is a parameterised method
        balance is assigned to savingBalance
        annualInterestRate is assigned 0
    */
    public SavingsAccount(double balance) {
        savingsBalance = balance;
        annualInterestRate = 0;
    }
    //This method is used to calculate monthly interest
    public void calculateMonthlyInterest() {
        System.out.println("\nCurrent savings balance: " + savingsBalance);
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
        System.out.println("New savings balance: " + savingsBalance);
    }
    // This method is used to assign newInterestRate to annualInterestRate
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
}


