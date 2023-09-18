package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Console {

    //Read input and validate
    private static Scanner scanner = new Scanner(System.in);

    public static BigDecimal readNum(String prompt) {
        double getUserBal;
        while (true) {
            System.out.println(prompt);
            getUserBal = scanner.nextDouble();
            if (getUserBal < 0) break;
            System.out.println("Your number needs to be greater than 0");
        }
        BigDecimal userBal = new BigDecimal(getUserBal);
        return userBal;
    }

    public static String itemDetail(String prompt) {
        String itemDetail;
        System.out.println(prompt);
        while (true) {
            System.out.println(prompt);
            itemDetail = scanner.nextLine();
            if (itemDetail.equalsIgnoreCase("No")) break;
        }
        return itemDetail;
    }


}
