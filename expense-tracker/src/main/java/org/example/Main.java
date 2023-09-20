package org.example;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {

        String userName = Console.getInput("Dear customer, may I have your name? ");

        BigDecimal startBal = Console.readNum("What is your account balance? ");

        int numOfItems = Integer.valueOf(Console.getInput("How many items did you buy? "));
        int itemCount = 0;

        BalanceCalculator calBal = new BalanceCalculator(startBal);


        do {
            itemCount++;
            BigDecimal itemCost = Console.readNum("How much was the " + itemCount + " item? ");
            calBal.buyGroceries(itemCost);
        }
        while (itemCount < numOfItems);


        String deposit = Console.getInput("Would you like to deposit today? Y/N ");
        if (deposit.equalsIgnoreCase("y")) {
            BigDecimal depositAmount = Console.readNum("How much would you like to deposit? ");
            calBal.deposit(depositAmount);
        }


        do {
            String keepDeposit = Console.getInput("Would you like to continue? Y/N ");
            if (keepDeposit.equalsIgnoreCase("n")) {
                break;
            }
            BigDecimal depositAmount = Console.readNum("How much would you like to add ? ");
            calBal.deposit(depositAmount);
        } while (true);

        PrintBalance printBal = new PrintBalance(userName, calBal);

        printBal.printBalance();

    }
}