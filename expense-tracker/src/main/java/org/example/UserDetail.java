package org.example;

import java.math.BigDecimal;

public class UserDetail {

    public BigDecimal getUserBankAccount() {
        return userBankAccount;
    }

    public void setUserBankAccount(BigDecimal userBankAccount) {
        this.userBankAccount = userBankAccount;
    }



    private BigDecimal userBankAccount;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String fullName;

    public UserDetail(){};

}
