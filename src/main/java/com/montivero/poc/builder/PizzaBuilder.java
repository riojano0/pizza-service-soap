package com.montivero.poc.builder;

import com.montivero.poc.domain.Ingredient;
import com.montivero.poc.domain.Pizza;
import javafx.util.Builder;

import java.util.List;

public class PizzaBuilder implements Builder {

    private String name;
    private float price;
    private List<Ingredient> ingredientList;

    public PizzaBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder withPrice(float price) {
        this.price = price;
        return this;
    }

    public PizzaBuilder withIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
        return this;
    }

    public Pizza build() {
        return new Pizza(name, price, ingredientList);
    }
}
