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
            this.color = Color.getHSBColor(37, 100, 29);
            this.outline = Color.getHSBColor(37, 100, 24);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material sand = new Material() {
        {
            this.color = Color.getHSBColor(37, 100, 71);
            this.outline = Color.getHSBColor(37, 100, 78);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
}
