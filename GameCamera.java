import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Point2D;

public class GameCamera extends Frame {
    double x;
    double y;
    @Override
    public void paint(Graphics g) {
        // gameplan
        /*
         *
         */

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
            g.setColor(Game.gameMap.getTile(this.getX()+i, this.getY()+j).material.color);
            g.fillRect(32*i+(int)x, 32*j+(int)x,32,32);
            g.setColor(Game.gameMap.getTile(this.getX()+i, this.getY()+j).material.outline);
            g.drawRect(32*i+(int)x, 32*j+(int)y,32,32);
            }
        }
        
        setVisible(true);

    }
    public static void update(){
        
    }
    GameCamera(){
        KeyListener keyin = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                    Game.player.move(1,0);
                        break;
                    case KeyEvent.VK_RIGHT:
                        Game.player.move(-1,0);
                        break;
                    case KeyEvent.VK_UP:
                        Game.player.move(0,1);
                        break;
                    case KeyEvent.VK_DOWN:
                        Game.player.move(0,-1);
                        break;                
                    default:
                        break;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        Game.player.move(-1,0);
                        break;
                    case KeyEvent.VK_RIGHT:
                        Game.player.move(1,0);
                        break;
                    case KeyEvent.VK_UP:
                        Game.player.move(0,1);
                        break;
                    case KeyEvent.VK_DOWN:
                        Game.player.move(0,-1);
                        break;                
                    default:
                        break;
                }

                // TODO Auto-generated method stub
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                System.out.println(e.getKeyCode());

                // TODO Auto-generated method stub
            }
            
        };
        this.addKeyListener(keyin);
        moveCam(1, 4);
        setVisible(true);
        setBounds(200, 200, 200, 200);
    
    }
    void moveCam(int x,int y){
        this.x = x;
        this.y = y;
    }
}
