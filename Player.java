import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

public class Player extends GameObject implements KeyListener {
    boolean alive = true;
    int hp;
    KeyListener keyin;

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

    public int push(double x, double y) {
        this.x += x;
        this.y += y;
        this.setLocation(this.x + x, this.y + y);

        if (x + y < 0.1) {
            return 0;

        }
        return push(x / 2, y / 2);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                xinertia -= 1;
                System.out.println("lef");
                break;
            case KeyEvent.VK_RIGHT:
                xinertia += 1;
                System.out.println("rig");
                break;
            case KeyEvent.VK_UP:
                yinertia += 1;
                System.out.println("up");
                break;
            case KeyEvent.VK_DOWN:
                yinertia -= 1;
                System.out.println("dow");
                break;
            default:
                break;
        }

        // TODO Auto-generated method stub
    }

    @Override
    public void keyReleased(KeyEvent e) {
        xinertia = 0;
        yinertia = 0;
        // TODO Auto-generated method stub
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
}