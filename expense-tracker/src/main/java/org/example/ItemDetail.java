package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ItemDetail {

    public ItemDetail(String itemDescription, LocalDate date, BigDecimal itemCost) {
        this.itemDescription = itemDescription;
        this.date = date;
        this.itemCost = itemCost;
    }

    public ItemDetail(){};

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public BigDecimal getItemCost() {
        return itemCost;
    }

    public void setItemCost(BigDecimal itemCost) {
        this.itemCost = itemCost;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    String itemName;
    String itemDescription;

    LocalDate date;

    BigDecimal itemCost;

//    BigDecimal eodCredit;


}

