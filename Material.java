import java.awt.Color;

public abstract class Material {
    boolean flammable;
    Color color;
    Color outline;
    byte hardness;
    byte conductivity;
    byte density;

    public static final Material dirt = new Material() {
        {
            this.color = Color.getHSBColor(37, 100, 20);
            this.outline = Color.getHSBColor(37, 100, 10);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material sand = new Material() {
        {
            this.color = Color.getHSBColor(37, 100, 71);
            this.outline = Color.getHSBColor(37, 100, 50);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material stone = new Material() {
        {
            this.color = Color.getHSBColor(0, 0, 71);
            this.outline = Color.getHSBColor(0, 0, 50);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
}
