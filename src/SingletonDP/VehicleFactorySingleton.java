package SingletonDP;

import FactoryMethodDP.*;

/**
 * This is an alternative version of the VehicleFactory class that uses the Singleton Design Pattern with
 * lazy initialization.
 */
public class VehicleFactorySingleton {
    private static VehicleFactorySingleton instance;

    /**
     * The constructor must be private to restrict instantiation of the class from other classes.
     */
    private VehicleFactorySingleton() {}

    /**
     * This method returns the instance of the VehicleFactorySingleton class.
     * The instance is created at the first call of this method - lazy initialization.
     * @return This returns the one and only instance of the VehicleFactorySingleton class.
     */
    public static VehicleFactorySingleton getInstance()
    {

        if(instance == null){
            instance = new VehicleFactorySingleton();
        }
        return instance;
    }
    /**
     * This is the factory method. It returns an object of the Vehicle type, but the actual object it returns might be
     * an instance of any of the subclasses. The choice depends on the parameters.
     *
     * @param numberOfWeels This is the number of weels of the vehicle.
     * @param hasEngine This tells whether the vehicle has an engine or not.
     * @return Vehicle This returns an object of the Vehicle type, which can be an instance of a subclass.
     */
    public Vehicle getVehicle(Integer numberOfWeels, Boolean hasEngine)
    {
        if(numberOfWeels.equals(null) || hasEngine.equals(null)) return null;
        if(numberOfWeels.equals(2))
        {
            if(hasEngine) return new Motorbike(numberOfWeels, hasEngine);
            else return new Bike(numberOfWeels, hasEngine);
        }
        if(numberOfWeels.equals(4)&& hasEngine) return new Car(numberOfWeels, hasEngine);

        return null;
    }
}
