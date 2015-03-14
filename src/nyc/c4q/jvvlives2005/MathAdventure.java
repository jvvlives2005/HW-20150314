package nyc.c4q.jvvlives2005;

/** My Math Game! Finally!
 * Created by c4q-joshelynvivas on 3/13/15.
 */
import java.util.Scanner;

public class MathAdventure {

    private static Scanner in;
    private static int lives;

    public static void main (String[] args) {

        in = new Scanner(System.in);
        lives = 100;

        //Intro to Math Game
        System.out.println("Welcome to Math Academy, the place to learn Math!");
        System.out.println("I'm Cos(z) and will let you know much lives you have left. But first, RULES!");
        System.out.println("Right now you have " + lives + " lives.");
        System.out.println("If you encounter a professor in this academy, you will need to solve their questions.\nIf you get the answer wrong, you will lose 10 lives.");
        System.out.println("To answer their questions, only type the capital letter of the answer (ex: 'A' instead of 'A: 123')");
        System.out.println("Look out for Mr.T; any move you make is critical. One wrong step and he'll hurt ya. He watchin' you!");
        System.out.println("Let's get started and GOOD LUCK!");
        System.out.println(" ");

        //Initial Start
        System.out.println("You are in the academy. Location: Hall Room");
        System.out.println("No Professors in sight, yes! You are just talking to one of your friends about Professor Cone and how he gave a horrible Calc Exam.");
        System.out.println("You have two options to go now, pick which to go next: \nA) Hallway                 B) Cafeteria");
        checkConditions(in.next(), 'A');   //I see this as saying "The answer should be the opposite of this letter. So the answer is B (freebie)

        //Professor Int
        System.out.println("You're in the Cafeteria.");
        System.out.println("Gosh darn it, Professor Int just saw you. He is very excited to teach his upper class which are Integers (His favorite! =])");
        System.out.println("Professor Int: I got a question for ya! A little boy wanted to make a lemonade stand. He sees two pitchers, one large and one small.");
        System.out.println("If two small pitchers and one large pitcher can hold 8 cups of water,");
        System.out.println("and one large pitcher minus one small pitcher equals 2 cups of water,");
        System.out.println("How many cups of water can the large pitcher intake?");
        System.out.println("A) 6                       B) 4");
        checkConditions(in.next(), 'A');

        //What's Next
        System.out.println("Where to go next?");
        System.out.println("A) Hallway                 B) Chemistry Lab");
        checkConditions(in.next(), 'B');

        //Phew!
        System.out.println("You walk into a hallway. Phew! No Professor in sight.");
        System.out.println("You go Boo!");
        System.out.println("Which place to go next? \nA) Classroom 2mod3         B) Classroom 3.14");
        checkConditions(in.next(), 'B');

        //Professor RadoCatz
        System.out.println("Professor RadoCatz sees you!  Location: Classroom 2mod3");
        System.out.println("Professor RadoCatz: Hello, answer this math question:");
        System.out.println("A student multiplied a number by 2, then subtracted the number by 138.");
        System.out.println("His answer was 102. What was his first number?");
        System.out.println("A) 240                     B) 120 ");
        checkConditions(in.next(), 'A');

        //What's Next
        System.out.println("Where to go next?");
        System.out.println("A) Chemistry Lab           B) Hall Room");
        checkConditions(in.next(), 'B');

        //Professor Ruby
        System.out.println("Location Chemistry Lab. Professor Ruby said,");
        System.out.println("Great! You're here, let's calculate chemicals shall we?");
        System.out.println("I have 6 atoms of Carbon, 12 atoms of Hydrogen and 6 atoms of Oxygen. What is the molar mass?");
        System.out.println("Round to the correct number of significant figures");
        System.out.println("Note: \n1) In order to find the molar mass, you must multiply the atomic weight of element 'a' by the number of atoms of that element. \nDo the same with the others and then add the results together.");
        System.out.println("2) The atomic # for Carbon is 12.01 amu, 1.008 amu for Hydrogen and 16.00 amu for Oxygen");
        System.out.println("A) 180.16 amu              B) 181.98 amu");
        checkConditions(in.next(), 'B');

        //What's Next
        System.out.println("Where to go next?");
        System.out.println("A) Bathroom                B) Classroom 3.14");
        checkConditions(in.next(), 'A');

        //Phew! Again!
        System.out.println("Oh Yeah! No Professors in sight. Just walk like a Boss!");
        System.out.println("Where to next? \nA) Cook Lab                B) Janitor's Closet");
        checkConditions(in.next(), 'B');

        //Professor McLovin
        System.out.println("Location: Cook Lab, where you see Professor McLovin cooking something in the oven.");
        System.out.println("Professor McLovin: Oh Hello! I making cookies! And you know I love them cookies! Here's a question:");
        System.out.println("If I know I can make 5 dozen cookies with just 2 cups of sugar, how many cookies can I make with 7 cups of sugar?");
        System.out.println("A) 315 cookies             B) 210 cookies");
        checkConditions(in.next(), 'A');

        //What's Next
        System.out.println("Where to go next?");
        System.out.println("A) Janitor's Closet        B) Playground");
        checkConditions(in.next(), 'A');

        //Phew! Again!
        System.out.println("Oh Yeah! No Professors in sight. Drink some water. Reenergize!");
        System.out.println("Where to next? \nA) Cook Lab                B) Chemistry Lab");
        checkConditions(in.next(), 'B');
    }



