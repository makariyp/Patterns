package org.makariyp.adapter;

public class FahrenheitToCelsiusAdapter implements TemperatureSensor {
    private final FahrenheitSensor fahrenheitSensor;

    public FahrenheitToCelsiusAdapter(FahrenheitSensor fahSensor) {
        this.fahrenheitSensor = fahSensor;
    }

    public double getTemperatureInFahrenheit() {
        double tempInFahrenheit = this.fahrenheitSensor.getTemperatureInFahrenheit();
        return ((tempInFahrenheit - 32) * 5) / 9;
    }
}
