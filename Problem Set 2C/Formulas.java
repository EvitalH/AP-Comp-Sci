/**
 * Evital Heyl
 * 1-3
 * Sept. 27th, 2024
 * Problem Set 2C
 */

public class Formulas {
//static will make me able to call function without instantiating an object
    public static OrderedPair findQuadraticRoots (double a, double b, double c) {
        double xValue1, xValue2;
        xValue1 = (-b + Math.sqrt(Math.pow(b, 2) -4*a*c))/2*a;
        xValue2 = (-b - Math.sqrt(Math.pow(b, 2) -4*a*c))/2*a;
        
        OrderedPair OP = new OrderedPair(xValue1, xValue2);
        return OP;
        
    }
    
    public static double findSlope (OrderedPair A, OrderedPair B) {
        double slope, changeX, changeY;
        changeX = A.X - B.X;
        changeY = A.Y - B.Y;
        slope = changeY/changeX;
        return slope;
        
    }
    
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {
        double aveX, aveY;
        aveX = (A.X + B.X)/2;
        aveY = (A.Y + B.Y)/2;
        OrderedPair midPoint = new OrderedPair(aveX, aveY);
        return midPoint;
    }
    
    public static double findArithmeticSeriesSum (double a, double d, int k) {
        double Sum;
        Sum = (k/2.0) * (2*a + d*(k-1));
        return Sum;
    }
    
    public static double findGeometricSeriesSum (double a, double r, int k) {
        double Sum;
        Sum = a * ( (1 - Math.pow(r, k) ) / (1-r) );
        return Sum;
    }




}