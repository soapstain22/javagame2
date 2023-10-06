import java.util.Map;

public class GameTile {
    boolean open;
    byte temperature;
    Material material;
    GameTile(int a){
        System.out.println("GameTile.GameTile("+a+")");
        switch (a) {
            case 0:
            this.material = Material.dirt;
                break;
            case 1:
            this.material = Material.sand;
                break;
            default:
                break;
        }
        this.material = Material.dirt;
    }

}