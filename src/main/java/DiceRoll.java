import java.util.Random;

public class DiceRoll {

   static int d6max = 6;
   static int d6min = 1;

    public static int d6roll(){
        Random rand = new Random();
        int d6 = (rand.nextInt(d6max - d6min)+1)+d6min;
        return d6;
    }

    static int d20max = 20;
    static int d20min = 0;

    public static int d20roll(){
        Random rand = new Random();
        int d20 = (rand.nextInt(d20max - d20min)+1)+d20min;
        return d20;
    }
}
