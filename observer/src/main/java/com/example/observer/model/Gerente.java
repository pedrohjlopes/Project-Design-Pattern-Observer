package com.example.observer.model;

import com.example.observer.*;
import com.example.observer.observer.Observer;

import java.math.BigDecimal;

public class Gerente implements Observer {
    private String name;


    public Gerente(){}

    public Gerente(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Estoque estoque) {
        BigDecimal valor= estoque.getValor();
        BigDecimal limite= new BigDecimal("1000.00");
        if(valor.compareTo(limite)>0)
        System.out.println(" Gerente  "+ name +" notificação de produto em estoque com valor de : $"+ estoque.getValor());
        }

    }

