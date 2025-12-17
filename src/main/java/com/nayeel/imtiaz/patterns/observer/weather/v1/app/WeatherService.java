package com.nayeel.imtiaz.patterns.observer.weather.v1.app;

import com.nayeel.imtiaz.patterns.observer.weather.v1.Observers;
import com.nayeel.imtiaz.patterns.observer.weather.v1.WeatherData;
import com.nayeel.imtiaz.patterns.observer.weather.v1.WeatherObserver;
import com.nayeel.imtiaz.patterns.observer.weather.v1.WeatherStation;

public class WeatherService {
    public static void main(String[] args) {
        WeatherStation abcWeather = new WeatherStation();
        WeatherObserver phone = Observers.phoneDisplay();
        WeatherObserver webDashboard = Observers.webDashboard();

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
