package com.scaler.ObserverDesignPattern;

public interface Subscriber {

    void updateUser(double temperature, double humidity, double windSpeed);

    void displayCurrentWeather();
}
