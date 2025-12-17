package com.nayeel.imtiaz.patterns.observer.weather.v1;

public final class Observers {
    private Observers() {}
    public static WeatherObserver phoneDisplay() { return new PhoneDisplay(); }
    public static WeatherObserver webDashboard() { return new WebDashboard(); }
}
