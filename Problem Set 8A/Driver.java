/**
 * Evital Heyl
 * 1-3
 * Problem Set 8A
 */

import java.util.Scanner;

public class Driver {
    static boolean playing = true;
    static Grid myGrid = new Grid();
    static Scanner input = new Scanner(System.in);
    static int roundNum = 1;
    static String player;

    public static void main (String[] args) {   
        while(playing) {
            game();
            end();
        }
    }

    public static void game () {
        myGrid.instantiate();

 

        while (!myGrid.won()) {
            if(roundNum%2 != 0) player = "X";
            else player = "O";
            
            String move = "";
            
            do {
                System.out.println("Round " + roundNum);  
                myGrid.draw();
                System.out.print(player + ", make your move (row,col): ");
                move = input.nextLine();
            } while(!myGrid.action(myGrid.getRow(move), myGrid.getColumn(move), player));


            roundNum++;
            if(roundNum == 10) break;
        }
    }  

    public static void end () {
        boolean correctAnswer = false;

        while(!correctAnswer) {
            if (roundNum == 10 && !myGrid.won()){
                System.out.println("TIE GAME");
            }else System.out.println("YOU WON PLAYER " + player);
            
            myGrid.draw();
            System.out.print("Play Again? Y/N ");     
            String again = input.nextLine();
            
            if (again.equals("Y")) {
                playing = true;
                correctAnswer = true;
                roundNum = 1;
                myGrid.instantiate();
            }
            if (again.equals("N")) {
                playing = false;
                correctAnswer = true;
            }

        }
    }
}

