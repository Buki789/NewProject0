package BankAccount;

import java.util.Scanner;

public class BankAccount {
    //Class Variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    //Class constructor
    public BankAccount(String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

    //Function for Depositing money
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    //Function for Withdrawing money
    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    //Function showing the previous transaction
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    //Function calculating interest of current funds after a number of years
    void calculateInterest(int years) {
        double interestRate = .0185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years, you balance will be: " + newBalance);
    }

    //Function showing the main menu
    public void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do? Please select one of the follow options!");
        System.out.println();
        System.out.println("A. Make a deposit");
        System.out.println("B. Make a withdrawal");
        System.out.println("C. Check your balance");
        System.out.println("D. View previous transaction");
        System.out.println("E. Transfer to another Account");
        System.out.println("F. Create bank account");
        System.out.println("G. View List of your Accounts");
        System.out.println("H. Charge Another User Account");
        System.out.println("I. Check for Pending Transactions");
        System.out.println("J. Check for Unacknowledged Transactions");
        System.out.println("K. Check Transaction History");
        System.out.println("L. Exit");

        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch(option) {

                //Case 'A' allows the user to deposit money into their account using the 'deposit' function
                case 'A':
                    System.out.println("====================================");
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("====================================");
                    System.out.println();
                    break;

                //Case 'B' allows the user to withdraw money from their account using the 'withdraw' function
                case 'B':
                    System.out.println("====================================");
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("====================================");
                    System.out.println();
                    break;

                //Case 'C' allows the user to check their account balance
                case 'C':
                    System.out.println("====================================");
                    System.out.println("Balance = $" + balance);
                    System.out.println("====================================");
                    System.out.println();


                    //Case 'D' allows the user to view their most recent transaction using the 'getPreviousTransaction' function
                case 'D':
                    System.out.println("====================================");
                    getPreviousTransaction();
                    System.out.println("====================================");
                    System.out.println();
                    break;

                //Case 'E' Allows a customer make a transfer to a Bank account
                case 'E':
                    System.out.println("====================================");
                    System.out.println("Enter an account number to Transfer money to: ");
                    System.out.println("Enter an Amount to transfer: ");
                    System.out.println("====================================");
                    System.out.println();

                    break;

                //Case 'F' Allows a customer make a transfer to a Bank account
                case 'F':
                    System.out.println("====================================");
                    System.out.println("Type of Account to Open? Checking or Savings");
                    System.out.println("Create bank account");
                    System.out.println("====================================");
                    System.out.println();

                    break;

                //Case 'G' Allows a customer to view their Bank account
                case 'G':
                    System.out.println("====================================");
                    System.out.println("This is a View of your Accounts: ");
                    System.out.println("====================================");
                    System.out.println();

                    break;
                //Case 'H' Allows a customer make a charge to another Bank account
                case 'H':
                    System.out.println("====================================");
                    System.out.println("Enter an account number to Charge: ");
                    System.out.println("Enter an amount to Charge this Account: ");
                    System.out.println("====================================");
                    System.out.println();

                    break;
                //Case 'I' Allows a customer Check for Pending Transactions
                case 'I':
                    System.out.println("====================================");
                    System.out.println("Your Pending Transactions are.... ");
                    System.out.println("====================================");
                    System.out.println();

                    break;
                //Case 'J' Allows a customer Check for Unacknowledged Transactions
                case 'J':
                    System.out.println("====================================");
                    System.out.println("Your Unacknowledged Transactions are.... ");
                    System.out.println("====================================");
                    System.out.println();

                    break;
                //Case 'K' Allows a customer check transaction History
                case 'K':
                    System.out.println("====================================");
                    System.out.println("Your Transaction History is as Follows: ");
                    System.out.println("====================================");
                    System.out.println();

                    break;

                //Case 'L' Exits the user from their account
                case 'L':
                    System.out.println("====================================");
                    break;
                //The default case lets the user know that they entered an invalid character and how to enter a valid one
                default:
                    System.out.println("Error: invalid option. Please enter A, B, C, D, E, F, G, H, I, J, K or L or access services.");
                    break;
            }
        } while(option != 'L');
        System.out.println("Thank you for banking with us!");
    }

}
