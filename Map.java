
/**
 * A map of the whole universe, well... not ALL of it.
 * 
 * @author Kevin Ripperger & Shane Simon
 * 2/21/17
 */
public class Map {
    private Place[][] map;
    private int x=0, y=0;
    public Map(){
        map=new Place[3][3];
        map[0][0]=new Place("Earth","Where Philip's quest begins");
        map[0][0].statusCurrent();
        map[0][1] = new Planet();
        map[0][2] = new Shop();
        map[1][0] = new Planet();
        map[1][1] = new Planet();
        map[1][2] = new Planet();
        map[2][0] = new Shop();
        map[2][1] = new Planet();
        map[2][2] = new Planet("Bleem Town", "Planet of the Belemians");
        map[2][2].setStatus("B");
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void moveUp() {
        map[y][x].statusExplored();
        y--;
        map[y][x].statusCurrent();
    }
    
    public void moveDown() {
        map[y][x].statusExplored();
        y++;
        map[y][x].statusCurrent();
    }
    
    public void moveLeft() {
        map[y][x].statusExplored();
        x--;
        map[y][x].statusCurrent();
    }
    
    public void moveRight() {
        map[y][x].statusExplored();
        x++;
        map[y][x].statusCurrent();
    }
    
    public void printMap() {
        for (Place[] x : this.map){
            for (Place y : x){
                System.out.print("["+y + "] ");
            }
            System.out.print("\n");
        }
        System.out.print("\nS - Shlom\nB - Bleem Town\n? - Unexplored\nX - Explored");
    }
}