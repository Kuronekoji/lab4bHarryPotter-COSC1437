/**
 * This is lab 4b the Harry Potter game with randomization
 * @author Scylla
 * @date 9/18/2022
 * Section 1437.200
 */

import java.util.Random;
import java.util.Scanner;

public class lab4b
{
    static Random rand = new Random(); // Truly random spell choice

    public static void main(String[] args)
    {
        final String doorSpell = "Alohomora";
        final String freezeSpell = "Immobulus";
        final String flySpell = "Wingardium Leviosa";

        int spellCount = 6;
        String chosenSpell;
        Scanner kbd = new Scanner(System.in);

        System.out.println("You are out past curfew and you hear Filch approaching.\n" +
        "It sounds like he is about " + spellCount + " minutes away from finding you.\n" +
        "You need to get back to the common room before he catches you!\n" +
        "You run down the hall, turn right, and then suddenly stop.");

        while (spellCount > 0)
        {
            System.out.println("There is a locked door ahead of you. You pull out your wand and " +
            "yell...(press Enter)");
            kbd.nextLine();

            chosenSpell = chooseSpell(doorSpell, freezeSpell, flySpell);
            System.out.println(chosenSpell);

            
            if (chosenSpell == freezeSpell)
            {
                spellCount--;
                System.out.println("Great idea! Now the door is immobile! Oh wait... " +
                "Oh no! You can hear Filch getting closer!\n" +
                "It sounds like he is " + spellCount + " minutes away!");
                continue;
            }
            else if (chosenSpell == flySpell)
            {
                spellCount--;
                System.out.println("Great idea! Now the door is flying in place. Oh wait... " +
                "Oh no! You can hear Filch getting closer!\n" +
                "It sounds like he is " + spellCount + " minutes away!");
                continue;
            }
            else if (chosenSpell == doorSpell)
            {
                System.out.println("Well done! The door creaks open and you run through.\n");
                System.out.println("That was close! You sprint down the hallway toward your common room.\n" +
                "As you near the potions classroom, you hear a loud crash.");
    
                System.out.println("A cloud of billiwigs erupts from the room. Their jar must have fallen " +
                "off of the desk.\n" +
                "Sigh. You don't need this right now...you can't get stung!");
        
                break;
            }
        } // while 1

        while (spellCount > 0)
        {
            System.out.println("You stare at the mass amount of billiwigs. You pull out your wand and " +
            "yell...(press Enter)");
            kbd.nextLine();

            chosenSpell = chooseSpell(doorSpell, freezeSpell, flySpell);
            System.out.println(chosenSpell);

            if (chosenSpell == doorSpell)
            {
                spellCount--;
                System.out.println("You opened the flying creatures bodies in a very disturbing way.\n" +
                "I don't think you were supposed to do that.\n" +
                "Oh no! Filch is " + spellCount + " minutes away.\n");
                continue;
            }
            else if (chosenSpell == flySpell)
            {
                spellCount--;
                System.out.println("Why are you making flying creatures fly?\n" +
                "Oh no! You can hear Filch getting closer!\n" +
                "It sounds like he is " + spellCount + " minutes away!");

                continue;
            }
            else if (chosenSpell == freezeSpell)
            {
                System.out.println("Nice work! The pesky creatures are all frozen mid wing-flap.\n" +
                "You weave your way through the bugs and continue toward your common " +
                "room.\n");

                System.out.println("You're almost there! The common room is right up the next stairwell.\n" +
                "You race to the bottom of the stairs and come face to face with a " +
                "massive pumpkin pasty blocking the stairs.\n" +
                "Looks like the Weasley twins have been trying out new pranks.\n");
        
                break;
            }
        } // while 2

        while (spellCount > 0)
        {
            System.out.println("You have to lift this huge pasty out of the way. You pull out your " +
            "wand and yell...(press Enter)");
            kbd.nextLine();

            chosenSpell = chooseSpell(doorSpell, freezeSpell, flySpell);
            System.out.println(chosenSpell);

            
            if (chosenSpell == doorSpell)
            {
                spellCount--;
                System.out.println("You want to open a pumpkin pasty? That sounds messy.\n" +
                "Oh no! You can hear Filch getting closer!\n" +
                "It sounds like he is " + spellCount + " minutes away!\n");
                continue;
            }
            else if (chosenSpell == freezeSpell)
            {
                spellCount--;
                System.out.println("Good thinking! Now it doesn't move! Oh... \n" +
                "Oh no! You can hear filch getting closer!\n" +
                "It sounds like he is " + spellCount + " minutes away!\n");
                continue;

            }
            else if (chosenSpell == flySpell)
            {
                System.out.println("The pasty floats up high enough for you to duck underneath.\n" +
                "You take a quick bite as you go under. Delicious!\n");

                System.out.println("You reach the door of your common room and slip safely inside.\n" +
                "Filch is no match for a student of your ability!\n" +
                "You head to bed and for some reason dream of a chocolate frog the size " +
                "of a house.");
                break;
            }
        }// while 3

        if (spellCount > 0)
        {
            System.out.println("You succeeded with " + spellCount + " spells remaining!");
        } else {
            System.out.println("Filch grabs you by your collar. Aha! Out after curfew I " +
            "see...detention for you!\n" +
            "Filch marches you to the headmaster's office while muttering about his " +
            "great ideas for your detention.");

            System.out.println("Game over.");
        }
        kbd.close();
    }

    /*
     * chooseSpell method takes the three final spell strings
     * takes a random number and uses that in the switch to
     * randomly pick a spell.
     */
    public static String chooseSpell(String doorSpell, String freezeSpell, String flySpell)
    {
        String retVal = "";

        int num = rand.nextInt(3);

        switch (num)
        {
            case 0:
                retVal = doorSpell;
                break;

            case 1:
                retVal = freezeSpell;
                break;

            case 2:
                retVal = flySpell;
                break;

            default:
                break;
          }

        return retVal;
    }
}
