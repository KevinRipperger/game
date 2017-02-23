
/**
 * Anything with a name and description
 * 
 * @author Kevin Ripperger & Shane Simon 
 * 2/21/17
 */
public abstract class NamedThing {
    private String name;
    private String description;
    
    public NamedThing() {
        name = "";
        description = "";
    }
    
    public NamedThing(String n, String d) {
        name = n;
        description = d;
    }
    
    public void setName(String x) {
        name = x;
    }
    
    public  String getName() {
        return name;
    }
    
    public void setDescription(String x) {
        description = x;
    }
    
    public String getDescription() {
        return description;
    }
    
    public abstract String toString();
}