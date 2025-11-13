package com.nayeel.imtiaz.patterns.observer.weather;

import java.util.ArrayList;
import java.util.List;

public final class WeatherStation implements Subject {
    WeatherData weatherData;
    List<WeatherObserver> weatherObservers = new ArrayList<>();

    @Override
    public void registerWeatherObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    @Override
    public void removeWeatherObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    public void setMeasurements(WeatherData newWeatherData) {
        this.weatherData = newWeatherData;
        this.notifyWeatherObservers();
    }

    private void notifyWeatherObservers() {
        List<WeatherObserver> weatherObserversCopy = List.copyOf(weatherObservers);
        for (WeatherObserver weatherObserver : weatherObserversCopy) {
            // update weatherObserver
            weatherObserver.update(weatherData);
        }
    }
}
