package com.montivero.poc.service;

import com.montivero.poc.domain.Pizza;
import com.montivero.poc.domain.PizzaType;
import com.montivero.poc.factory.PizzaFactory;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PizzaSoapTest {

    @Test
    public void shouldReturnAnchoaPizza() throws Exception {

        PizzaSoap pizzaSoap = new PizzaSoap();
        Pizza pizza = PizzaFactory.getPizza(PizzaType.ANCHOA);
        assertThat(pizza.getName(),is("ANCHOA"));

    }
}