package org.example;

import java.math.BigDecimal;
import java.util.List;

public class BalanceCalculator {

    public BalanceCalculator(){};


    private List<ItemDetail> getUserItems() {
        return userItems;
    }

    private void setUserItems(List<ItemDetail> userItems) {
        this.userItems = userItems;
    }

    private BigDecimal userBank;

    private List<ItemDetail> userItems;

    public BalanceCalculator(BigDecimal userBank, List<ItemDetail> userItems) {
        this.userBank = userBank;
        this.userItems = userItems;
    }

    private BigDecimal getItemTotal() {
        BigDecimal itemTotal = BigDecimal.ZERO;
        for (ItemDetail item : this.userItems) {
            item.getItemCost();
            itemTotal.add(item.getItemCost());
        }

        return itemTotal.negate();
    }
    public BigDecimal calculateTotalBalance(List<ItemDetail> userItems) {
        BigDecimal userBank = this.userBank;
        BigDecimal totalItem = getItemTotal();
        userBank.add(totalItem);
        return this.userBank = userBank;
    }



}
