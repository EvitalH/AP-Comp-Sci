//Evital Heyl
//1-3
//October 18

import java.util.Scanner;

public class Question1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = (int)(Math.random() * 100) + 1;
        int answer;
        int tries = 0;
        
        System.out.println ("I'm thinking of a number between 1 and 100. Can you guess it?");
        
        do {
            System.out.print ("Your Guess: ");
            answer = input.nextInt();
            tries++;
            
            if (answer > number) {
                System.out.println ("Nope, that guess is too high.");
            } else if (answer < number) {
                System.out.println ("Nope, that guess is too low.");
            } else {
                break;
            }
        } while (answer != number);
        
        System.out.println ("You guessed it! It took you " + tries + " tries.");

        
    }

}