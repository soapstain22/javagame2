import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Stack;

public class Player extends GameObject implements KeyListener {
    boolean alive = true;
    int hp;
    double speed = 0.02;
    private boolean moving = false;
    KeyListener keyin;
    GameSprite head;
    GameSprite hat;
    GameSprite hair;
    GameSprite shoe;
    GameSprite pant;
    public void spawn(int i, int j) {
        this.setLocation(i, j);
    }

    Player(int x, int y) {
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

    @Override
    public int compare(Point2D o1, Point2D o2) {
        // TODO Auto-generated method stub
        if(this.distance(o1)<this.distance(o2)){
            return 1;
        }
        if(this.distance(o1)==this.distance(o2)){
            return 0;
        }
        if(this.distance(o1)>this.distance(o2)){
            return -1;
        }
        return 0;
    }

    public Image draw() {
        return null;
    }

}