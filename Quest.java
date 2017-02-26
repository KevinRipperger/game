
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
        System.out.print("Welcome to Professor Shlom's Space Quest!\n");
        shane.nextLine();
        System.out.println("Here's some back story: ");
        System.out.print("You are "+x.toString());
        shane.nextLine();
        System.out.print("On September 23rd, 2017 you were teaching a young apprentice of yours to code on the beach.");
        shane.nextLine();
        System.out.print("Young, bright, handsome. His name - Vasanth Sadhasivan.");
        shane.nextLine();
        System.out.print("With boba tea in hand, nothing could stop either of you from finishing your java projects.");
        shane.nextLine();
        System.out.print("...");
        shane.nextLine();
        System.out.print("Or so you thought...");
        shane.nextLine();
        System.out.print("Suddenly the sky turned black and Vasanth dropped his boba and began to cry.");
        shane.nextLine();
        System.out.println("A green beam of light shot out of the sky and hit Vasanth. \nHe started floating upwards as if he were being reeled in by the light.");
        shane.nextLine();
        System.out.print("\"HAHAHA I'VE GOT YOU NOW\" boomed a voice from the top of the green beam.");
        shane.nextLine();
        System.out.println("\"Wait guys, that's not Dr. Shlom\" his voice was now hesitant.");
        shane.nextLine();
        System.out.println("\"IAN BLEEM?\" you shouted at the top of your lungs? \"WHAT ARE YOU DOING WITH MY APPRENTICE?\"");
        shane.nextLine();
        System.out.println("You did scream pretty loud, but not loud enough obviously because you were so far away.");
        shane.nextLine();
        System.out.println("\"Eh, whatever. Let's just take this kid.\" Ian said right before the green beam disappeared and the sky turned back to normal.");
        shane.nextLine();
        System.out.print("'God, Ian Bleem is the worst' you thought to yourelf.");
        shane.nextLine();
        System.out.println("\"Better go get my main man back\" you said as you boarded your pirate ship space vehicle.");
        shane.nextLine();
        System.out.println("And now you're all caught up. Have fun!");
        shane.nextLine();
        System.out.print("\f");
        x.getMap().printMap(); 
        System.out.println("Fuel - "+x.getFuel());
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
            System.out.print("\f");
            x.getMap().printMap(); 
            System.out.println("Fuel - "+x.getFuel());
        }

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