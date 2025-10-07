package com;

public class ConvertClass {
    public static double CelsiusToFahrenheit(double C) {
        // initialising
        double fahrenheit = 0.0;

        // formula for conversion
        fahrenheit = (C * 1.8) + 32;
        System.out.println(" value of temperature in fahrenheit:" + fahrenheit);
        return fahrenheit;
    }
}
