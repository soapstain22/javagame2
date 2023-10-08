import java.awt.geom.Point2D;
import java.util.UUID;

public abstract class GameObject extends Point2D{
    double x;
    double y;
    double xinertia;
    double yinertia;
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
    }
    void move(int ax,int ay){
        this.x += ax;
        this.y += ay;
    }
    public void push(int ax, int ay){
        xinertia += ax;
        yinertia += ay;
    }
    void update(){
        yinertia = yinertia/2;
        xinertia = xinertia/2;
        x += xinertia;
        y += yinertia;
    }
}
