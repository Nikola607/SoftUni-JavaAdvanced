package MultidimensionalArrays;

import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[15][15];
        int playerRow = 7;
        int playerCol = 7;

        int playerHp = 18500;
        int bossHp = 3000000;
        int damagePerTurn = Integer.parseInt(scan.nextLine());

        String previousSpell = "";

        while (playerHp > 0 || bossHp > 0) {
            String[] attack = scan.nextLine().split("\\s+");

            String attackName = attack[0];
            int attackRow = Integer.parseInt(attack[1]);
            int attackCol = Integer.parseInt(attack[2]);


            if (attackName.equals("Cloud")) {
                if (attackRow!=0) {
                    playerHp -= 3500;
                    if (previousSpell.equals("Cloud")) {
                        playerHp -= 3500;
                    }
                    previousSpell = "Cloud";
                }
                bossHp -= damagePerTurn;
            } else if (attackName.equals("Eruption")) {
                if (attackRow!=0) {
                    if (previousSpell.equals("Cloud")) {
                        playerHp -= 3500;
                    }
                    playerHp -= 6000;
                    previousSpell = "Eruption";
                }
                bossHp -= damagePerTurn;
            }
        }

        if (bossHp <= 0) {

            System.out.println("Heigan: Defeated!");
            System.out.println("Player:" + playerHp);
            System.out.println("Final position: " + playerRow + ", " + playerCol);

        } else if (playerHp <= 0) {

            System.out.println("Heigan: " + bossHp);
            System.out.println("Player: Killed by " + previousSpell);
            System.out.println("Final position: " + playerRow + ", " + playerCol);

        } else {

            System.out.println("Heigan: Defeated!");
            System.out.println("Player: Killed by " + previousSpell);
            System.out.println("Final position: " + playerRow + ", " + playerCol);

        }
    }

    private static boolean isInChamber(int row, int col) {
        return row >= 0 && row < 15 && col >= 0 && col < 15;
    }

    private static boolean spellAOE(int rowHit, int colHit) {
        for (int row = rowHit - 1; row <= rowHit + 1; row++) {
            for (int col = colHit - 1; col <= colHit + 1; col++) {
                if (isInChamber(row, col)) {

                }
            }
        }
        return false;
    }
}
