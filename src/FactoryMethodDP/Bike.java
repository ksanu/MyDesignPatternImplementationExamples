package FactoryMethodDP;

/**
 * This is the Bike class. It is the subclass of the Vehicle class,
 * which is in accordance with the Factory Design Pattern.
 */
public class Bike extends Vehicle {
    public Bike(Integer numberOfWeels, Boolean hasEngine) {
        super(numberOfWeels, hasEngine);
    }

    /**
     * This is the concrete implementation of the getInfo() method.
     * @return String This returns information about this vehicle.
     */
    @Override
    public String getInfo() {
        return "It's a bike.";
    }
}
