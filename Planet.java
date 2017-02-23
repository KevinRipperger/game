
/**
 * A Place where you have to complete a task
 * 
 * @author Kevin Ripperger & Shane Simon
 * 2/23/17
 */
public class Planet extends Place
{
    private Quest quest;
    private int x;
    private int y;
    public Planet(String n, String d, int x, int y) {
       super(n,d);
       this.x = x;
       this.y = y;
       getQuest(x,y);
    }
    
    public void getQuest(int x, int y) {
        quest = new Quest();
    }
}
