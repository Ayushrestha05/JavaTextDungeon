public class CharcterAttribute {
    //Initializing variables for Ability Points
    int AbSTRp;
    int AbDEXp = 0;
    int AbCONp = 0;
    int AbINTp = 0;
    int AbWISp = 0;
    int AbCHAp = 0;
    //Creating an object to access variables and methods from Player class
    Player p = new Player();

    //Creating a random roll for knowing Attribute points
    public void RollAttribute() {
        String[] Check = {"STR", "DEX", "CON", "INT", "WIS", "CHA"};
        System.out.println("Roll to know your ability points");
        for (int i = 0; i < 6; i++) {
            int R1 = DiceRoll.d6roll();
            int R2 = DiceRoll.d6roll();
            int R3 = DiceRoll.d6roll();
            int R4 = DiceRoll.d6roll();
            if (R1 < R2 && R1 < R3 && R1 < R4) {
                R1 = 0;
            }
            if (R2 < R1 && R2 < R3 && R2 < R4) {
                R2 = 0;
            }
            if (R3 < R1 && R3 < R2 && R3 < R4) {
                R3 = 0;
            }
            if (R4 < R1 && R4 < R2 && R4 < R3) {
                R4 = 0;
            }
            int AbilityPoint = R1 + R2 + R3 + R4;
            String Ability = Check[i];
            switch (Ability) {
                case "STR":
                    p.PlayerSTR = AbilityPoint;
                    break;

                case "DEX":
                    p.PlayerDEX = AbilityPoint;
                    break;

                case "CON":
                    p.PlayerCON = AbilityPoint;
                    break;

                case "INT":
                    p.PlayerINT = AbilityPoint;
                    break;

                case "WIS":
                    p.PlayerWIS = AbilityPoint;
                    break;

                case "CHA":
                    p.PlayerCHA = AbilityPoint;
                    break;
            }
        }


    }

    public void AbilityScore() {
        Player p = new Player();
        //initializing Ability Points for each player attribute

        int[] Abp = {AbSTRp, AbDEXp, AbCONp, AbINTp, AbWISp, AbCHAp};
        int[] PA = {p.PlayerSTR, p.PlayerDEX, p.PlayerCON, p.PlayerINT, p.PlayerWIS, p.PlayerCHA};
        for (int i = 0; i < 6; i++) {
            if (PA[i] == 1) {
                Abp[i] = (-5);
            }
            if (PA[i] == 2 || PA[i] == 3) {
                Abp[i] = (-4);
            }
            if (PA[i] == 4 || PA[i] == 5) {
                Abp[i] = (-3);
            }
            if (PA[i] == 6 || PA[i] == 7) {
                Abp[i] = (-2);
            }
            if (PA[i] == 8 || PA[i] == 9) {
                Abp[i] = (-1);
            }
            if (PA[i] == 10 || PA[i] == 11) {
                Abp[i] = 0;
            }
            if (PA[i] == 12 || PA[i] == 13) {
                Abp[i] = 1;
            }
            if (PA[i] == 14 || PA[i] == 15) {
                Abp[i] = 2;
            }
            if (PA[i] == 16 || PA[i] == 17) {
                Abp[i] = 3;
            }
            if (PA[i] == 18 || PA[i] == 19) {
                Abp[i] = 4;
            }
            if (PA[i] == 20 || PA[i] > 20) {
                Abp[i] = 5;
            }
        }


    }

    public void main(String[] args) {
        System.out.println("Your stats are:");
        System.out.println("---------------------");
        System.out.println("STR = " + p.PlayerSTR);
        System.out.println("DEX = " + p.PlayerDEX);
        System.out.println("CON = " + p.PlayerCON);
        System.out.println("INT = " + p.PlayerINT);
        System.out.println("WIS = " + p.PlayerWIS);
        System.out.println("CHA = " + p.PlayerCHA);
        System.out.println("");
        System.out.println("Your Ability Points are:");
        System.out.println("---------------------");
        System.out.println("STR AP = " + AbSTRp);
        System.out.println("DEX AP = " + AbDEXp);
        System.out.println("CON AP = " + AbCONp);
        System.out.println("INT AP = " + AbINTp);
        System.out.println("WIS AP = " + AbWISp);
        System.out.println("CHA AP = " + AbCHAp);
    }
}
