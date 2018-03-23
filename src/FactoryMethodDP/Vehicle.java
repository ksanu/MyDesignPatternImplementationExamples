package FactoryMethodDP;

/**
 * The Vehicle class is a superclass of this Factory Design Pattern example. It contains the most basic information
 * we should have about a typical vehicle.
 */
public abstract class Vehicle {

    Integer numberOfWeels;
    Boolean hasEngine;
    public abstract String getInfo();
    public Vehicle (Integer numberOfWeels, Boolean hasEngine)
    {
        this.numberOfWeels = numberOfWeels;
        this.hasEngine = hasEngine;
    }
}
