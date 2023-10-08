import java.awt.Component;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GameMap {
    static ObjBst root;
    static GameTile[][] map = new GameTile[256][256];
    final public static int seed = 451679238;
    public boolean GenerateMap() {
        Random r = new Random(seed);
        map = new GameTile[256][256];
        System.out.println("GameMap.GenerateMap()");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                
                map[i][j] = new GameTile((int) r.nextInt(3));
            }
        }
        return false;
    }
    public void addObject(GameObject gameObject) {
        root.addObject(gameObject);
        System.out.println("GameMap.addObject()");
    }

        Panel p = new Panel(null) {
            @Override
            public void paint(Graphics g) {
                // gameplan
                /*
                 * 
                 */
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                    System.out.println(i);
                    g.fillRect(32*i, 32*j,32,32);
                    }
                }
                setVisible(true);
                repaint();
                super.paint(g);
            }
        };
    
    GameTile getTile(double d, double e) {
        return map[(int) d][(int) e];
    }
    public static boolean isTilePassable(double d, double e) {
        return GameMap.map[(int)d][(int)e].open;
    }

    public void update() {
        Game.player.update();
        
    }
}
