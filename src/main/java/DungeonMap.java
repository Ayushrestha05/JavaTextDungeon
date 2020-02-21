import java.util.Scanner;

public class DungeonMap {
    Scanner input = new Scanner(System.in);
    //First Scene
    public void DungeonStart(){
        System.out.println("You've been on the Triboar Trail for about half a day. As you come around a bend, you " +
                "spot two dead horses sprawled about fifty feet ahead of you, blocking the path. Each has several " +
                "black-feathered arrows sticking out of it. The woods press close to the trail here, with a steep embankment and dense thickets on either side.");
        System.out.println("");
        System.out.println("What do you do?");
        System.out.println("-----------------");
        System.out.println("1. Inspect");
        String Action = input.nextLine();
        Action = Action.toLowerCase();
        switch (Action){
            case "inspect":
                System.out.println("The Saddlebags have been looted. Nearby lies an empty leather map case.");
                System.out.println("After inspecting, you move forward");
                break;

            default:
                System.out.println("Incorrect Keyword");
                System.out.println("You move forward");
                break;
        }
        System.out.println("");


    }
}
