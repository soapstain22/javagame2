import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.PriorityQueue;

public class GameCache {
    static PriorityQueue<GameObject> render;
    
    static BufferedImage noise(int thingy){
        java.util.Random r = new java.util.Random();
        BufferedImage i = new BufferedImage(256, 256, 1);
        for (int j = 0; j < 256; j++) {
            for (int j2 = 0; j2 < 256; j2++) {
                i.setRGB(j, j2, (int) (r.nextGaussian()*4));
            }
        }
        return i;
    }

    public static void track(GameObject gameObject) {
        render.add(gameObject);
    }
}
