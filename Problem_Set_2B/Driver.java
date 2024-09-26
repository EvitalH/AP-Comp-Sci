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

        System.out.println("Last character test cases");
        System.out.print("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last character is " + sTools.lastLetter(answer1));
        System.out.println("---------------------");

        
        System.out.println("\nPhone number test cases");
        System.out.print("Enter your number (10 characters): ");
        String answer2 = input.nextLine();
        System.out.println("The format of your phone number should be " +
        sTools.formatPhoneNumber(answer2));
        System.out.println("---------------------");

        
        System.out.println("\n3 middle letters test cases");
        System.out.print("Enter a word (odd number of characters, more than 3): ");
        String answer3 = input.nextLine();
        System.out.println("The 3 middle letters of your word are: " +
        sTools.middleThree(answer3));
        System.out.println("---------------------");
         

        System.out.println("\nSwap last two letters test cases");
        System.out.print("Enter a word: ");
        String answer4 = input.nextLine();
        System.out.println("Your new word is: " +
            sTools.swapLastTwo(answer4));
        System.out.println("---------------------");
        

        System.out.println("\nAre the first and last characters the same test cases");
        System.out.print("Enter a word: ");
        String answer5Word = input.nextLine();
        System.out.print("Enter an interger (one or more, less or same amount as word): ");
        int answer5Number = input.nextInt();
        
        if (answer5Number == 1) {
            System.out.println("Are the first and last character of your word, \"" +
                answer5Word + "\", equal?: " + sTools.frontAgain(answer5Word, answer5Number));
        } else {
            System.out.println("Are the " + answer5Number +
                " first and last characters of your word, \"" +
                answer5Word + "\", equal?: " + sTools.frontAgain(answer5Word, answer5Number));            
        }
        
        System.out.println("---------------------");

        input.close();
    }
}