package com.nayeel.imtiaz.patterns.observer.weather.v2;

import java.util.List;
import java.util.ArrayList;

public class WeatherStation implements Subject{
    private final List<WeatherObserver> weatherObservers = new ArrayList<>();
    private WeatherData weatherData;

    @Override
    public void publish(WeatherData data) {
        System.out.println("********************* WEATHER REPORT:\n");
        for (WeatherObserver weatherObserver: weatherObservers) {
            weatherObserver.display(weatherData);
        }
        System.out.println("*********************\n");
    }

    @Override
    public void subscribe(WeatherObserver observer) {
        weatherObservers.add(observer);
    }

    @Override
    public void unsubscribe(WeatherObserver observer) {
        weatherObservers.remove(observer);
    }

    public void readWeatherData(WeatherData data) {
        weatherData = data;
        this.publish(weatherData);
    }

}
