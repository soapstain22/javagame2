
public class Player extends GameObject{
    public static Player[] players;
    boolean alive = true;
    int hp;

    public void spawn(int i, int j) {
        this.setLocation(i, j);
    }
    Player(int x, int y){
        super();
    }
    public void move(int x, int y) {
        System.out.println("Player.move()");
        this.setLocation(this.x+x, this.y+y);
        Game.gc.x += x;
        Game.gc.y += y; 
        Game.gc.repaint(1);

    }


}
