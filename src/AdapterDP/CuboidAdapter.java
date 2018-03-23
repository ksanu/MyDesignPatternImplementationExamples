package AdapterDP;

/**
 * This is an adapter class with an AncientChineseCuboid as the adaptee.
 * It has an interface made for modern users. The values it returns are in SI units.
 */
public class CuboidAdapter {
    private AncientChineseCuboid adaptee;

    public CuboidAdapter(AncientChineseCuboid acc)
    {
        this.adaptee = acc;
    }
    public Double getVolume()
    {
        // 1 sheng = 1 liter = 1 m^3
        return this.adaptee.getVolume();
    }

    public Double getWeight()
    {
        //2 jin	= 1 kilogram
        //1 jin = 1/2 kg
        Double weightInKg = this.adaptee.getWeight() / 2;
        return weightInKg;
    }

    public Double getWidth()
    {
        // chi = 1/2 m
        Double widthInMeters = this.adaptee.widthInChi / 2;
        return widthInMeters;
    }

    public Double getLegth()
    {
        // chi = 1/2 m
        Double lengthInMeters = this.adaptee.lengthInChi / 2;
        return lengthInMeters;
    }

    public Double getHeight()
    {
        // chi = 1/2 m
        Double heightInMeters = this.adaptee.heightInChi / 2;
        return heightInMeters;
    }
}
