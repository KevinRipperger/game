
/**
 * This is the character that you control
 * 
 * @author Kevin Ripperger & Shane Simon
 * 2/21/17
 */
public class Phillip extends NamedThing {
    private Map map;
    public Phillip() {
        super("Dr. Phillip Shlom", "Professor of Computer Science at UCSD");
        map = new Map();
    }
    
    public Map getMap() {
        return map;
    }
    
    public void move(String x) {
        if (x.equalsIgnoreCase("d") || x.equalsIgnoreCase("down")){
            if (map.getY()!=2)
                map.moveDown();
            else
                System.out.println("That's out of the grid!");
        }
        if (x.equalsIgnoreCase("u") || x.equalsIgnoreCase("up")){
            if (map.getY()!=0)
                map.moveUp();
            else
                System.out.println("Going off the grid is dangerous!");
        }
        if (x.equalsIgnoreCase("l") || x.equalsIgnoreCase("left")){
            if (map.getX()!=0)
                map.moveLeft();
            else
                System.out.println("That's uncharted territory! Do you want to die?");
        }
        if (x.equalsIgnoreCase("r") || x.equalsIgnoreCase("right")){
            if (map.getX()!=2)
                map.moveRight();
            else
                System.out.println("If you go out there, you're as good as dead!");
        }
        if (!x.equalsIgnoreCase("d")&&!x.equalsIgnoreCase("down")&&!x.equalsIgnoreCase("u")&&!x.equalsIgnoreCase("up")&&
        !x.equalsIgnoreCase("l")&&!x.equalsIgnoreCase("left")&&!x.equalsIgnoreCase("r")&&!x.equalsIgnoreCase("right"))
            System.out.println("That's not a direction. Try that again my dude!");
    }
    
    public String getName() {
        return super.getName();
    }
    
    public String getDescription() {
        return super.getDescription();
    }
    
    public String toString() {
        return this.getName()+" - "+this.getDescription();
    }
}