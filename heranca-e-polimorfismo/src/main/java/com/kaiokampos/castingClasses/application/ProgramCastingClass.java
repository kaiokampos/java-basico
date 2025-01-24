package com.kaiokampos.castingClasses.application;

import com.kaiokampos.castingClasses.entities.Account;
import com.kaiokampos.castingClasses.entities.BusinessAccount;
import com.kaiokampos.castingClasses.entities.SavingsAccount;

public class ProgramCastingClass {
    public static void main(String[] args) {
        Account acc = new Account(1001, "kaio", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "miguel", 0.00, 500.00);
        acc.withdraw(200);

        System.out.println(acc.getBalance());

        Account savingAccount = new SavingsAccount(1003, "Samara", 1000.0, 1000.00);
        savingAccount.withdraw(200);
        System.out.println(savingAccount.getBalance());

        Account businessAccount = new BusinessAccount(1013, "Samara", 1000.0, 9000.00);
        businessAccount.withdraw(200);
        System.out.println(businessAccount.getBalance());

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Samara", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Miguel", 0.0, 0.01);


        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        //Vai da erro na execucao
        //BusinessAccount acc5 = (BusinessAccount) acc3;

    }
}
