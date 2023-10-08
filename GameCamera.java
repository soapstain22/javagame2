import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Point2D;

public class GameCamera extends Frame {
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
        g.fillRect(c, d, 32, 32);}
        }
        g.setColor(Color.black);
        g.drawOval(64, 64, 32, 32);
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
}
