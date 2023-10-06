import java.util.HashSet;

import javax.swing.SpringLayout.Constraints;

import java.awt.*;
import java.awt.event.KeyListener;

/**
 * Game
 */
public abstract class Game {
    public static GameMap gameMap;
    public static GameCache gameCache;
    public static Player player;
    public static GameCamera gc;
    public static KeyListener k;
    public static Window window;
    boolean debug;
    public static void main(String[] args) {
        System.out.println("Game.main()");
        Game.gameMap = new GameMap();
        Game.gameMap.GenerateMap();
        Game.player = new Player(2,5);
        Game.Load(null);
        gc = new GameCamera();
    }
    private static void Load(String string) {
        System.out.println("Game.Load()");
        
    }
    void doTick() throws InterruptedException{
        wait(10);
        GameCamera.update();
        doTick();
    }
}