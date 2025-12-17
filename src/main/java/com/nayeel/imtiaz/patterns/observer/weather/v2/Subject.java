package com.nayeel.imtiaz.patterns.observer.weather.v2;

public interface Subject {
    void publish(WeatherData data);
    void subscribe(WeatherObserver observer);
    void unsubscribe(WeatherObserver observer);
}
