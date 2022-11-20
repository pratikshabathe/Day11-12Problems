package com.blz.day11_12;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account1 = new Account(1, 50.00);
		Account account2 = new Account(2, -7.53);
		account1.getBalance();                        //display initial balance
		account2.getBalance();
		
		Scanner sc = new Scanner(System.in);
		double debitAmount;
		
		System.out.print("Enter deposit amount for account2: ");
		double depositAmount = sc.nextDouble();
		System.out.printf("\nadding %.2f from account1 balance\n" , depositAmount);
		account2.credit(depositAmount);                //add amount to account1
		account1.getBalance();
		account2.getBalance();                         //display balance
		
		sc = new Scanner(System.in);
		double withdrawalAmount;
		
		System.out.print("Enter withdrawal amount for account1: ");
		withdrawalAmount = sc.nextDouble();              //read from used
		System.out.printf("\nsubtracting %.2f from account2 balance\n", withdrawalAmount);
		account1.debit(withdrawalAmount);
		
		account1.getBalance();
		account2.getBalance();
		
	}
}
	class Account{
		
		private double balance;
		public double accountNum;
		public int Account;
		
		public Account(double initialBalance, double accountN) {
			if(initialBalance > 0.0)
				balance = initialBalance;
				accountNum = accountN;
		}
		
		public void credit (double amount) {
			balance = balance + amount;
		}
		
		public void debit(double amount) {
			if(amount >= balance)
				System.out.println("Debet amount exceeded account balance.");
			else
				balance -= amount;
		}
		
		public String getBalance() {
			return balance +" " + accountNum;
		}
	}

