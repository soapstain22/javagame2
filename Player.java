import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Stack;

public class Player extends GameObject implements KeyListener {
    boolean alive = true;
    int hp;
    double speed = 0.02;
    private boolean moving = false;
    KeyListener keyin;
    GameSprite sprite;
    public void spawn(int i, int j) {
        this.setLocation(i, j);
    }

    Player(int x, int y) {
        super();
        
        this.setLocation(x, y);
    }

    public void move(int x, int y) {
        System.out.println("Player.move()");
        this.setLocation(this.x + x, this.y + y);
        Game.gameCamera.repaint(1);

    }
    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                xinertia = -speed;
                System.out.println("lef");
                break;
            case KeyEvent.VK_RIGHT:
                xinertia = speed;
                System.out.println("rig");
                break;  
            case KeyEvent.VK_UP:
                yinertia = -speed;
                System.out.println("up");
                break;
            case KeyEvent.VK_DOWN:
                yinertia = speed;
                System.out.println("dow");
                break;
            default:
                break;
        }

        // TODO Auto-generated method stub
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                xinertia = 0;
                System.out.println("lef");
                break;
            case KeyEvent.VK_RIGHT:
                xinertia = 0;
                System.out.println("rig");
                break;  
            case KeyEvent.VK_UP:
                yinertia = 0;
                System.out.println("up");
                break;
            case KeyEvent.VK_DOWN:
                yinertia = 0;
                System.out.println("dow");
                break;
            default:
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

}