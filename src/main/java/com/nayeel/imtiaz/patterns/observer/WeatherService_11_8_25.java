package com.nayeel.imtiaz.patterns.observer;

import java.util.ArrayList;
import java.util.List;

record WeatherData(double temperature, double humidity, double pressure){}

interface Subject {
    void registerWeatherObserver(WeatherObserver weatherObserver);
    void removeWeatherObserver(WeatherObserver weatherObserver);
}

interface WeatherObserver {
    void update(WeatherData newWeatherData);
}

final class WeatherStation implements Subject {
    WeatherData weatherData;
    List<WeatherObserver> weatherObservers = new ArrayList<>();

    @Override public void registerWeatherObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    @Override public void removeWeatherObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    public void setMeasurements(WeatherData newWeatherData) {
        this.weatherData = newWeatherData;
        this.notifyWeatherObservers();
    }

    private void notifyWeatherObservers() {
        List<WeatherObserver> weatherObserversCopy = List.copyOf(weatherObservers);
        for (WeatherObserver weatherObserver : weatherObservers) {
            // update weatherObserver
            weatherObserver.update(weatherData);
        }
    }
}

final class PhoneDisplay implements WeatherObserver {
    // wanted to make update() package private
    // because we don't want the client/driver
    // to be able to call it, only `WeatherStation`
    // class should call it. Assume client/driver
    // not in the same package.
    @Override public void update(WeatherData newWeatherData) {
        System.out.printf("[Phone Display]: Temperature: %.1f fahrenheit, Humidity: %.1f, Pressure: %.1f Hg\n",
                newWeatherData.temperature(),
                newWeatherData.humidity(),
                newWeatherData.pressure()
        );
    }
}

final class WebDashboard implements WeatherObserver {
    @Override public void update(WeatherData newWeatherData) {
        System.out.printf("[Web Dashboard]: Temperature: %.1f fahrenheit, Humidity: %.1f, Pressure: %.1f Hg\n",
                newWeatherData.temperature(),
                newWeatherData.humidity(),
                newWeatherData.pressure()
        );
    }
}

public class WeatherService_11_8_25 {
    public static void main(String[] args) {
        // I could not declare below variable as Subject since
        // setMeasurements() is not in `Subject` interface.
        WeatherStation abcWeather = new WeatherStation();
        WeatherObserver phone = new PhoneDisplay();
        WeatherObserver webDashboard = new WebDashboard();

        abcWeather.registerWeatherObserver(phone);
        abcWeather.registerWeatherObserver(webDashboard);

        abcWeather.setMeasurements(new WeatherData(80, 7.5, 0.2));
        System.out.println("*".repeat(30) + "\n");
        abcWeather.setMeasurements(new WeatherData(80, 9.5, 0.3));
        System.out.println("*".repeat(30) + "\n");

        abcWeather.removeWeatherObserver(webDashboard);

        abcWeather.setMeasurements(new WeatherData(50, 0, 0.7));
        System.out.println("*".repeat(30) + "\n");
    }
}
