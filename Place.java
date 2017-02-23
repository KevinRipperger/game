
/**
 * These are places such as planets and spaceships that Dr. Shlom can visit
 * 
 * @author Kevin Ripperger & Shane Simon
 * 2/21/17
 */
public class Place extends NamedThing {
    private String status;
    public Place() {
        status = "?";
    }
    
    public Place(String n, String d) {
        super(n, d);
        status = "?";
    }
    
    public void statusExplored() {
        status = "X";
    }
    
    public void statusCurrent() {
        status = "S";
    }
    
    public void setStatus(String x) {
        status = x;
    }
    
    public String toString() {
        return status;
    }
}