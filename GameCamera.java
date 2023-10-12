import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.awt.image.TileObserver;
import java.awt.image.WritableRenderedImage;
import java.util.HashMap;

public class GameCamera extends Frame{
    GameObject[] visible;
    Point2D tracking;
    @Override
    public void paint(Graphics g) {
        // gameplan
        /*
         *
         */
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                GameTile t = Game.gameMap.getTile(Game.player.x+i, Game.player.y+j);
                //set color of background item
                g.setColor(t.material.color);
                int offsetx = (((int)i*32));
                int offsety = (((int)j*32));
                int c = (int) (offsetx-(Game.player.x*32)%32);
                int d = (int) (offsety-(Game.player.y*32)%32);
                g.fillRect(c, d, 32, 32);
                /*visible = wrangleNear(tracking, d, i);
                for (int k = 0; k < visible.length; k++) {
                    //g.drawImage(visible[k].getGameSprite(), offsetx, offsety, Game.gameCamera);
                }
                */
            }
        }
        setVisible(true);
    }
    public void update(){
        repaint();
    }
    GameCamera(Player p){
        tracking = p;
        this.addKeyListener(p);
        setVisible(true);
        setBounds(200, 200, 200, 200);
    
    }
    GameObject[] wrangleNear(Point2D Tracked, int range, int limit){
        return visible;
        //GameMap.map[][];
    }
}
