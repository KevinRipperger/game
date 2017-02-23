
/**
 * Write a description of class Quest here.
 * 
 * @author Kevin Ripperger & Shane Simon
 * 2/23/17
 */
public class Quest extends NamedThing {
    private Item reward;
    
    public Quest(String n, String d) {
        super(n,d);
    }
    
    public Item complete() {
        return reward;
    }
    
    public String toString() {
        return super.getDescription();
    }
}