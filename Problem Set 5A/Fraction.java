
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
        denominator = 1;
    }
    
    public Fraction (int num, int den) { //custom
        numerator = num;
        setDenom(den);

        
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
    
    //ACCESSOR METHODS
    public int getNum () {
        return numerator;
    }
    
    public int getDenom () {
        return denominator;
    }
    
    public String toString () {
        return numerator + "/" + denominator;
    }
    
    public double toDouble () {
        return (double)numerator/denominator;
    }
    
    //MUTATOR METHODS
    
    public void reduce() {
        int gcf = greatestCommonFactor(numerator, denominator);
        numerator = numerator/gcf;
        denominator = denominator/gcf;
    }
    
    public void setNum (int n) {
        checkZero(n);
        numerator = n;
    }
    
    public void setDenom (int n) {
        checkZero(n);
        denominator = n;
    }
    
    //STATIC METHODS
    
    public static Fraction multiply (Fraction fracOne, Fraction fracTwo) {
        int Num = fracOne.numerator * fracTwo.numerator;
        int Denom = fracOne.denominator * fracTwo.denominator;
        Fraction myFraction = new Fraction(Num, Denom);
        return myFraction;
    }
    
    public static Fraction divide (Fraction fracOne, Fraction fracTwo) {
        int Num = fracOne.numerator * fracTwo.denominator;
        int Denom = fracOne.denominator * fracTwo.numerator;
        Fraction myFraction = new Fraction(Num, Denom);
        return myFraction;
    }
    
    private static Fraction AddOrSubtract (Fraction fracOne, Fraction fracTwo, String change) {
        int NumOne = fracOne.numerator * fracTwo.denominator;
        int NumTwo = fracTwo.numerator * fracOne.denominator;
        int Denom = fracOne.denominator * fracTwo.denominator;
        
        int Num;
        if (change.equals("add")) Num = NumOne + NumTwo;
        else Num = NumOne - NumTwo;
        
        Fraction myFraction = new Fraction(Num, Denom);
        return myFraction;
        
    }
    
    
    public static Fraction add (Fraction fracOne, Fraction fracTwo) {
        return AddOrSubtract(fracOne, fracTwo, "add");
    }
    
    public static Fraction subtract (Fraction fracOne, Fraction fracTwo) {
        return AddOrSubtract(fracOne, fracTwo, "subtract");
    }
    
    
    //HELPER METHODS
    
    public static int greatestCommonFactor (int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while(a != b) {
            int largerNumber = Math.max(a, b);
            if (largerNumber == a) a = a - b;
            else if (largerNumber == b) b = b - a;               
        }
        return a;
    }
    
    
    
    

    
    
    
}
