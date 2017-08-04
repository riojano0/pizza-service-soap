package com.montivero.poc.service;

import com.montivero.poc.domain.Pizza;
import com.montivero.poc.domain.PizzaType;
import com.montivero.poc.factory.PizzaFactory;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class PizzaSoap {

    @WebMethod
    public String getPizza(PizzaType pizzaType) {

        Pizza pizza = PizzaFactory.getPizza(pizzaType);
        return pizza.toString();
    }

}
