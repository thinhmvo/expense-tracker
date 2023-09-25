package org.example;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;

// Should the console use to create and act as a program run application

public class Console {

    public List<ItemDetail> getItemDetailList() {
        return itemDetailList;
    }

    public void setItemDetailList(List<ItemDetail> itemDetailList) {
        this.itemDetailList = itemDetailList;
    }

    private List<ItemDetail> itemDetailList;

    //Read input and validate
    private static Scanner scanner = new Scanner(System.in);


    //Get number input
    private BigDecimal getNumberInput(String prompt) {
        double setBalance;

        while (true) {

            System.out.print(prompt);

            setBalance = Double.parseDouble(scanner.nextLine());

            if (setBalance > 0) break;

            System.out.println("Your number needs to be greater than 0");

        }

        BigDecimal userBal = new BigDecimal(setBalance);

        return userBal;
    }


    private String getStringInput(String prompt) {

        String userInput;

        System.out.print(prompt);

        userInput = scanner.nextLine();

        return userInput;
    }

    //Set up user information
    public UserDetail createUser() {
        UserDetail newUser = new UserDetail();

        String userFullName = getStringInput("What is your full name? ");
        BigDecimal userAcc = getNumberInput("What is your account balance? ");

        newUser.setFullName(userFullName);
        newUser.setUserBankAccount(userAcc);

        return newUser;
    }

    //Create item
    private ItemDetail createItemDetail() {
        ItemDetail newItem = new ItemDetail();

        String setItemName = getStringInput("What is the item? ");
        String setItemDescription = getStringInput("description? ");
        BigDecimal setItemCost = getNumberInput("Cost? ");

        newItem.setItemName(setItemName);
        newItem.setItemDescription(setItemDescription);
        newItem.setItemCost(setItemCost);

        return newItem;
    }


    public List<ItemDetail> createItemList() {
        List<ItemDetail> listOfItems = new ArrayList<>();
    // Change to a while loop, check if list is empty if not prompt what is the next item.
        int itemCount = Integer.valueOf(getStringInput("How many items did you buy? "));
        for (int i = 0; i < itemCount; i++) {
            ItemDetail createItem = createItemDetail();
            listOfItems.add(createItem);
        }
        return listOfItems;
    }

    private BigDecimal calculateTotalCostOfItems(List<ItemDetail> items) {
        BigDecimal totalCost = BigDecimal.ZERO;

        for (ItemDetail item : items) {
            totalCost = totalCost.add(item.getItemCost());
        }
        return totalCost;
    }

    public void calculateBalance(UserDetail user, List<ItemDetail> items) {
        BigDecimal totalCost = calculateTotalCostOfItems(items);

        if (user.getUserBankAccount().compareTo(totalCost) >= 0) {
            user.setUserBankAccount(user.getUserBankAccount().subtract(totalCost));
        } else {
            System.out.println("Insufficient fund");
        }
    }

    NumberFormat currency = NumberFormat.getCurrencyInstance();
    public void printUserBalance(UserDetail user) {
        System.out.println("---------WELCOME--------------");
        System.out.println("Hello " + user.getFullName());
        System.out.println("Your current balance is " + currency.format(user.getUserBankAccount()));
    }
    public Map<UserDetail, List<ItemDetail>> createUserInfoMap(UserDetail user, List<ItemDetail> items) {
        Map<UserDetail, List<ItemDetail>> userInfoMap = new HashMap<>();
        userInfoMap.put(user, items);
        return userInfoMap;
    }



}
