import java.awt.Color;

public abstract class Material {
    boolean flammable;
    Color color;
    Color outline;
    byte hardness;
    byte conductivity;
    byte density;
        public static final Material loam = new Material() {
        {
            this.color = Color.getHSBColor(37, 100, 20);
            this.outline = Color.getHSBColor(37, 100, 10);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material silt = new Material() {
        {
            this.color = Color.getHSBColor(37, 100, 20);
            this.outline = Color.getHSBColor(37, 100, 10);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material gravel = new Material() {
        {
            this.color = Color.getHSBColor(37, 100, 20);
            this.outline = Color.getHSBColor(37, 100, 10);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material clay = new Material() {
        {
            this.color = Color.getHSBColor(37, 100, 20);
            this.outline = Color.getHSBColor(37, 100, 10);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material mud = new Material() {
        {
            this.color = Color.getHSBColor(37, 100, 20);
            this.outline = Color.getHSBColor(37, 100, 10);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material lava = new Material() {
        {
            this.color = Color.getHSBColor(37, 100, 20);
            this.outline = Color.getHSBColor(37, 100, 10);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material dirt = new Material() {
        {
            this.color = Color.getHSBColor(162, 106, 21);
            this.outline = Color.getHSBColor(108, 71, 14);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material sand = new Material() {
        {
            this.color = Color.getHSBColor(216, 203, 79);
            this.outline = Color.getHSBColor(176, 165, 64);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material grass = new Material() {
        {
            this.color = Color.getHSBColor(160, 190, 60);
            this.outline = Color.getHSBColor(130, 155, 49);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material tallgrass = new Material() {
        {
            this.color = Color.getHSBColor(89, 157, 52);
            this.outline = Color.getHSBColor(63, 111, 37);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material stone = new Material() {
        {
            this.color = Color.getHSBColor(156,156,156);
            this.outline = Color.getHSBColor(156,156,156);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
    public static final Material iron = new Material() {
        {
            this.color = Color.getHSBColor(37, 100, 20);
            this.outline = Color.getHSBColor(37, 100, 10);
            this.hardness = 32;
            this.conductivity = 32;
            this.density = 32;
            this.flammable = false;
        }
    };
}
