package com.scaler.ObserverDesignPattern;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherInfo weatherInfo = new WeatherInfo();

        WeatherMobileApp weatherMobileApp = new WeatherMobileApp();

        WeatherInfoDisplayBoard weatherInfoDisplayBoard = new WeatherInfoDisplayBoard();

        weatherInfo.subscribeUser(weatherMobileApp);

        weatherInfo.subscribeUser(weatherInfoDisplayBoard);

        weatherInfo.updateWeatherInfo(50,65,25,18,0);

        System.out.println(weatherInfo);

        weatherInfo.unsubscribeUser(weatherInfoDisplayBoard);

        System.out.println(weatherInfo);

        weatherInfo.updateWeatherInfo(45,60,27,17,10);

        System.out.println(weatherInfo);

    }
}
