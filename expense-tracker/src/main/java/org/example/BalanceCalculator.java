package org.example;

import java.math.BigDecimal;

public class BalanceCalculator {
    private BigDecimal accBal;
    private BigDecimal itemCost;

    private BigDecimal income;
    public BalanceCalculator(BigDecimal accBal) {

        this.accBal = accBal;



    }




    public BigDecimal buyGroceries(BigDecimal itemCost) {
       return accBal = accBal.subtract(itemCost);
    }

    public BigDecimal deposit(BigDecimal incomNum) {
        return accBal.add(incomNum);
    }

    public BigDecimal getAccBal() {
        return accBal;
    }


}
