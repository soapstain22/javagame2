import java.util.Random;

public class WorldGenerator {

    public static GameTile[][] generate(int size, long seed) {
        GameTile[][] map = new GameTile[size][size];
        Random r = new Random(seed);
        int selected = (int) r.nextGaussian(3,1);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = new GameTile((int)r.nextGaussian(1,1));
            }
        }
        return map;
    }
    
}
