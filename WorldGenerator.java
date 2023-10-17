import java.util.Random;

public class WorldGenerator {
    byte[][] erosion;
    byte[][] temperature;
    byte[][] wetness;
    byte[][] continential;
    Soil[][] soil;
    byte[][] depth;

    public GameTile[][] generate(int size, long seed) {
        GameTile[][] map = new GameTile[size][size];        
        Random r = new Random(seed);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                soil[i][j] = new Soil(r.nextGaussian(2,128));
                erosion[i][j] = (byte) r.nextGaussian(2,128);
                temperature[i][j] = (byte) r.nextGaussian(2,128);
                continential[i][j] = (byte) r.nextGaussian(2,128);
                soil[i][j] = new Soil(r.nextGaussian(2,128));
                TileFactory f = new TileFactory();
                                map[i][j] = f.createTile(erosion[i][j],temperature[i][j],wetness[i][j],continential[i][j]);

                }
            }
        
        return map;
    }
    WorldGenerator(int size, long seed){
        soil = new Soil[size][size];
        erosion = new byte[size][size];
        temperature = new byte[size][size];
        wetness = new byte[size][size];
        continential = new byte[size][size];
        depth = new byte[size][size];
    }
}
