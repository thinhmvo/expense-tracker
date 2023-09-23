package org.example;

import java.math.BigDecimal;
import java.util.List;


public class Main {
    public static void main(String[] args) {

    Console createData = new Console();

    UserDetail newUser = createData.createUser();

    List<ItemDetail> itemsList = createData.createItemList();

    for(ItemDetail item : itemsList) {
        System.out.println(item.getItemCost());
    }
    }


}