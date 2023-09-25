package org.example;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        run();

    }

    private static void run() {
        Console createData = new Console();
        UserDetail mikeData = createData.createUser();

        List<ItemDetail> mikeItem = createData.createItemList();

        createData.calculateBalance(mikeData, mikeItem);
        createData.printUserBalance(mikeData);

        Map<UserDetail, List<ItemDetail>> mikeDataSet =  createData.createUserInfoMap(mikeData, mikeItem);

    }


}