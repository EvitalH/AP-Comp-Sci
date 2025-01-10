
/*
 * Evital Heyl
 * 1-3
 * Problem Set 5A
 */
public class FractionDriver {
    public static void main (String[] args) {
       PI();

        

    }
    
    public static void PI () {
        Fraction MILU = new Fraction(355, 113);
        final double EPSILON = Math.abs( Math.PI - MILU.toDouble() );
        
        Fraction approx = new Fraction (MILU);
        
        while (Math.abs(Math.PI - approx.toDouble()) >= EPSILON) {
            if (Math.PI > approx.toDouble()) {
                approx.setNum(approx.getNum() + 1);
            } else {
                approx.setDenom(approx.getDenom() + 1);
            }
        }
        
        System.out.println(approx);

    }
}