    private static void checkConditions(String decision, char incorrect) {
        correctInput(decision);                        //for the wrong answer
        if (decision.charAt(0) == incorrect) {
            wrongAnswer();
        }
        else if (decision.charAt(0) != incorrect) {   //for the right answer
            correctAnswer();

        }
    }

    private static void correctInput(String decision) {
        while (decision.charAt(0) != 'A' && decision.charAt(0) != 'B'){
            System.out.println("Invalid. Enter again: ");
            Scanner two = new Scanner(System.in);
            decision = two.next();
        }
    }

    public static void correctAnswer() {
        lives -= 0;
        System.out.println("Great job. Keep going! \nLive Count:");
        hasDied(lives);
        }

    public static void wrongAnswer() {
        lives -= 10;
        System.out.println("Wrong Answer Fool! Mr. T smacks you across the head. \nLive Count:");
        hasDied(lives);
    }

    public static void hasDied(int lives) {
        if (lives < 1 ) {
            System.out.println("Well I never said that Math was going to be easy...Sorry Kid");
            System.out.println("  .ad8888ba.                                                    .ad8888ba.");
            System.out.println(" d8\"    \"8b                                                    d8\"       8b");
            System.out.println("d8'                                                           d8'         8b");
            System.out.println("88             ,adPPYYba,  88,dPYba,,adPYba,    ,adPPYba,    88           88 8b      d8    ,adPPYba,  8b,dPPYba,");
            System.out.println("88      88888  \"\"     `Y8  88P'  \"88\"     \"8a  a8P_____88    88           88 8b     d8'   a8P_____88  88P A  \"Y8");
            System.out.println("Y8,        88  ,adPPPPP88  88      88      88  8PP\"\"\"\"\"\"\"     Y8,        ,8P   8b   d8'   8PP\"\"\"\"\"\"\"  88");
            System.out.println("Y8a.    .a88  88,    ,88   88      88      88  \"8b,   ,aa      Y8a.    .a8P     8b,d8'    \"8b,   ,aa  88");
            System.out.println(" \"Y88888P\"    \"8bbdP\"Y8 88 88      88      88    `\"Ybbd8\"'       `\"Y8888Y\"'       \"8\"       \"Ybbd8\"   88");
            System.exit(0);
        }
        else {
            System.out.println(" " + lives);
        }
    }
}
