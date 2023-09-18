package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BalanceCalculator {
    private BigDecimal accBal;
    private BigDecimal itemCost;

    private BigDecimal income;
    public BalanceCalculator(BigDecimal accBal, BigDecimal itemCost) {

        this.accBal = accBal;

        this.itemCost = itemCost;

    }

    public BalanceCalculator(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal calculateBal() {
       return accBal.subtract(itemCost);
    }

    public BigDecimal addMoney() {
        return accBal.add(income);
    }


}
