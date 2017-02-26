
/**
 * This is the character that you control
 * 
 * @author Kevin Ripperger & Shane Simon
 * 2/21/17
 */
public class Phillip extends NamedThing {
    private Map map;
    private int drongles=0;
    private int fuel=1;
    public Phillip() {
        super("Dr. Phillip Shlom", "Professor of Computer Science at UCSD");
        map = new Map();
    }

    public Map getMap() {
        return map;
    }
    
    public void addDrongles(int x) {
        drongles+=x;
    }
    
    public void useDrongles(int x) {
        drongles-=x;
    }
    
    public void useFuel() {
        fuel-=1;
    }

    public void addFuel() {
        fuel+=1;
    }
    
    public int getFuel() {
        return fuel;
    }

    public void move(String x) {
        if (fuel==0) {
            System.out.println("We're out of fuel!");
        }
        else {
            if (x.equalsIgnoreCase("d") || x.equalsIgnoreCase("down")){
                if (map.getY()!=2){
                    map.moveDown();
                    useFuel();
                    System.out.print("\f");
                    map.printMap();
                    System.out.println("Fuel - "+getFuel());
                }
                else
                    System.out.println("That's out of the grid!");
            }
            if (x.equalsIgnoreCase("u") || x.equalsIgnoreCase("up")){
                if (map.getY()!=0){
                    map.moveUp();
                    useFuel();
                    System.out.print("\f");
                    map.printMap();
                    System.out.println("Fuel - "+getFuel());
                }
                else
                    System.out.println("Going off the grid is dangerous!");
            }
            if (x.equalsIgnoreCase("l") || x.equalsIgnoreCase("left")){
                if (map.getX()!=0) {
                    map.moveLeft();
                    useFuel();
                    System.out.print("\f");
                    map.printMap();
                    System.out.println("Fuel - "+getFuel());
                }
                else
                    System.out.println("That's uncharted territory! Do you want to die?");
            }
            if (x.equalsIgnoreCase("r") || x.equalsIgnoreCase("right")){
                if (map.getX()!=2) {
                    map.moveRight();
                    useFuel();
                    System.out.print("\f");
                    map.printMap();
                    System.out.println("Fuel - "+getFuel());
                }
                else
                    System.out.println("If you go out there, you're as good as dead!");
            }
            if (!x.equalsIgnoreCase("d")&&!x.equalsIgnoreCase("down")&&!x.equalsIgnoreCase("u")&&!x.equalsIgnoreCase("up")&&
            !x.equalsIgnoreCase("l")&&!x.equalsIgnoreCase("left")&&!x.equalsIgnoreCase("r")&&!x.equalsIgnoreCase("right"))
                System.out.println("That's not a direction. Try that again my dude!");
        }
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