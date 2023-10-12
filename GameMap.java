import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import javax.imageio.ImageIO;

public class GameMap {
    static TreeMap<GameObject,Point2D> t;
    static GameTile[][] map;
    public static Dictionary<String,GameObject> g;
    final public static long seed = 451679238;
    public GameMap(int size, int seed) {
        map = WorldGenerator.generate(size, seed);
    }
    
    GameTile getTile(double d, double e) {
        int truex = (int) (d%map.length);
        int truey = (int) (e%map[0].length);
        return map[truex][truey];
    }
    public static boolean isTilePassable(double d, double e) {
        return GameMap.map[(int)d][(int)e].open;
    }

    public void update() {

        Game.player.update();
    }
    void mapRewrite(File f) throws IOException{
        BufferedImage b = ImageIO.read(f);
        for (int c = 0; c < map.length; c++) {
            for (int j = 0; j < map.length; j++) {
                map[c][j] = new GameTile(b.getRGB(c, j));
            }
        }
    }
    public int mapSize() {
        return this.map.length;
    }

    public void addObject(GameObject gameObject) {
    }
}
