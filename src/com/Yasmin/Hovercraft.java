package com.Yasmin;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel {
    private int numWheels;
    private double displacement;

    public Hovercraft(String name, int maxPassengers, double maxSpeed, int numWheels, double displacement) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
        this.displacement = displacement;
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
    public double getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    @Override
    public void drive() {
        System.out.println("Calling drive() method.");

    }

    @Override
    public void launch() {
        System.out.println("Calling launch () method.");
    }

    public void enterLand(){
        System.out.println("Enter land.");
    }

    public void enterSea(){
        System.out.println("Enter Sea");
    }
}
