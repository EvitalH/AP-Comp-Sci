/**
 * Evital Heyl
 * 1-3
 * Problem Set 8A
 */

import java.util.Scanner;

public class Driver {
  public static void main (String[] args) {
       Scanner input = new Scanner(System.in);
       Grid myGrid = new Grid();
       
       boolean won = false;
       int roundNum = 1;
       
       while (!won) {
           System.out.println("Round " + roundNum);
           myGrid.draw();
           System.out.print("X, make your move (row, col): ");
           String move = input.nextLine();
           
       }
    }  
    

}
