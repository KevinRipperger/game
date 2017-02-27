
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
        map[0][0] = new Planet("Earth","Where Philip's quest begins",0,0);
        map[0][0].statusCurrent();
        map[0][1] = new Planet("Pluto", "Dwarf Planet on the outskirts of Earth's Solar System, so I guess it's not really a Planet.",0,1);
        map[0][2] = new Shop("Fuel R Us", "The one stop shop for all your fuel needs!");
        map[1][0] = new Planet("Arcimula","A remote planet deep within the Astmus Galaxy. It's super cold and stuff.",1,0);
        map[1][1] = new Planet("Barn-Glob","One of two planets found in the Globtobular System. \nNobody goes to the other one because it's made of farts.",1,1);
        map[1][2] = new Planet("Flab 244","The 244th Planet in the Flab System. Someone really got creative with these names.",1,2);
        map[2][0] = new Shop("Fuel Fools","Yo, fool, you need some Fuel? Come on over to Fuel Fools!");
        map[2][1] = new Planet("Youranus","Very similar size to the one in Earth's Solar System, except this one is one million lightyears away.",2,1);
        map[2][2] = new Planet("Bleem Town", "Planet of the Belemians. You know, the dudes that stole Vasanth.",2,2);
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
    
    public Place getPlace() {
        return map[y][x];
    }
    
    public void printMap() {
        
        for (Place[] x : this.map){
            for (Place y : x){
                System.out.print("["+y + "] ");
            }
            System.out.print("\n");
        }
        System.out.println("\nS - Shlom\nB - Bleem Town\n? - Unexplored\nX - Explored\nCurrent position - "+map[getY()][getX()].getName()
                            +" - "+map[getY()][getX()].getDescription());
        
        
    }
}