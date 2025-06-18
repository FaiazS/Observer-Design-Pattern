package com.scaler.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherInfo implements Publisher {

    private double temperature;

    private double humidity;

    private double pressure;

    private double windSpeed;

    private double precipitation;

    List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void subscribeUser(Subscriber subscriber){

        subscriberList.add(subscriber);

    }

    @Override
    public void unsubscribeUser(Subscriber subscriber){

        subscriberList.remove(subscriber);

    }

    @Override
    public void notifySubscribers(){

        for(Subscriber subscriber : subscriberList){

            subscriber.updateUser(temperature, humidity, windSpeed);
        }
    }

    public void updateWeatherInfo(double temperature, double humidity, double pressure, double windSpeed, double precipitation){

        this.temperature = temperature;

        this.humidity = humidity;

        this.pressure = pressure;

        this.windSpeed = windSpeed;

        this.precipitation = precipitation;

        notifySubscribers();

    }
}
