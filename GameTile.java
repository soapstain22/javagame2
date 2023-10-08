import java.util.Map;

public class GameTile {
    boolean open;
    short temperature = 293; //Boiling point of water is 373.15 K

    byte brightness;
    Material material;
    GameTile(int a){
        System.out.println("GameTile.GameTile("+a+")");
        switch (a) {
            case 0:
            this.material = Material.dirt;
                break;
            case 1:
            this.material = Material.stone;
                break;
            case 2:
            this.material = Material.sand;
                break;
                
            default:
                break;
        }
    }

}