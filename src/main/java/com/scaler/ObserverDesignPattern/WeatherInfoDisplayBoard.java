package com.scaler.ObserverDesignPattern;

public class WeatherInfoDisplayBoard implements Subscriber {

    private double temperature;

    private double humidity;

    private double windSpeed;

    @Override
    public void updateUser(double temperature, double humidity, double windSpeed) {

        this.temperature = temperature;

        this.humidity = humidity;

        this.windSpeed = windSpeed;

        displayCurrentWeather();
    }

    @Override
    public void displayCurrentWeather() {

        if(temperature > 90) {

            System.out.println("Mostly Sunny");
        }
        else if(temperature < 50){

            System.out.println("Moderate");
        }
        else{

            System.out.println("Cold");
        }
    }
}
