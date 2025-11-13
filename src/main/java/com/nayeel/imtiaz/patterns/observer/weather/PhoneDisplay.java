package com.nayeel.imtiaz.patterns.observer.weather;

final class PhoneDisplay implements WeatherObserver {
    // wanted to make update() package private
    // because we don't want the client/driver
    // to be able to call it, only `WeatherStation`
    // class should call it. Assume client/driver
    // not in the same package.
    @Override
    public void update(WeatherData newWeatherData) {
        System.out.printf("[Phone Display]: Temperature: %.1f fahrenheit, Humidity: %.1f, Pressure: %.1f Hg\n",
                newWeatherData.temperature(),
                newWeatherData.humidity(),
                newWeatherData.pressure()
        );
    }
}
