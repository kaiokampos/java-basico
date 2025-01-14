package com.kaiokampos.encapsulamento.application;

import com.kaiokampos.encapsulamento.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        Integer accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        char questionDeposit = sc.next().charAt(0);

        if (questionDeposit == 'y' || questionDeposit == 'Y'){
            System.out.println("Enter initial deposit value:");
            double initialDeposit = sc.nextDouble();

            account = new Account(accountNumber, accountHolder, initialDeposit);

        }else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println("Account data");
        System.out.println(account);

        System.out.println("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account data");

        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data");

        System.out.println("Account data:");
        System.out.println(account);


        sc.close();
    }
}
