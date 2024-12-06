/**
 * Evital Heyl
 * 1-3
 * Problem Set 8A
 */

import java.util.Scanner;

public class Driver {
    public static void main (String[] args) {   

        Scanner input = new Scanner(System.in);
        boolean Continue = true;
        while(Continue) {
            Grid myGrid = new Grid();

            int roundNum = 1;
            String player = "X";

            while (!myGrid.won()) {
                if(roundNum%2 != 0) player = "X";
                else player = "O";

                System.out.println("Round " + roundNum);  
                myGrid.draw();

                System.out.print(player + ", make your move (row, col): ");
                String move = input.nextLine();
                myGrid.add(myGrid.getRow(move), myGrid.getColumn(move), player);


                roundNum++;
            }

            System.out.println("YOU WON");
            myGrid.draw();
            System.out.print("Play Again? Y/N ");
            String again = input.nextLine();
            if (again.equals("Y")) Continue = true;
            if (again.equals("N")) Continue = false;

        }

    }  
}
