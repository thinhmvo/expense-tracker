package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserDetail {

    public UserDetail() {
    }

    private List<ItemDetail> userItems = new ArrayList<>();

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
        this.userItems = userItemsList;
        BalanceCalculator calculator = new BalanceCalculator();

        //To do
//        this.setUserBankAccount(calculator.calculateTotalBalance(this.userItems));
    }

    public void addItem(ItemDetail item) {
        this.userItems.add(item);
        BalanceCalculator calculator = new BalanceCalculator();
        //To Do
//        this.setUserBankAccount(calculator.calculateTotalBalance(this.userItems));
    }

    public void getUserItemsList() {
//        this.userItems.getUserItemList();
    }



}
