
/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item extends NamedThing {
    private int value;
    
    public Item(String n, String d, int v) {
        super(n,d);
        value=v;
    }
    
    public String toString() {
        return super.getName()+" "+super.getDescription();
    }
}