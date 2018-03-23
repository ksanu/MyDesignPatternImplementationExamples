package UnitTests;

import FactoryMethodDP.VehicleFactory;
import IteratorDP.VehicleList;
import org.junit.Assert;
import org.junit.Test;

public class VehicleListUnitTests {

    @Test
    public void CurrentItemOfNewAndEmptyListShouldBeNull()
    {
        VehicleList myTestVehicleList = new VehicleList();
        VehicleList.Iterator itr = myTestVehicleList.createIterator();
        Assert.assertEquals( null, itr.currentItem());
    }

    @Test
    public void NewAndEmptyListShouldBeDone()
    {
        VehicleList myTestVehicleList = new VehicleList();
        VehicleList.Iterator itr = myTestVehicleList.createIterator();
        Assert.assertEquals(true, itr.isDone());
    }
    @Test
    public void FirstElemShouldBeCar()
    {
        VehicleList myTestVehicleList = new VehicleList();
        myTestVehicleList.add(VehicleFactory.getVehicle(4, true));
        myTestVehicleList.add(VehicleFactory.getVehicle(2, true));

        VehicleList.Iterator itr = myTestVehicleList.createIterator();
        itr.first();
        Assert.assertEquals("It's a car.", itr.currentItem().getInfo());
    }

    @Test
    public void SecondElemShouldBeBike()
    {
        VehicleList myTestVehicleList = new VehicleList();
        myTestVehicleList.add(VehicleFactory.getVehicle(4, true));
        myTestVehicleList.add(VehicleFactory.getVehicle(2, false));

        VehicleList.Iterator itr = myTestVehicleList.createIterator();
        itr.first();
        itr.next();
        Assert.assertEquals("It's a bike.", itr.currentItem().getInfo() );
    }

    @Test
    public void IteratorShouldNotBeDone()
    {
        VehicleList myTestVehicleList = new VehicleList();
        myTestVehicleList.add(VehicleFactory.getVehicle(4, true));
        myTestVehicleList.add(VehicleFactory.getVehicle(2, false));

        VehicleList.Iterator itr = myTestVehicleList.createIterator();
        itr.first();
        itr.next();
        Assert.assertEquals(false, itr.isDone());
    }

    @Test
    public void IteratorShouldBeDone()
    {
        VehicleList myTestVehicleList = new VehicleList();
        myTestVehicleList.add(VehicleFactory.getVehicle(4, true));
        myTestVehicleList.add(VehicleFactory.getVehicle(2, false));

        VehicleList.Iterator itr = myTestVehicleList.createIterator();
        itr.first();
        itr.next();
        itr.next();
        Assert.assertEquals(true, itr.isDone());
    }
    @Test
    public void FirstUsedAgainCurrentMemberShouldBeCar()
    {
        VehicleList myTestVehicleList = new VehicleList();
        myTestVehicleList.add(VehicleFactory.getVehicle(4, true));
        myTestVehicleList.add(VehicleFactory.getVehicle(2, false));

        VehicleList.Iterator itr = myTestVehicleList.createIterator();
        itr.first();
        itr.next();
        itr.next();
        itr.first();
        Assert.assertEquals("It's a car.", itr.currentItem().getInfo() );
    }

}