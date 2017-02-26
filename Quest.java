
/**
 * Write a description of class Quest here.
 * 
 * @author Kevin Ripperger & Shane Simon
 * 2/23/17
 */
import java.util.Scanner;
public class Quest extends NamedThing {
    private int reward;
    private int x;
    private int y;
    public Quest(String n, String d, int y, int x) {
        super(n,d);
        this.y = y;
        this.x = x;
    }
    
    public void getEarth(Phillip x) {
        String response="";
        Scanner shane = new Scanner(System.in);
        System.out.print("Welcome to Dr. Shlom's Space Quest!");
        shane.nextLine();
     
    }
    
    public void getPluto(Phillip x) {
        String response="";
        Scanner shane = new Scanner(System.in);
        System.out.print("You land on Pluto's rocky, dim-lit surface. Initially you think 'How am I ever going to find fuel here?'");
        shane.nextLine();
        System.out.print("You get off of your space ship and begin to walk away slowly searching for any signs of life."); 
        shane.nextLine();
        System.out.print("You make it about 10 feet before you realize that you can already see over Pluto's horizon and notice you are about half a mile from a Plutonian city.");
        shane.nextLine();
        System.out.print("As you make your way towards the city, you can see a crowd of beings, Plutionians you presume, eagerly awaiting your arrival.");
        shane.nextLine();
        System.out.println("The streets are lined with alien lifeforms, and you walk down the middle of the street towards a Plutionian wearing a crown and seated on a large throne.");
        shane.nextLine();
        System.out.println("King - \"Hello Earthly visitor, I am Jim, the King of Pluto. It's been so long since we've had a vistor! Why have you come to Pluto?\"");
        shane.nextLine();
        System.out.println("Dr. Shlom - \"Well, I just ran out of fuel for my space ship. Is there any way I could get some or buy some?\"");
        shane.nextLine();
        System.out.println("King - \"Oh of course! Here on Pluto we have PLENTY of fuel for space travel! I will give you some, but I want to interview you first. As you can see, the people"+ 
            " of Pluto are very excited to see you!\"");
        shane.nextLine();
        System.out.println(recieved());
        System.out.println("Dr. Shlom - \"Sounds chill.\"");
        shane.nextLine();
        System.out.print("The King leads you to a studio behind his throne. There is a crew with cameras and microphones set up pointing at two chairs."); 
        shane.nextLine();
        System.out.println("As you take a seat you reach out to shake Jim's hand, a gesture he is obviously unfamiliar with.");
        shane.nextLine();
        System.out.println("Dr. Shlom - \"My name is Phillip Shlom, by the way.\"");
        shane.nextLine();
        System.out.println("King - \"Ah, yes. Very nice Mr. Shlom.\"\n\nThe King is distracted by the person putting makeup on his face.");
        shane.nextLine();
        System.out.println("King - \"Alright, we're all set. Get the cameras rolling.\"");
        shane.nextLine();
        System.out.println("Before you know it, a camera man is shouting '3, 2, 1, ACTION' like you're about to film a scene in a movie.");
        shane.nextLine();
        System.out.println("King - \"So, Mr. Shlom is it? How has your day been?\"");
        System.out.print("\nDr. Shlom - ");
        response=shane.nextLine();
        System.out.println("\nKing - \"'"+response+"', huh? Glad to hear it. Listen, I've been meaning to ask, what are you here for? Just curious.\"");
        System.out.print("\nDr. Shlom - ");
        response=shane.nextLine();
        System.out.println("\nKing - \"Oh wow very interesting! I can't wait to hear how that turns out!Hey, is Pluto a planet?\" (yes/no)");
        System.out.print("\nDr. Shlom - ");
        response=shane.next(); 
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("King - \"Very good! Thank you so much for coming Mr. Shlom, it was a pleasure!\"");
            shane.nextLine();
            System.out.println("Cameraman - \"That's a take!\"");
            shane.nextLine();
            System.out.print("You watch the king walk off the set completely disregarding you.");
            shane.nextLine();
            System.out.println("One of the set directors walks up to you and hands you some fuel and a bag of coins marked 'Drongles'");
            shane.nextLine();
            System.out.println("Director - \"Alright, you're done. You can leave now.\"");
            shane.nextLine();
            System.out.print("'Well that sure was odd' you think to yourself as you walk back toward your ship.");
            shane.nextLine();
            System.out.print("The street is no longer lined with Plutonians and it seems like everyone has gone back to their homes.");
            shane.nextLine();
            System.out.print("'At least i got the fuel' you think as you board your ship.");
            complete(x,reward);
        }
        else {
            while (!response.equalsIgnoreCase("yes")) {
                System.out.println("\nKing - \"Damn it, you ruined the take! Ah we'll just edit it out. You don't get to leave until you say Pluto is a planet. Here, I'll ask you again.\n\tIs Pluto a planet?\" (yes/no)");
                System.out.print("\nDr. Shlom - ");
                response=shane.next(); 
            }
            System.out.println("King - \"Very good! Thank you so much for coming Mr. Shlom, it was a pleasure!\"");
            shane.nextLine();
            System.out.println("Cameraman - \"That's a take!\"");
            shane.nextLine();
            System.out.print("You watch the king walk off the set completely disregarding you.");
            shane.nextLine();
            System.out.println("One of the set directors walks up to you and hands you some fuel and a bag of coins marked 'Drongles'");
            reward = 20;
            shane.nextLine();
            System.out.println("Director - \"Alright, you're done. You can leave now.\"");
            shane.nextLine();
            System.out.print("'Well that sure was odd' you think to yourself as you walk back toward your ship.");
            shane.nextLine();
            System.out.print("The street is no longer lined with Plutonians and it seems like everyone has gone back to their homes.");
            shane.nextLine();
            System.out.print("'At least i got the fuel' you think as you board your ship.");
            complete(x,reward);
        }
    }
    
    public void getYourAnus(Phillip x) {
        String response="";
        Scanner shane = new Scanner(System.in);
        System.out.print("You land on a planet, barren and desolate, its youranus");
        shane.nextLine();
        System.out.println("Walking out of the poopdeck, you see Shane Simon!"); 
        shane.nextLine();
        System.out.println("The king of Youranus itself!, dancing and smiling as he has not seen you in millenia");
        shane.nextLine();
        System.out.println("King - \"Hello Earthly visitor, its me, Shane, the King of Youranus. It's been so long since I have seen you! Have you come to play... Simon Says?\"");
        shane.nextLine();
        System.out.println("Dr. Shlom - \"Ah, it has been a while Shane, and I am afraid that my fuel is running low. Mind if I haggle my way for some fuel?\"");
        shane.nextLine();
        System.out.println("King - \"Oh of course! But you have to beat me in a game of... Simon says!\"");
        shane.nextLine();
        System.out.println("Dr. Shlom - \"God Damnit\"");
        shane.nextLine();
        System.out.println("\f");
        System.out.println("   _____ _                          _____                 ");
        System.out.println("  / ____(_)                        / ____|                ");
        System.out.println(" | (___  _ _ __ ___   ___  _ __   | (___   __ _ _   _ ___ ");
        System.out.println("  \\___ \\| | '_ ` _ \\ / _ \\| '_ \\   \\___ \\ / _` | | | / __|");
        System.out.println("  ____) | | | | | | | (_) | | | |  ____) | (_| | |_| \\__ \\");
        System.out.println(" |_____/|_|_| |_| |_|\\___/|_| |_| |_____/ \\__,_|\\__, |___/");
        System.out.println("                                                 __/ |    ");
        System.out.println("                                                |___/     ");
        System.out.println("King - \"Welcome to Siimonnn Sayssss..\"");
        shane.nextLine();
        System.out.println("Dr. Shlom - \"Oh God\"");
        shane.nextLine();
        System.out.println("King - \"Round One- Simon says jump\""); 
        response = shane.nextLine();
        if(!response.equals("jump")){
            System.out.println("King - \"No, Simon says jump\""); 
            response = shane.nextLine();
        }
        System.out.println("King - \"Round Two- Simon says sit\"");
        if(!response.equals("sit")){
            System.out.println("King - \"No, Simon says sit\"");
            response = shane.nextLine();
        }
        System.out.println("Shane is speechless; he seems to be in shock by your talent and skill in Simon says.");
        shane.nextLine();
        System.out.println("King - \"I am, I dont understand I... nobody has gotten this fa...\"");
        shane.nextLine();
        System.out.println("Dr. Shlom - \"A deal is a deal, now hand my fuel\"");
        shane.nextLine();
        System.out.println("King - \"Alright, I, I just do not understand. I JUST DO NOT UNDERST...\"");
        shane.nextLine();
        System.out.println("The king hands over the fuel, and you make your way back to the ship; You hear him muttering curses.");
        x.addFuel();
    }
    
    public String recieved() {
        String info;
        info = "\n********** QUEST RECIEVED **********\n";
        info +=("\t"+super.getName()+"\n");
        info +=(super.getDescription()+"\n");
        info +="************************************\n";
        return info;
    }

    public void complete(Phillip x, int rew) {
        x.addFuel();
        x.addDrongles(rew);
    }

    public String toString() {
        return super.getName()+" - "+super.getDescription();
    }
}