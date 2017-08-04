package com.montivero.poc.domain;

public class Ingredient {

    private String name;
    private int quantity;
    private PortionUnit portionUnit;

    public Ingredient(String name, int quantity, PortionUnit portionUnit) {
        this.name = name;
        this.quantity = quantity;
        this.portionUnit = portionUnit;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public PortionUnit getPortionUnit() {
        return portionUnit;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", portionUnit=" + portionUnit +
                '}';
    }
}
