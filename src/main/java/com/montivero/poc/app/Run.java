package com.montivero.poc.app;

import com.montivero.poc.service.PizzaSoap;

import javax.xml.ws.Endpoint;

public class Run {

    public static void main(String[] args) {
        System.out.println("Initializing server...");
        Endpoint.publish("http://localhost:9999/pizzaService", new PizzaSoap());
    }
}
