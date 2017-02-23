import java.util.Scanner;
public class MapTest
{
    public static void main(String[] args) {
        System.out.print("\f");
        Phillip phil = new Phillip();
        Scanner shane = new Scanner(System.in);
        String input="";
        while (!input.equals("q")){
           phil.getMap().printMap(); 
           System.out.println("\n\nWhich direction should we go?");
           phil.move(shane.next());
           
        }
            
    }
}
