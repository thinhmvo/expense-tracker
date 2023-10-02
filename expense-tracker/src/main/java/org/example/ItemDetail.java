package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ItemDetail {
    private List<ItemDetail> userItemList;




    public void setUserItemList(List<ItemDetail> userItemList) {
        this.userItemList = userItemList;
    }
    public List<ItemDetail> getUserItemList() {
        return userItemList;
    }
    public List<ItemDetail> addItemToList(ItemDetail item) {
        this.userItemList.add(item);
        return this.userItemList;
    }

    public ItemDetail(String itemDescription, BigDecimal itemCost) {
        this.itemDescription = itemDescription;
        this.itemCost = itemCost;
    }

    public ItemDetail() {
    }

    ;

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

