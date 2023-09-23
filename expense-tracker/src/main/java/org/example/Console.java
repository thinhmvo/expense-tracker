package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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



    //Prompt user input to set up userAccount Balance
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

    public UserDetail createUser() {
        UserDetail newUser = new UserDetail();

        String userFullName = getStringInput("What is your full name? ");
        BigDecimal userAcc = getNumberInput("What is your account balance? ");

        newUser.setFullName(userFullName);
        newUser.setUserBankAccount(userAcc);

        return newUser;
    }

    private ItemDetail createItemDetail() {
        ItemDetail newItem = new ItemDetail();
        String setItemName = getStringInput("What is the item name? ");
        String setItemDescription = getStringInput("What is the item description? ");
        BigDecimal setItemCost = getNumberInput("What is the cost of the item? ");

        newItem.setItemName(setItemName);
        newItem.setItemDescription(setItemDescription);
        newItem.setItemCost(setItemCost);

        return newItem;
    }



    public List<ItemDetail> createItemList() {
        List<ItemDetail> listOfItems = new ArrayList<>();
        int itemCount = Integer.valueOf(getStringInput("How many items did you buy? "));
        for (int i = 0; i < itemCount; i++) {
            ItemDetail createItem = createItemDetail();
            listOfItems.add(createItem);
        }
        return listOfItems;
    }


}
