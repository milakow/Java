package edu.sda.java.basics.practise.temperature;

/**
 * Write a class Temperature
 * It should store temperature in Celcius
 * It should have 2 constructors - one accepting temperature and second accepting Temperature and unit - if unit is "F" - recalculate temp from Fahrengeit, if it'd C - just put it as it is
 *
 * For recalculating between C and F we may ( but not have to) use inner static class TempTransform with methods: fromC - returning fahrenheiths and fromF - returning celcius
 *
 * Class Temperature should have methods returning value in C, F
 */
public class Temperature {
    private double tempCelsius;

    public double getTempCelsius() {
        return tempCelsius;
    }

    public Temperature(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public Temperature(double temp, String unit) {
        if (unit.equals("F")) {
            this.tempCelsius = (temp - 32) * 5 / 9;
        } else if (unit.equals("C")) {
            this.tempCelsius = temp;
        }
    }

    public double returnTempInF () {
        return this.tempCelsius * 9 / 5 + 32;
    }
    public double returnTempInC() {
        return this.tempCelsius;
    }

}
