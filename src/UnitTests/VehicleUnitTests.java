package UnitTests;
import FactoryMethodDP.Vehicle;
import FactoryMethodDP.VehicleFactory;
import org.junit.Assert;
import org.junit.Test;

public class VehicleUnitTests {

    @Test
    public void VehicleWithTwoWeelsAndEngineShouldBeMotorbike()
    {
        Vehicle v = VehicleFactory.getVehicle(2, true);
        Assert.assertEquals("It's a motorbike.", v.getInfo());
    }

    @Test
    public void VehicleWithTwoWeelsAndNoEngineShouldBeBike()
    {
        Vehicle v = VehicleFactory.getVehicle(2, false);
        Assert.assertEquals("It's a bike.", v.getInfo());
    }

    @Test
    public void VehicleWithFourWeelsAndNoEngineShouldBeNull()
    {
        Vehicle v = VehicleFactory.getVehicle(4, false);
        Assert.assertEquals(null, v);
    }

    @Test
    public void VehicleWithFourWeelsAndEngineShouldBeCar()
    {
        Vehicle v = VehicleFactory.getVehicle(4, true);
        Assert.assertEquals("It's a car.", v.getInfo());
    }
}
