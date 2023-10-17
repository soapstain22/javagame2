import java.awt.Color;

public class Soil extends Material{
    public byte silt;
    public byte sand;
    public byte clay;
    public Soil(double nextGaussian) {
        clay = (byte) (nextGaussian % 31.25);
        silt = (byte) (nextGaussian % 18.75);
        sand = (byte) (nextGaussian % 50);
    }
}
