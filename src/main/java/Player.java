import java.util.Random;

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
    /*
    Strength = how hard one can throw a tomato.
    Dexterity = how well one can dodge a tomato.
    Constitution = how much it hurts when a tomato hits you.
    Intelligence = whether one knows that a tomato is a fruit.
    Wisdom = knowing whether to put tomato in a fruit salad.
    Charisma = how many others want to throw tomatoes at you.
     */
    public Player(String PlayerName, String PlayerRace, int PlayerHP, int PlayerMP){
        this.PlayerName = PlayerName;
        this.PlayerRace = PlayerRace;
        this.PlayerHP = PlayerHP;
        this.PlayerMP = PlayerMP;
    }

    public void RollAbilities(){
        String Check[]={"STR","DEX","CON","INT","WIS","CHA"};
        System.out.println("Roll to know your ability points");
        for (int i=0;i<6;i++){
            int R1 = DiceRoll.d6roll();
            int R2 = DiceRoll.d6roll();
            int R3 = DiceRoll.d6roll();
            int R4 = DiceRoll.d6roll();
            if(R1<R2 && R1<R3 && R1<R4){
                R1=0;
            }
            if(R2<R1 && R2<R3 && R2<R4){
                R2=0;
            }
            if(R3<R1 && R3<R2 && R3<R4){
                R3=0;
            }
            if(R4<R1 && R4<R2 && R4<R3){
                R4=0;
            }
            int AbilityPoint = R1 + R2 + R3 + R4;
            String Ability = Check[i];
            switch (Ability){
                case "STR":
                    PlayerSTR = AbilityPoint;
                    break;

                case "DEX":
                    PlayerDEX = AbilityPoint;
                    break;

                case "CON":
                    PlayerCON = AbilityPoint;
                    break;

                case "INT":
                    PlayerINT = AbilityPoint;
                    break;

                case "WIS":
                    PlayerWIS = AbilityPoint;
                    break;

                case "CHA":
                    PlayerCHA = AbilityPoint;
                    break;
            }
        }
        System.out.println("STR,DEX,CON,INT,WIS,CHA");
        System.out.println(PlayerSTR+","+PlayerDEX+","+PlayerCON+","+PlayerINT+PlayerWIS+PlayerCHA);
    }

}
