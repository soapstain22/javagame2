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
    Image spriteUpdate(int direction, boolean moving){

        return source.getSubimage((direction%maxWidth)*maxWidth,(cur%max)*maxHeight, maxWidth, maxHeight);
    }
    GameSprite(String file, int maxHeight, int maxWidth) throws IOException{
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        //can only have 1,4,8 directions
        File f = new File(file);
        BufferedImage b = ImageIO.read(f);
        int totalAnimCells = source.getHeight()/this.maxWidth;
        
        source.getHeight();

    }

}
