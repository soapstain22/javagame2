import java.awt.Image;
import java.awt.List;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class GameCache {
    int step = 0;
    static ArrayList<GameObject> drawing = (ArrayList<GameObject>) Collections.synchronizedList(new LinkedList<GameObject>());
    static BufferedImage noise(int thingy){
        java.util.Random r = new java.util.Random();
        BufferedImage i = GameCache.noise(4);
        for (int j = 0; j < 256; j++) {
            for (int j2 = 0; j2 < 256; j2++) {
                i.setRGB(j, j2, (int) (r.nextGaussian()*2));
            }
        }
        return i;
    }
    GameCache(){
        
    }
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }

}
