/**
 * Evital Heyl
 * September 25th, 2024
 * 1-3
 * Problem Set 2B
 */

import java.util.Scanner;

public class Driver {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        StringTools sTools = new StringTools();
        /**
        System.out.println("Last letter test cases");
        System.out.print("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastLetter(answer1));
        System.out.println("---------------------");

        System.out.println("\nPhone number test cases");
        System.out.print("Enter your number (10 characters): ");
        String answer2 = input.nextLine();
        System.out.println("The format of your phone number should be " +
        sTools.formatPhoneNumber(answer2));
        System.out.println("---------------------");

        System.out.println("\n3 middle letters test cases");
        System.out.print("Enter a word (odd number of characters): ");
        String answer3 = input.nextLine();
        System.out.println("The 3 middle letters of your word are: " +
        sTools.middleThree(answer3));
        System.out.println("---------------------");

         */

        System.out.println("\nSwap last two letters test cases");
        System.out.print("Enter a word: ");
        String answer4 = input.nextLine();
        System.out.println("Your new word is: " +
            sTools.swapLastTwo(answer4));
        System.out.println("---------------------");

       
        
        
        
        
        
    }
}