package com.montivero.poc.factory;

import com.montivero.poc.builder.IngredientBuilder;
import com.montivero.poc.builder.PizzaBuilder;
import com.montivero.poc.domain.Pizza;
import com.montivero.poc.domain.PizzaType;
import com.montivero.poc.domain.PortionUnit;

public class PizzaFactory {

    public static Pizza getPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        if (pizzaType == PizzaType.MUZZARELA) {
            pizza = new PizzaBuilder()
                    .withName(PizzaType.MUZZARELA.name())
                    .withPrice(20)
                    .withIngredientList(new IngredientBuilder()
                            .withName("Muzzarella")
                            .withQuantity(300)
                            .withPortionUnit(PortionUnit.GRAM)
                            .addItemToList()
                            .withName("Tomato")
                            .withQuantity(150)
                            .withPortionUnit(PortionUnit.CC)
                            .addItemToList()
                            .withName("Prepizza")
                            .withQuantity(1)
                            .withPortionUnit(PortionUnit.UNIT)
                            .buildList()
                    ).
                            build();

        }
        if (pizzaType == PizzaType.ANCHOA) {
            pizza = new PizzaBuilder()
                    .withName(PizzaType.ANCHOA.name())
                    .withPrice(35)
                    .withIngredientList(new IngredientBuilder()
                            .withName("Anchoa")
                            .withQuantity(8)
                            .withPortionUnit(PortionUnit.UNIT)
                            .withName("Muzzarella")
                            .withQuantity(300)
                            .withPortionUnit(PortionUnit.GRAM)
                            .addItemToList()
                            .withName("Tomato")
                            .withQuantity(150)
                            .withPortionUnit(PortionUnit.CC)
                            .addItemToList()
                            .withName("Prepizza")
                            .withQuantity(1)
                            .withPortionUnit(PortionUnit.UNIT)
                            .buildList()
                    ).
                            build();

        }
        if (pizzaType == PizzaType.CHAMPINON) {
            pizza = new PizzaBuilder()
                    .withName(PizzaType.ANCHOA.name())
                    .withPrice(35)
                    .withIngredientList(new IngredientBuilder()
                            .withName("CHAMPINON")
                            .withQuantity(14)
                            .withPortionUnit(PortionUnit.UNIT)
                            .withName("Muzzarella")
                            .withQuantity(300)
                            .withPortionUnit(PortionUnit.GRAM)
                            .addItemToList()
                            .withName("Tomato")
                            .withQuantity(150)
                            .withPortionUnit(PortionUnit.CC)
                            .addItemToList()
                            .withName("Prepizza")
                            .withQuantity(1)
                            .withPortionUnit(PortionUnit.UNIT)
                            .buildList()
                    ).
                            build();

        }
        if (pizzaType == PizzaType.ROQUEFORT) {
            pizza = new PizzaBuilder()
                    .withName(PizzaType.ROQUEFORT.name())
                    .withPrice(35)
                    .withIngredientList(new IngredientBuilder()
                            .withName("ROQUEFORT")
                            .withQuantity(175)
                            .withPortionUnit(PortionUnit.GRAM)
                            .withName("Muzzarella")
                            .withQuantity(300)
                            .withPortionUnit(PortionUnit.GRAM)
                            .addItemToList()
                            .withName("Tomato")
                            .withQuantity(150)
                            .withPortionUnit(PortionUnit.CC)
                            .addItemToList()
                            .withName("Prepizza")
                            .withQuantity(1)
                            .withPortionUnit(PortionUnit.UNIT)
                            .buildList()
                    ).
                            build();

        }
        if (pizzaType == PizzaType.FUGAZZETA) {
            pizza = new PizzaBuilder()
                    .withName(PizzaType.FUGAZZETA.name())
                    .withPrice(35)
                    .withIngredientList(new IngredientBuilder()
                            .withName("ONION")
                            .withQuantity(1)
                            .withPortionUnit(PortionUnit.KILOGRAM)
                            .withName("Muzzarella")
                            .withQuantity(300)
                            .withPortionUnit(PortionUnit.GRAM)
                            .addItemToList()
                            .withName("Tomato")
                            .withQuantity(150)
                            .withPortionUnit(PortionUnit.CC)
                            .addItemToList()
                            .withName("Prepizza")
                            .withQuantity(1)
                            .withPortionUnit(PortionUnit.UNIT)
                            .buildList()
                    ).
                            build();
        }
        return pizza;
    }

}
