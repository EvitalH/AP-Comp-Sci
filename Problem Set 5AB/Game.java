
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Game{
    
    private String operator;
    private boolean playing;
    private Fraction answer;
    private int roundNumber;
    private int correctNumber;


    public Game() {
        playing = true; 
   
    }
    
    public void main () {
        Scanner input = new Scanner(System.in);
        roundNumber = 0;
        correctNumber = 0;
        
        while(playing) {
            roundNumber += 1;
            
            Fraction fracOne = new Fraction();
            fracOne.reduce();

            Fraction fracTwo = new Fraction();
            fracTwo.reduce();
            
            createAnswer(fracOne, fracTwo);
            
            System.out.print(fracOne + " " + operator + " " + fracTwo + " =");
            String playerAnswer = input.nextLine();
            if(playerAnswer.equals("quit")) break;
            
            Fraction playerFraction = new Fraction(playerAnswer);
            
            if(playerFraction.equals(answer)) {
                System.out.println("Correct!");
                correctNumber += 1;
            } else {
                System.out.println("Wrong, the answer was " + answer);
            }
            
            System.out.println();
            
            
        }
        
        Fraction ratio = new Fraction (correctNumber, roundNumber-1);
        int percentage = ratio.percentage();
        System.out.println("Your win/lose ratio was " + ratio + " for a score of " + percentage + " percent");
        
        
        
    }
    
    
    private void createAnswer (Fraction f1, Fraction f2) {
        int operatorType = (int)(Math.random() * 4);
 
        if (operatorType == 3) {
            operator = "/";
            answer = Fraction.divide(f1, f2);
        }
        else if (operatorType == 2) {
            operator = "*";
            answer = Fraction.multiply(f1, f2);
        }
        else if (operatorType == 1) {
            operator = "-";
            answer = Fraction.subtract(f1, f2);
        }
        else {
            operator = "+";
            answer = Fraction.add(f1, f2);
        }
    }
    
    private boolean correctAnswer (Fraction playerFrac) {
        if(answer.getNum() != playerFrac.getNum()) return false;
        if(answer.getDenom() != playerFrac.getDenom()) return false;
        return true;
    }
    
    
    

    
}
