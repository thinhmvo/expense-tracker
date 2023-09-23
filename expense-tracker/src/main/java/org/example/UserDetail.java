package org.example;

import java.math.BigDecimal;

public class UserDetail {

    public BigDecimal getUserBankAccount() {
        return userBankAccount;
    }

    public void setUserBankAccount(BigDecimal userBankAccount) {
        this.userBankAccount = userBankAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    BigDecimal userBankAccount;

    String firstName;
    String lastName;
    String userId;

    public UserDetail(){};

}
