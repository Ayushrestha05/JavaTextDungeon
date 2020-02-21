import java.util.Random;
import java.util.Scanner;

public class Player {
    public static String PlayerName;
    public static String PlayerRace;
    public static int PlayerHP;
    public static int PlayerMP;
    boolean PlayerSurprised;
    int PlayerSTR;
    int PlayerDEX;
    int PlayerCON;
    int PlayerINT;
    int PlayerWIS;
    int PlayerCHA;
    int XP;
    /*
    Strength = how hard one can throw a tomato.
    Dexterity = how well one can dodge a tomato.
    Constitution = how much it hurts when a tomato hits you.
    Intelligence = whether one knows that a tomato is a fruit.
    Wisdom = knowing whether to put tomato in a fruit salad.
    Charisma = how many others want to throw tomatoes at you.
     */
    Scanner input = new Scanner(System.in);
    public void CharacterBegin(){
        System.out.println("What is your character's name?");
        PlayerName = input.nextLine();
        System.out.println("Let's choose your race!");
        selectRace();
    }

    //Selection of race
    public void selectRace(){
        System.out.println("Dwarf");
        System.out.println("Elf");
        System.out.println("Halfling");
        System.out.println("Human");
        System.out.println("Dragonborn");
        System.out.println("Gnome");
        System.out.println("Half-Elf");
        System.out.println("Half-Orc");
        System.out.println("Tiefling");
        System.out.println("");
        System.out.println("Which race do you want to be?");
        PlayerRace = input.nextLine();
    }

    //Check of Player LVL
    public void LVLCheck(){
        int playerXP = 0;
        int playerLVL = 1;
        if(playerXP <300){
            playerLVL =1;
        }
        if(playerXP >=300 || playerXP <900){
            playerLVL =2;
            boolean checked = false;
            if(!checked){
                System.out.println("You Have reached LVL 2");
                checked = true;
            }
        }
        if (playerXP >=900 || playerXP <2700){
            playerLVL =3;
            boolean checked = false;
            if(!checked){
                System.out.println("You Have reached LVL 3");
                checked = true;
            }
        }
        if (playerXP >=2700 || playerXP <6500){
            playerLVL =4;
            boolean checked = false;
            if(!checked){
                System.out.println("You Have reached LVL 3");
                checked = true;
            }
        }
        if (playerXP >=6500 || playerXP <14000){
            playerLVL =3;
            boolean checked = false;
            if(!checked){
                System.out.println("You Have reached LVL 4");
                checked = true;
            }
        }
    }
}
