package com.scaler.ObserverDesignPattern;

public interface Publisher {

    void subscribeUser(Subscriber subscriber);

    void unsubscribeUser(Subscriber subscriber);

    void notifySubscribers();
}
