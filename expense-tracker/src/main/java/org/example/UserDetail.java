package org.example;

import java.math.BigDecimal;
import java.util.List;

public class UserDetail {

    public UserDetail() {
    }

    private ItemDetail userItems;

    public UserDetail(String fullName, BigDecimal userBankAcc) {
        this.fullName = fullName;
        this.userBankAccount = userBankAcc;

    }

    private BigDecimal userBankAccount;

    public BigDecimal getUserBankAccount() {
        return userBankAccount;
    }

    public void setUserBankAccount(BigDecimal userBankAccount) {
        this.userBankAccount = userBankAccount;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String fullName;


    public void setUserItems (List<ItemDetail> userItemsList) {
        this.userItems.setUserItemList(userItemsList);
    }

    public void getUserItemsList() {
        this.userItems.getUserItemList();
    }



}
