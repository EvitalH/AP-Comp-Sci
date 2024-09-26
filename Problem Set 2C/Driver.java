/**
 * Evital Heyl
 * 1-3
 * Sept. 27th, 2024
 * Problem Set 2C
 */

public class Driver {
    public static void main (String[] args) {
        OrderedPair numberPair1 = new OrderedPair();
        OrderedPair numberPair2 = new OrderedPair(1, 2);
        
        System.out.println(numberPair1);
        System.out.println(numberPair2);
        System.out.println(numberPair1.getX());
        System.out.println(numberPair2.getX());
        System.out.println(numberPair1.getY());
        System.out.println(numberPair2.getY());
    }
}