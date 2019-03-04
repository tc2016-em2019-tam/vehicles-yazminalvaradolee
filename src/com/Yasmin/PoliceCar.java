package com.Yasmin;

public class PoliceCar extends Vehicle implements LandVehicle, Emergency {
    private int numWheels;

    public PoliceCar(String name, int maxPassengers, double maxSpeed) {
        super(name, maxPassengers, maxSpeed);
    }

    public PoliceCar(String name) {
        super(name);
    }

    @Override
    public void soundSiren() {
        System.out.println("BEEP BEEP WUUU");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("DRIVE METHOD ()");
    }

}
