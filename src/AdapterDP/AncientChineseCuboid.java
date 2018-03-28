package AdapterDP;

/**
 * This is a very old cuboid. It is difficult to find the specific Ancient Chinese units of measurement so
 * let's assume the following:
 *  Distance	2 chi	= 1 meter
 *  Volume	    1 sheng	= 1 liter
 *  Weight	    2 jin	= 1 kilogram
 */
public class AncientChineseCuboid {
    Double lengthInChi;
    Double widthInChi;
    Double heightInChi;
    Double densityInJinPerSheng;

    public AncientChineseCuboid(Double lengthInChi, Double widthInChi, Double heightInChi, Double densityInJinPerSheng)
    {
        this.lengthInChi = lengthInChi;
        this.widthInChi = widthInChi;
        this.heightInChi = heightInChi;
        this.densityInJinPerSheng = densityInJinPerSheng;
    }

    /**
     *The method for calculating and returning volume.
     *
     * @return This returns the volume in untits of sheng.
     */
    public Double getVolume()
    {
        // 1 sheng = 1 liter = 1 dm^3
        // 1 chi^3 = 0.125 m^3 = 125 dm^3
        Double volumeInChiCubed = this.lengthInChi * this.widthInChi * this.heightInChi;
        Double volumeInShengs = volumeInChiCubed * 125;
        return volumeInShengs;
    }

    /**
     *The method for calculating and returning weight.
     *
     * @return This returns the weight of the cuboid in jin units.
     */
    public Double getWeight()
    {
        return this.densityInJinPerSheng * this.getVolume();
    }

}
