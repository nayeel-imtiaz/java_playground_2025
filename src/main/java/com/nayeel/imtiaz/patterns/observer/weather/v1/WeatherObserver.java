package com.nayeel.imtiaz.patterns.observer.weather.v1;

public interface WeatherObserver {
    void update(WeatherData newWeatherData);
}
