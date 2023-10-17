public abstract class Direction {
    public final static int NORTH = 0;
    public final static int NORTHEAST = 1;
    public final static int EAST = 2;
    public final static int SOUTHEAST = 3;
    public final static int SOUTH = 4;
    public final static int SOUTHWEST = 5;
    public final static int WEST = 6;
    public final static int NORTHWEST = 7;
    public final static int CENTER = 8;

    public final static int[][] matrix={
        {1,0,7}, //sorry its unreadable, its to make the sprites easier to index for directions
        {2,8,6},
        {3,4,5}
    };
    static int toInt(int x, int y){
        return matrix[x][y];
    }
}