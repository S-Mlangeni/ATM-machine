package com.ATM;

import java.util.Scanner;

public class Account {
    public void SavingsAndCheque() {
        int balance = 0;
        boolean a = true;
        while (a) {
            System.out.println("\nChoose a transaction option below.");
            System.out.println("1 - Check balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            //System.out.println("4 - Previous options");
            System.out.println("4 - Exit");
            System.out.print("Option: ");
            Scanner transactionoption = new Scanner(System.in);
            switch (transactionoption.nextInt()) {
                case 1:
                    System.out.println("\nYour balance is: R" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    Scanner userdepositamount = new Scanner(System.in);
                    int depositamount = userdepositamount.nextInt();
                    System.out.println("\nR"+ depositamount + " is successfully deposited!");
                    balance += depositamount;
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    Scanner userwithdrawalamount = new Scanner(System.in);
                    int withdrawalamount = userwithdrawalamount.nextInt();
                    balance -= withdrawalamount;
                    if (balance<0) {
                        System.out.println("\nYou have insufficient funds.");
                        balance += withdrawalamount;
                    } else {
                        System.out.println("\nR"+ withdrawalamount + " is successfully withdrawn!");
                    }
                    break;
                //case 4:
                  //  Main previousoptions = new Main();
                  //  previousoptions.accountoptions();
                  //  a = false;
                  //  break;
                case 4:
                    System.out.println("\nThank you for banking with us. Goodbye!");
                    a = false;
                    break;
                default:
                    System.out.println("\nEnter a valid option (i.e. 1, 2, 3, or 4)");
                    break;
            }

        }

    }

}
