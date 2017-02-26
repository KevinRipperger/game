
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
    public Planet(String n, String d, int y, int x) {
       super(n,d);
       this.x = x;
       this.y = y;
    }
    
    public void getQuest(int y, int x, Phillip p) {
        if (y==0 && x==1) {
            quest = new Quest("Plutonian Interview","",y,x);
            super.setDescription("The president of Pluto wants to ask you a couple questions before they do you a solid and hook you up with some fuel.");
            quest.getPluto(p);
        }
        if (y==1 && x==0) {
            quest = new Quest(" "," ",y,x);
        }
        if (y==1 && x==1) {
            quest = new Quest(" "," ",y,x);
        }
        if (y==1 && x==2) {
            quest = new Quest(" "," ",y,x);
        }
        if (y==2 && x==1) {
            quest = new Quest("Youranus","",y,x);
            super.setDescription("Very similar size to the one in Earth's Solar System, except this one is one million lightyears away.");
            quest.getYourAnus(p);
        }
        if (y==2 && x==2) {
            quest = new Quest(" "," ",y,x);
        }
    }
    
   
 
}
