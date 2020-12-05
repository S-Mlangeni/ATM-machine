package com.ATM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Create account number: ");
        Scanner userAccountNumber = new Scanner(System.in);
        int createdaccountnumber = userAccountNumber.nextInt();;
        System.out.println("Account number created successfully!");
        System.out.print("Create pin number: ");
        Scanner userPinNumber = new Scanner(System.in);
        int createdpinnumber = userPinNumber.nextInt();
        System.out.println("Pin number created successfully!\n");
        System.out.println("Welcome to the ATM machine!");
        while (true) {
            System.out.print("Enter your account number: ");
            Scanner useraccountnumber = new Scanner(System.in);
            int accountnumber = useraccountnumber.nextInt();
            if (accountnumber == createdaccountnumber) {
                System.out.println("Valid!");
                break;
            }else {
                System.out.println("Enter a valid account number (i.e. created account number).");
            }
        }

        while (true) {
            System.out.print("Enter your pin number: ");
            Scanner userpinnumber = new Scanner(System.in);
            int pinnumber = userpinnumber.nextInt();
            if (pinnumber == createdpinnumber) {
                System.out.println("Valid!");
                break;
            }else {
                System.out.println("Enter a valid pin number (i.e. created pin number).");
            }
        }
        Main accountoptionsmethod = new Main();
        accountoptionsmethod.accountoptions();

    }

    public void accountoptions() {
        System.out.println("\nChoose an account option below.");
        System.out.println("1 - Savings");
        System.out.println("2 - Cheque");
        System.out.println("3 - Exit");
        System.out.print("Option: ");
        Scanner accountoption = new Scanner(System.in);
        switch (accountoption.nextInt()) {
            case 1:
                Account savingstransactionsoptions = new Account();
                savingstransactionsoptions.SavingsAndCheque();
                break;
            case 2:
                Account chequetransactionsoptions = new Account();
                chequetransactionsoptions.SavingsAndCheque();
                break;
            case 3:
                System.out.println("Thank you for banking with us. Goodbye!");
                break;
            default:
                System.out.println("Enter a valid option (i.e. 1, 2, or 3)");
                break;

        }
    }

}
