package com.nayeel.imtiaz.patterns.observer.weather;

final class WebDashboard implements WeatherObserver {
    @Override
    public void update(WeatherData newWeatherData) {
        System.out.printf("[Web Dashboard]: Temperature: %.1f fahrenheit, Humidity: %.1f, Pressure: %.1f Hg\n",
                newWeatherData.temperature(),
                newWeatherData.humidity(),
                newWeatherData.pressure()
        );
    }
}
