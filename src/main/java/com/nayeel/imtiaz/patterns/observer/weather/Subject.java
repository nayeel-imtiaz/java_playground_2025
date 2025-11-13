package com.nayeel.imtiaz.patterns.observer.weather;

public interface Subject {
    void registerWeatherObserver(WeatherObserver weatherObserver);
    void removeWeatherObserver(WeatherObserver weatherObserver);
}
