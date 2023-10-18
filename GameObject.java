import java.awt.Image;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Comparator;

public abstract class GameObject extends Point2D implements Comparator<Point2D>{
    double x;
    double y;
    double xinertia;
    double yinertia;
    public int direction;
    final long uuid;
    static long validKeys = 0;
    private GameSprite gameSprite;
    void place(int x, int y){
        System.out.println("GameObject.place()");
        this.setLocation(x, y);
        Game.gameMap.addObject(this);
    }
    @Override
    public double getX() {
        return this.x;
    }
    @Override
    public double getY() {
        return this.y;
    }
    @Override
    public void setLocation(double x, double y) {
        // TODO Auto-generated method stub
        this.x = x;
        this.y = y;
        //GameMap.map[(int) x][(int) y];
    }
    void move(int ax,int ay){
        
        this.x += ax;
        this.y += ay;
    }
    public void push(int ax, int ay){
        xinertia += ax;
        yinertia += ay;
    }
    public void push(int ax, int ay, boolean face){
        xinertia += ax;
        yinertia += ay;
        direction = Direction.toInt(ax,ay);
        
    }
    synchronized void update(){
         // dangerous
        x += xinertia;
        y += yinertia;
    }
    GameObject(){
        uuid = validKeys;
        validKeys +=1; 
        //GameCache.track(this);
        try {
            gameSprite = new GameSprite("/Users/maxzed/Documents/GitHub/javagame2/Resources/PANTS.PNG");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    
}
