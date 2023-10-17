
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Game
 */
public abstract class Game {
    public static GameMap gameMap;
    public static GameCache gameCache;
    public static Player player;
    public static GameCamera gameCamera;
    public static KeyListener k;
    
    boolean debug;
    public static void main(String[] args) {
        System.out.println("Game.main()");
        Game.gameMap = new GameMap(64,4);
        Game.player = new Player(10,10);
        gameCamera = new GameCamera(player);
        Game.Load(null);
        Runnable tick = new Runnable() {
    public void run() {
        Game.gameMap.update();
        Game.gameCamera.update();
        Game.player.update();
        System.out.printf("player|"+Game.player.y+"y %6s| ", Game.player.x+"x");
        System.out.printf("dir:"+player.direction+" %5s| %n", Game.player.speed);

    }
};

ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
executor.scheduleAtFixedRate(tick, 0, 10, TimeUnit.MILLISECONDS);
    }
    private static void Load(String string) {
        System.out.println("Game.Load()");
        
    }
    public Thread ticks = new Thread(()->extracted());
    private void extracted() {
        try {
            Thread.sleep(10);
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Thread.currentThread().run();
    }
}