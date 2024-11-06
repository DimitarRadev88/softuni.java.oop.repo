package com.inheritance.exercise.needForSpeed.vehicle;

public class SportCar extends Car {
    private static final double DEFAULT_FUEL_CONSUMPTION = 10;

    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }

}
