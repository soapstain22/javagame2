
public class TileFactory {
    public byte sealevel = 64;

    public GameTile createTile(byte erosion, byte temperature, byte wetness, byte continential) {
        GameTile gt;
        Soil s;

        if (continential < 50) {
            // mountians
            return new GameTile(Material.stone);
        }
        if (continential < -50) {
            // trench
            return new GameTile(Material.stone);
        }
        if (wetness > 10) {
            return new GameTile(Material.grass);
        }
        if (erosion > 30) {

            if (erosion > 60) {
                return new GameTile(Material.sand);
                // sand
            }
            return new GameTile(Material.gravel);
            // gravel
        }
        if (erosion < -30) {
            // dirt
            if (erosion < -60) {
                // clay
            }
        }
        return new GameTile(Material.loam);
    }
}
