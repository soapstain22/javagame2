import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GameSprite {
    private int max = 0;
    private int cur = 0;
    protected int maxHeight = 32;
    protected int maxWidth = 32;
    protected int maxDirections = 8; //must be 1, 4, 8
    BufferedImage source;
    BufferedImage[][] sprites;
    BufferedImage getCurrentSprite(){
        return source;
    }
    Image getSprite(int direction, boolean moving){

        return source.getSubimage((direction%maxWidth)*maxWidth,(cur%max)*maxHeight, maxWidth, maxHeight);
    }
    GameSprite(String file) throws IOException{
        
        //can only have 1,4,8 directions
        File f = new File(file);
        BufferedImage b = ImageIO.read(f);
        int totalAnimCells = source.getHeight()/this.maxWidth;
        int w = maxWidth/b.getWidth();
        int h = maxHeight/b.getHeight();
        sprites = new BufferedImage[w][h];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                sprites[i][j] = source.getSubimage((j%maxWidth)*maxWidth,(i%max)*maxHeight, maxWidth, maxHeight);
                
            }
        }
        source.getHeight();

    }

}
