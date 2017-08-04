package com.montivero.poc.builder;

import com.montivero.poc.domain.Ingredient;
import com.montivero.poc.domain.PortionUnit;
import javafx.util.Builder;

import java.util.ArrayList;
import java.util.List;

public class IngredientBuilder implements Builder {

    private String name;
    private int quantity;
    private PortionUnit portionUnit;
    private List<Ingredient> ingredientList;

    public IngredientBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public IngredientBuilder withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public IngredientBuilder withPortionUnit(PortionUnit portionUnit) {
        this.portionUnit = portionUnit;
        return this;
    }

    public IngredientBuilder addItemToList() {
        ingredientListInit();
        ingredientList.add(new Ingredient(name, quantity, portionUnit));
        return this;
    }

    public Ingredient build() {
        return new Ingredient(name, quantity, portionUnit);
    }

    public List<Ingredient> buildList() {
        ingredientListInit();
        return ingredientList;
    }

    private void ingredientListInit() {
        if (ingredientList == null) {
            ingredientList = new ArrayList<Ingredient>();
        }
    }
}
