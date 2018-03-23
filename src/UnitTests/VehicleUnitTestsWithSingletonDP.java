package UnitTests;

import FactoryMethodDP.Vehicle;
import SingletonDP.VehicleFactorySingleton;
import org.junit.Assert;
import org.junit.Test;

public class VehicleUnitTestsWithSingletonDP {


    @Test
    public void VehicleWithTwoWeelsAndEngineShouldBeMotorbike()
    {
        Vehicle v = VehicleFactorySingleton.getInstance().getVehicle(2, true);
        Assert.assertEquals("It's a motorbike.", v.getInfo());
    }

    @Test
    public void VehicleWithTwoWeelsAndNoEngineShouldBeBike()
    {
        Vehicle v =  VehicleFactorySingleton.getInstance().getVehicle(2, false);
        Assert.assertEquals("It's a bike.", v.getInfo());
    }

    @Test
    public void VehicleWithFourWeelsAndNoEngineShouldBeNull()
    {
        Vehicle v =  VehicleFactorySingleton.getInstance().getVehicle(4, false);
        Assert.assertEquals(null, v);
    }

    @Test
    public void VehicleWithFourWeelsAndEngineShouldBeCar()
    {
        Vehicle v =  VehicleFactorySingleton.getInstance().getVehicle(4, true);
        Assert.assertEquals("It's a car.", v.getInfo());
    }
}
