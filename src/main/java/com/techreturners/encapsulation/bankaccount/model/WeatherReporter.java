package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;
    private static final double FARENHEIT = (9.0 / 5.0);
    private static final int FHEIT32 = 32;
    private static final int MAX_VALUE = 30;
    private static final int MIN_VALUE = 10;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String printTemperature() {
        double newTemp = FARENHEIT * temperature + FHEIT32;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location, getTodayWeather(), getTemperatureMessage(), newTemp);
    }

    public String getTodayWeather() {
        if (location.equals("London")) {
            return "🌦";
        } else if (location.equals("California")){
            return "🌅";
        } else if (location.equals("Cape Town")) {
            return "🌤";
        }
        return "🔆";
    }

    public String getTemperatureMessage() {
        if (temperature > MAX_VALUE) {
            return "It's too hot 🥵!";
        } else if (temperature < MIN_VALUE) {
            return "It's too cold 🥶!";
        }
        return "Ahhh...it's just right 😊!";
    }

}
