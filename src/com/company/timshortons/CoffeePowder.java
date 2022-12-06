package com.company.timshortons;

public class CoffeePowder implements TimsMerchandise{
    private String feature;
    private String itemName;
    private double price;

    public CoffeePowder() {
        this.feature = "Coffee Powder comes in 1Kg size";
        this.itemName = "1 X Coffee Powder  -  2$";
        this.price = 2;
    }

    public CoffeePowder(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String getFeature() {
        return feature;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public int getCalories() {
        return 0;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
