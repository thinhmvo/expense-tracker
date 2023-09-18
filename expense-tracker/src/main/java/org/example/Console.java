package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Console {

    //Read input and validate
    private static Scanner scanner = new Scanner(System.in);

    public static BigDecimal readNum(String prompt) {
        double getUserBal;
        while (true) {
            System.out.print(prompt);
            getUserBal = Double.parseDouble(scanner.nextLine());
            if (getUserBal > 0) break;
            System.out.println("Your number needs to be greater than 0");
        }
        BigDecimal userBal = new BigDecimal(getUserBal);
        return userBal;
    }

    public static String getUserName(String prompt) {
        String userName;
        System.out.print(prompt);
        userName = scanner.nextLine();
        return userName;
    }


}
