package com.company.timshortons;

public class Mugs implements TimsMerchandise{
    private String feature;
    private String itemName;
    private double price;

    public Mugs() {
        this.feature = "Mug height is 5 inches";
        this.itemName = "1 X Mugs  -  5$";
        this.price = 5;
    }

    public Mugs(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public int getCalories() {
        return 0;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getFeature() {
        return feature;
    }
}
