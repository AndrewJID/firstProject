package com.company.timshortons;

public class Bagel implements TimsConsumables{
    private int calories;
    private String itemName;
    private double price;

    public Bagel() {
        this.calories = 30;
        this.itemName = "1 X Bagel  -  4$";
        this.price = 4;
    }

    public Bagel(String itemName) {
        this.itemName = itemName;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String getFeature() {
        return "";
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}
