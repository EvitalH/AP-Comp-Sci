
/*
 * Evital Heyl
 * 1-3
 * Problem Set 5A
 */

public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction () { //default
        numerator = 1;
        denominator = 2;
    }
    
    public Fraction (int num, int den) { //custom
        numerator = num;
        denominator = den;
        checkZero(denominator);
        
    }
    
    public Fraction (String fraction) { //custom
        fraction = fraction.strip();
        int index = fraction.indexOf("/");
        
        numerator = Integer.valueOf(fraction.substring(0, index));
        denominator = Integer.valueOf(fraction.substring(index+1));
        
        checkZero(denominator);
        
    }
    
    public Fraction (Fraction fraction) { //copy
        numerator = fraction.numerator;
        denominator = fraction.denominator;
    }
    
    private void checkZero (int den) { //don't allow a fraction with denominator 0 to be created
        if ( den == 0) throw new ArithmeticException ("you cannot divide by 0");
    }
    
    public int getNum () {
        return numerator;
    }
    
    public int getDenom () {
        return denominator;
    }
    
    public double toDouble () {
        return (double)numerator/denominator;
    }
    
    public Fraction multiply (Fraction fracOne, Fraction fracTwo) {
        int Num = fracOne.numerator * fracTwo.numerator;
        int Denom = fracOne.denominator * fracTwo.denominator;
        Fraction myFraction = new Fraction(Num, Denom);
        return myFraction;
    }
    
    
    

    
    
    
}
