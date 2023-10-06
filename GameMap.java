import java.awt.Component;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.Map;

public class GameMap {
    static ObjBst root;
    static GameTile[][] map = new GameTile[256][256];
    final public static int seed = 451679238;

    public boolean GenerateMap() {
        map = new GameTile[256][256];
        System.out.println("GameMap.GenerateMap()");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = new GameTile((int) Math.random()*10);

            }
        }
        return false;
    }

    public void addObject(GameObject gameObject) {
        root.addObject(gameObject);
        System.out.println("GameMap.addObject()");

    }

    public static Component GiveWindowPls() {
        System.out.println("GameMap.GiveWindowPls()");
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
        System.out.println("GameMap.GiveWindowPls()");
        return p;
    }

    GameTile getTile(int x, int y) {
        return map[x][y];
    }
}
