import java.awt.Polygon;
import java.awt.Shape;

public class HitBox implements Comparable<HitBox> {
    GameObject owner;
    int range;
    
    
    @Override
    public int compareTo(HitBox h) {
        if(owner.distance(h.owner)>range){
            return 1;
        }if(owner.distance(h.owner)<range){
            return -1;
        }
        return 0;
    }
    
    
}
