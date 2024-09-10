
/**
 *Problem Set Question 2
 *Evital Heyl
 *September 9th
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("What is your favourite course at school? ");
    String course = input.nextLine();
    
    System.out.print("What is your favourite show? ");
    String show = input.nextLine();
    
    System.out.print("How many hours do you spend studying each day? ");
    int studying = input.nextInt();

    System.out.print ("How many hours do you spend watching shows each day? ");
    int showTime = input.nextInt();
    
    System.out.println(" ");
    
    System.out.println ("Summary:");
    System.out.println (" ");
    System.out.println ("Your favourite course is " + course + ".");
    System.out.println ("Your favourite show is " + show + ".");
    System.out.println ("You spend " + studying + " hours a day studying.");
    System.out.println ("You spend " + showTime + " hours a day watching shows.");
    System.out.println ("In total, you spend " + (studying + showTime) + " hours a day studying and watching.");
    
    input.close();
    
    
    }  
}
