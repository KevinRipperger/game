
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
        System.out.println("\f");
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
        System.out.println(recieved());
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

    public void getBarnGlob(Phillip x){
        String response="";
        Scanner shane = new Scanner(System.in);
        System.out.print("You decide to explore the planet of Barn-Glob to look for fuel.");
        shane.nextLine();
        System.out.print("When you land on the planet, all you can smell are farts from the distant planet. Pretty pungent, you think.");
        shane.nextLine();
        System.out.print("You only see a casino in the distance and decide to see if someone has fuel there.");
        shane.nextLine();
        System.out.print("When you arrive at the casino, an alien that looks similar to a horse approaches you with chips in his hand.");
        shane.nextLine();
        System.out.println("\"HAY there NEIGH-bor, wanna play some blackJACK? Why dont you GALLOP on over here and play. Don't STALLion, we are in a hurry!\"");
        shane.nextLine();
        System.out.println("I will give you some FOAL if you are the prize horse!\"");
        shane.nextLine();
        System.out.println("Do you mean fuel?");
        shane.nextLine();
        System.out.println("\"Of course, stop being WHINNY!\"");
        shane.nextLine();
        System.out.println("Apparently these horses only speak in puns, but I do need fuel... you think to yourself");
        shane.nextLine();
        System.out.println("\f");
        System.out.println(recieved());
        /*
         * blackjack code goes here and i can add more dialogue
         * within the code so they always win or whatever
         */
    }

    public void getFlab(Phillip x){
        String response="";
        Scanner shane = new Scanner(System.in);
        System.out.print("The moment you land on the planet you are surrounded by a bunch of identical, overweight looking minions!");
        shane.nextLine();
        System.out.print("\"Hello, I am Minion 20473\" says one of them. \"I am minion 19410, it is nice to meet you\" says another.");
        shane.nextLine();
        System.out.print("You are initially taken aback by the odd creatures, but quickly feel as if they are very welcoming and relatable to your struggle.");
        shane.nextLine();
        System.out.println("You tell them about your story and how the disgusting BLEEM took your apprentice Vasanth.");
        shane.nextLine();
        System.out.println("Minion 38294 then walks up to you and says: \"What an emotional and inspiring story. Why don't you participate in our talent show? It may help take your mind off things\"");
        shane.nextLine();
        System.out.println("\"Sounds chill, I think.\"");
        shane.nextLine();
        System.out.println("\f");
        System.out.println(recieved());
        shane.nextLine();
        System.out.println("\"So, what is your talent??\"");
        response = shane.nextLine();
        System.out.println("\"Wow! " + response + " is pretty cool! I think you have a good shot at winning!\"");
        shane.nextLine();
        System.out.println("\"The other contestant is Minion 5933 who is a stand up comic.\"");
        shane.nextLine();
        System.out.println("\"Lets start!\"");
        shane.nextLine();
        System.out.println("\"First up is Minion 5933!!! Give it up for 5933!\"");
        shane.nextLine();
        System.out.println("All the minions clap for Minion 5933.");
        shane.nextLine();
        System.out.println("Minion 5933: \"How does a train eat???\"");
        shane.nextLine();
        System.out.println("The crowd is silent and a cricket chirps.");
        shane.nextLine();
        System.out.println("\"It goes chew chew!!!\"");
        shane.nextLine();
        System.out.println("No one laughs and the crowd throws tomatoes at Minion 5933 and boos at him. You laugh at how dumb the joke was but hide your laughter.");
        shane.nextLine();
        System.out.println("\"Well, now that that horrendous act is over, lets see how Shlom here will do!\"");
        shane.nextLine();
        System.out.println("\"Give it up for Phillip Shlom, with his act of " + response + "!!!!\"");
        shane.nextLine();
        System.out.println("You are very nervous considering how the minions reacted to Minion 5933's performance. However, this is your time to shine and get some fuel!(Type in your performance):");
        shane.nextLine();
        System.out.println("The audience sits in silence for a second...");
        shane.nextLine();
        System.out.println("But then they burst out in applause and yells of joy!");
        shane.nextLine();
        System.out.println("Minion 20473 approaches you and congratulates you for your success in the talent show!");
        shane.nextLine();
        System.out.println("\"Here is some fuel for you to find your friend Vasanth!\"");
        shane.nextLine();
        complete(x,reward);
        System.out.print("\f");
        x.getMap().printMap(); 
        System.out.println("Fuel - "+x.getFuel());
    }

    public void getArcimula(Phillip x){
        String response="";
        Scanner shane = new Scanner(System.in);
        System.out.print("You fly to the really cold planet of Arcimula and land you ship on what seems to be a frozen lake.");
        shane.nextLine();
        System.out.print("It is freezing! This is nothing like the weather at UCSD!!!");
        shane.nextLine();
        System.out.print("You are tempted to get gas just to go back to the warmth of La Jolla and abandon Vasanth but you know that that isn't right.");
        shane.nextLine();
        System.out.print("While lost in your thoughts, a mysterious looking penguin approaches you--scaring you half to death.");
        shane.nextLine();
        System.out.print("\"Hello Phillip. I am the Penguin Riddler, the only inhabitant of the planet of Arcimula.\"");
        shane.nextLine();
        System.out.print("\"Oh hi there.\" you say fearfully. You notice that he is holding onto a fuel canister very tightly. He doesn't seem to want to give it up.");
        shane.nextLine();
        System.out.print("\"Stop eyeballing my fuel you freak. If you want to get some of this fuel, you will need to answer my riddles!\"");
        shane.nextLine();
        System.out.println("\"Do you accept my challenge? If you do not pass the riddles, you will DIE!\"");
        response = shane.nextLine();
        if(response.equalsIgnoreCase("no")){
            System.out.println("\"Well too bad. You are trapped on this planet anyways so you kinda have to do this.");
            shane.nextLine();
        }
        System.out.print("\"Great let us begin!\"");
        shane.nextLine();
         System.out.println("\f");
        System.out.println(recieved());
        shane.nextLine();
        String res = "";
        System.out.print("\"Your first riddle is: What loses its head in the morning, but gets it back at night?\"");
        res = shane.nextLine();
        while(!res.equalsIgnoreCase("pillow") || !res.equalsIgnoreCase("a pillow")){
            System.out.println("Incorrect!!! What do you put your head on at night you fool???");
            res = shane.nextLine();
            shane.nextLine();
        }
        System.out.print("\"Correct! Maybe you aren't that foolish!\"");
        shane.nextLine();
        System.out.print("\"The next riddle is: What two things can you never eat for breakfast?\"");
        res = shane.nextLine();
        while(!res.equalsIgnoreCase("lunch and dinner") || !res.equalsIgnoreCase("dinner and lunch")){
            System.out.println("Incorrect!!! What are the other two meals you fool???");
            res = shane.nextLine();
            shane.nextLine();
        }
        System.out.print("\"Correct! Hmmmm... you are pretty good at this! I will give you one more.\"");
        shane.nextLine();
        System.out.print("\"The last riddle is: What is brown and sticky?\"");
        res = shane.nextLine();
        while(!res.equalsIgnoreCase("stick") || !res.equalsIgnoreCase("a stick")){
            System.out.println("Incorrect!!! The answer is literally in the question are you ok??");
            res = shane.nextLine();
            shane.nextLine();
        }
        System.out.print("\"Correct!!!! You win!\"");
        shane.nextLine();
        System.out.print("\'Wow you actually won. I was hoping I was gonna be able to kill someone today... guess not.\"");
        shane.nextLine();
        System.out.print("\"Here is your reward!\"");
        shane.nextLine();
        complete(x,reward);
        System.out.print("\f");
        x.getMap().printMap(); 
        System.out.println("Fuel - "+x.getFuel());
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