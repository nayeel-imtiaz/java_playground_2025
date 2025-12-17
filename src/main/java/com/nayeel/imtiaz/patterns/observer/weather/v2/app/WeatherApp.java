package com.nayeel.imtiaz.patterns.observer.weather.v2.app;

import com.nayeel.imtiaz.patterns.observer.weather.v2.PhoneDisplay;
import com.nayeel.imtiaz.patterns.observer.weather.v2.Subject;
import com.nayeel.imtiaz.patterns.observer.weather.v2.WeatherData;
import com.nayeel.imtiaz.patterns.observer.weather.v2.WeatherObserver;
import com.nayeel.imtiaz.patterns.observer.weather.v2.WeatherStation;
import com.nayeel.imtiaz.patterns.observer.weather.v2.WebDashboard;

public class WeatherApp {
    public static void main(String[] args) {
        Subject ABCWeatherStation = new WeatherStation();
        WeatherStation ABCThermometer = (WeatherStation) ABCWeatherStation;


        WeatherObserver ABCPhone = new PhoneDisplay();
        WeatherObserver ABCWebDashboard = new WebDashboard();
        ABCWeatherStation.subscribe(ABCPhone);
        ABCWeatherStation.subscribe(ABCWebDashboard);

        ABCThermometer.readWeatherData(new WeatherData(77.7f, 10, 55));
        ABCThermometer.readWeatherData(new WeatherData(87.8f, 10, 59));

        ABCWeatherStation.unsubscribe(ABCWebDashboard);
        ABCThermometer.readWeatherData(new WeatherData(82.4f, 11, 60));
    }
}
