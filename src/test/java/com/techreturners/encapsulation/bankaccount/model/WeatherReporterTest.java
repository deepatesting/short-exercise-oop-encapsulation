package com.techreturners.encapsulation.bankaccount.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WeatherReporterTest {

    @Test
    public void checkForLondon() {
        WeatherReporter myWeather = new WeatherReporter("London", 20);

        assertEquals("🌦", myWeather.getTodayWeather());
    }

    @Test
    public void checkForCalifornia() {
        WeatherReporter myWeather = new WeatherReporter("California", 20);

        assertEquals("🌅", myWeather.getTodayWeather());
    }

    @Test
    public void checkForCapeTown() {
        WeatherReporter myWeather = new WeatherReporter("Cape Town", 20);

        assertEquals("🌤", myWeather.getTodayWeather());
    }

    @Test
    public void checkForPrintTemperatureMidForLondon() {
        WeatherReporter myWeather = new WeatherReporter("London", 20);

        assertEquals("I am in London and it is 🌦. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 68.",
                myWeather.printTemperature());
    }

    @Test
    public void checkForPrintTemperatureMaxForLondon() {
        WeatherReporter myWeather = new WeatherReporter("London", 31);

        assertEquals("I am in London and it is 🌦. It's too hot 🥵!. The temperature in Fahrenheit is 87.8.",
                myWeather.printTemperature());
    }

    @Test
    public void checkForPrintTemperatureMinForLondon() {
        WeatherReporter myWeather = new WeatherReporter("London", 9);

        assertEquals("I am in London and it is 🌦. It's too cold 🥶!. The temperature in Fahrenheit is 48.2.",
                myWeather.printTemperature());
    }
}
