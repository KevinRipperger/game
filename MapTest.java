import java.util.Scanner;
public class MapTest
{
    public static void main(String[] args) {
        System.out.print("\f");
        Phillip phil = new Phillip();
        Scanner shane = new Scanner(System.in);
        String input="";
        Map map = phil.getMap();
        map.printMap(); 
        System.out.println("Fuel - "+phil.getFuel());
        while (!input.equals("q")){
            System.out.println("\n\nWhat should I do? (Move/Explore)");
            input=shane.next();
            if (input.equalsIgnoreCase("move")) {
                System.out.println("Which direction should I go?");
                phil.move(shane.next());
                 
            }
            else if (input.equalsIgnoreCase("explore")) {
                System.out.println("Let's do it!\n");
                ((Planet)map.getPlace()).getQuest(map.getY(),map.getX(),phil);
            }
            else {
                System.out.println("I can't do that. Am I crazy?");
                System.out.println("\n\nWhat should I do? (Move/Explore)");
                input=shane.next();
            }

        }
    }
}
