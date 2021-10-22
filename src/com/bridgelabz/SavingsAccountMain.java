package com.bridgelabz;

public class SavingsAccountMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Banking Management Program");
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        saver1.modifyInterestRate(.04);
        saver1.calculateMonthlyInterest();
        saver1.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();

        saver2.modifyInterestRate(.04);
        saver2.calculateMonthlyInterest();
        saver2.modifyInterestRate(.05);
        saver2.calculateMonthlyInterest();
    }
}
