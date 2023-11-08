package com.example.observer.observer;

import com.example.observer.model.Estoque;

public interface Observer {

    public default void update(Estoque estoque) {

    }
}
