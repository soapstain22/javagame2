import java.awt.Color;
import java.util.Map;

public class GameTile {
    boolean open;
    short temperature = 293; //Boiling point of water is 373.15 K
    byte brightness;
    byte height;
    
    Material material;
    GameTile(Material material){
        this.material = material;
    }
    GameTile(){
        material = Material.dirt;
    }
    Color getColor(){
        return material.color;
    }
}