package com.montivero.poc.domain;

import java.util.List;

public class Pizza {

    private String name;
    private float price;
    private int portion;
    private List<Ingredient> ingredientList;

    public Pizza(String name, float price, List<Ingredient> ingredientList) {
        this.name = name;
        this.price = price;
        this.ingredientList = ingredientList;
        this.portion = 8;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getPortion() {
        if (portion != 0) {
            return portion--;
        }
        return 0;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", portion=" + portion +
                ", ingredientList=" + ingredientList +
                '}';
    }
}
