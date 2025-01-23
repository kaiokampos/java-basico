package com.kaiokampos.application;

import com.kaiokampos.entities.Account;
import com.kaiokampos.entities.BusinessAccount;

public class ProgramAccount {
    public static void main(String[] args) {
        BusinessAccount businessAccount = new BusinessAccount();

        businessAccount.deposit(100.00);
    }
}
