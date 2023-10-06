import java.awt.geom.Point2D;
import java.util.UUID;

public abstract class GameObject extends Point2D{
    double x;
    double y;   
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
}
