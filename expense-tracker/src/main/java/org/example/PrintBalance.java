package org.example;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class PrintBalance {

    private BalanceCalculator calculator;
    String userName;

    private final NumberFormat currency;

    public PrintBalance(String userName, BalanceCalculator calculator) {
        this.calculator = calculator;
        this.userName = userName;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printBalance() {
        System.out.println("++++++ WELCOME " + userName + " ++++++");
        System.out.println("------ YOUR ACCOUNT BALANCE IS ------");
        BigDecimal getAccBal =calculator.getAccBal();
        String accFormatted = currency.format(getAccBal);
        System.out.println(accFormatted);

    }
}
