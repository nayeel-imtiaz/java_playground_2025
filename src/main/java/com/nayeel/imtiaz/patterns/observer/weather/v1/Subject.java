package com.nayeel.imtiaz.patterns.observer.weather.v1;

public interface Subject {
    void registerWeatherObserver(WeatherObserver weatherObserver);
    void removeWeatherObserver(WeatherObserver weatherObserver);
}
