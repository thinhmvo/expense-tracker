package org.example;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        String userName = Console.getUserName("Dear customer, may I have your name? ");

        BigDecimal startBal = Console.readNum("What is your account balance? ");

        BigDecimal itemCost = Console.readNum("How much was the item? ");

        BalanceCalculator calBal = new BalanceCalculator(startBal, itemCost);

        calBal.buyGroceries();

        PrintBalance printBal = new PrintBalance(userName, calBal);

        printBal.printBalance();

    }
}