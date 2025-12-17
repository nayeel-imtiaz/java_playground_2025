package com.nayeel.imtiaz.patterns.observer.weather.v2;

public class PhoneDisplay implements WeatherObserver{
    @Override
    public void display(WeatherData weatherData) {
        System.out.printf(
                "<PhoneDisplay>: Temperature: %.1f, Humidity: %.1f, Pressure: %.1f\n\n",
                weatherData.temperature(),
                weatherData.humidity(),
                weatherData.pressure()
        );
    }
}
