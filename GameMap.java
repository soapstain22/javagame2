import java.awt.Component;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GameMap {
    static ObjBst root;
    static GameTile[][] map;
    final public static int seed = 451679238;
    public boolean GenerateMap() {
        Random r = new Random(seed);
        map = new GameTile[512][512];
        System.out.println("GameMap.GenerateMap()");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i%map.length][j%map.length] = new GameTile((int) r.nextInt(3));
            }
        }
        return false;
    }
    public void addObject(GameObject gameObject) {
        root.addObject(gameObject);
        System.out.println("GameMap.addObject()");
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
    void mapRewrite(File f) throws FileNotFoundException{
        Scanner s = new Scanner(f);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = new GameTile(s.nextInt());
            }
        }
        s.nextInt()

    }
}
