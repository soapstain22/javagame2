import java.awt.Image;
import java.awt.image.ImageObserver;

public class GameCache {
    
    void loadAsset(){

    }
    GameTile[][] generateMap(){
        java.util.Random r = new java.util.Random();
        double noise = r.nextGaussian() * Math.sqrt(32) + 3;

        for (int i = 0; i < Game.gameMap.mapSize(); i++) {
            
        }
        return null;
    }
}
