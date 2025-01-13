
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Game{
    Fraction fracOne;
    Fraction fracTwo;
    String operator;


    public Game() {

   
    }
    
    public void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(fracOne + " " + operator + " " + fracTwo + " =");
        String playerAnswer = input.nextLine();
        
    }
    
    static void createFractions () {
        Fraction fracOne = new Fraction();
        Fraction fracTwo = new Fraction();
    }
    
    private void createAnswer () {
        int operatorType = (int)(Math.random() * 4);
        Fraction answer = null;
        if (operatorType == 3) {
            operator = "/";
            answer = Fraction.divide(fracOne, fracTwo);
        }
        else if (operatorType == 2) {
            operator = "*";
            answer = Fraction.multiply(fracOne, fracTwo);
        }
        else if (operatorType == 1) {
            operator = "-";
            answer = Fraction.subtract(fracOne, fracTwo);
        }
        else {
            operator = "+";
            answer = Fraction.add(fracOne, fracTwo);
        }
    }
    
    
    

    private void round () {
        
        
        
        
        
  
        
 
    }
}
