package com.example.observer.model;

import com.example.observer.observer.Observer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String produto;
    private BigDecimal valor;
    private  BigDecimal desconto;

   private List<Observer> observers = new ArrayList<Observer>();


    public Estoque(){};

    public Estoque(String produto, BigDecimal valor, BigDecimal desconto) {
        this.produto = produto;
        this.valor = valor;
        this.desconto = desconto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
        this.notifyObserves();
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
    private void notifyObserves(){
        for(Observer observer: observers){
            observer.update(this);
        }
    }
}
