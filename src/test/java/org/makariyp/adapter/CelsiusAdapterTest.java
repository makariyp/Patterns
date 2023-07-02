package org.makariyp.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CelsiusAdapterTest {

    @Test
    public void testGetTemperatureInFahrenheit() {
        // gives
        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor();
        TemperatureSensor celsiusAdapter = new FahrenheitToCelsiusAdapter(fahrenheitSensor);

        // when
        double fahrenheit = fahrenheitSensor.getTemperatureInFahrenheit();
        double celsius = celsiusAdapter.getTemperatureInFahrenheit();

        // then
        assertTrue((((fahrenheit - 32) * 5) / 9) - celsius < 0.00000000001d);
    }
}