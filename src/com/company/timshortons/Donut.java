package com.company.timshortons;

public class Donut implements TimsConsumables{
    private int calories;
    private String itemName;
    private double price;
    private String feature;

    public Donut() {
        this.calories = 200;
        this.itemName = "1 X Donut  - 5$";
        this.price = 5;
        this.feature="";
    }

    public Donut(String itemName) {
        this.itemName = itemName;
    }

    public int getCalories() {
        return calories;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
    public String getFeature(){
        return "";
    }
}
