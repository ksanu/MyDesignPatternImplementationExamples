package UnitTests;

import AdapterDP.AncientChineseCuboid;
import AdapterDP.CuboidAdapter;
import org.junit.Assert;
import org.junit.Test;


public class CuboidAdapterUnitTests {

    @Test
    public void VolumeShouldBeOne()
    {
        CuboidAdapter cuboidAdapter = new CuboidAdapter(
                new AncientChineseCuboid(2.0,2.0,2.0, 100.00));
        Assert.assertEquals(1.0, cuboidAdapter.getVolume(), 0.01);
    }

    @Test
    public void VolumeShouldNotBeOne()
    {
        CuboidAdapter cuboidAdapter = new CuboidAdapter(
                new AncientChineseCuboid(1.0,1.0,1.0, 100.00));
        Assert.assertNotEquals(1.0, cuboidAdapter.getVolume(), 0.01);
    }

    @Test
    public void WeightShouldBeFive()
    {
        CuboidAdapter cuboidAdapter = new CuboidAdapter(
                new AncientChineseCuboid(1.0,1.0,1.0, 80.00));
        Assert.assertEquals(5.0, cuboidAdapter.getWeight(), 0.01);
    }

    @Test
    public void WeightShouldNotBeFive()
    {
        CuboidAdapter cuboidAdapter = new CuboidAdapter(
                new AncientChineseCuboid(10.0,10.0,10.0, 80.00));
        Assert.assertNotEquals(5.0, cuboidAdapter.getWeight(), 0.01);
    }

    @Test
    public void LengthShouldNotBeTen()
    {
        CuboidAdapter cuboidAdapter = new CuboidAdapter(
                new AncientChineseCuboid(10.0,10.0,10.0, 80.00));
        Assert.assertNotEquals(10.0, cuboidAdapter.getLegth(), 0.01);
    }

    @Test
    public void LengthShouldBeTen()
    {
        CuboidAdapter cuboidAdapter = new CuboidAdapter(
                new AncientChineseCuboid(20.0,10.0,10.0, 80.00));
        Assert.assertEquals(10.0, cuboidAdapter.getLegth(), 0.01);
    }

    @Test
    public void WidthShouldBeFour()
    {
        CuboidAdapter cuboidAdapter = new CuboidAdapter(
                new AncientChineseCuboid(20.0,8.0,10.0, 80.00));
        Assert.assertEquals(4.0, cuboidAdapter.getWidth(), 0.01);
    }

    @Test
    public void HeightShouldBeTwenty()
    {
        CuboidAdapter cuboidAdapter = new CuboidAdapter(
                new AncientChineseCuboid(20.0,8.0,40.0, 80.00));
        Assert.assertEquals(20.0, cuboidAdapter.getHeight(), 0.01);
    }
}
