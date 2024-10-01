/**
 * Evital Heyl
 * 1-3
 * Sept. 27th, 2024
 * Problem Set 2C
 */

import java.util.Scanner;

public class Driver {
    public static void main (String[] args) {
        /**
         * //OrderedPair method tests
        OrderedPair numberPair1 = new OrderedPair();
        OrderedPair numberPair2 = new OrderedPair(1, 2);

        System.out.println(numberPair1);
        System.out.println(numberPair2);
        System.out.println(numberPair1.getX());
        System.out.println(numberPair2.getX());
        System.out.println(numberPair1.getY());
        System.out.println(numberPair2.getY());
         */

        Scanner input = new Scanner(System.in);

        //Quadratic Formula
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c: ");
        System.out.print("a: ");
        double a1 = input.nextDouble();
        System.out.print("b: ");
        double b1 = input.nextDouble();
        System.out.print("c: ");
        double c1 = input.nextDouble();
        System.out.println("The solutions for 1x^2 + 5x + 6 are " + Formulas.findQuadraticRoots(a1, b1, c1));
        //______________________________

        //Slope Formula
        System.out.println("\nSLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1Slope = input.nextDouble();
        System.out.print("y1: ");
        double y1Slope = input.nextDouble();
        System.out.print("x2: ");
        double x2Slope = input.nextDouble();
        System.out.print("y2: ");
        double y2Slope = input.nextDouble();

        OrderedPair orderedPairASlope = new OrderedPair(x1Slope, y1Slope);
        OrderedPair orderedPairBSlope = new OrderedPair(x2Slope, y2Slope);

        System.out.println("A line between " + orderedPairASlope + " and " +
        orderedPairBSlope + " has a slope of " + Formulas.findSlope(orderedPairASlope, orderedPairBSlope));
        //----------------------------------

        //MIDPOINT FORMULA
        System.out.println("\nMIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1Midpoint = input.nextDouble();
        System.out.print("y1: ");
        double y1Midpoint = input.nextDouble();
        System.out.print("x2: ");
        double x2Midpoint = input.nextDouble();
        System.out.print("y2: ");
        double y2Midpoint = input.nextDouble();

        OrderedPair orderedPairAMidpoint = new OrderedPair(x1Midpoint, y1Midpoint);
        OrderedPair orderedPairBMidpoint = new OrderedPair(x2Midpoint, y2Midpoint);

        System.out.println("The midpoint between " + orderedPairAMidpoint + " and " +
        orderedPairBMidpoint + " is " + Formulas.findMidpoint (orderedPairAMidpoint,orderedPairBMidpoint));
        //-------------------------------

        //SUM OF AN ARITHMETIC SERIES
        System.out.println("\nSUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int numberOfTermsArith = input.nextInt();
        System.out.print("Starts with: ");
        double firstTermValueArith = input.nextDouble();
        System.out.print("Changes by: ");
        double arithmeticChange = input.nextDouble();
        System.out.println("The sum of the first " + numberOfTermsArith + " terms of an arithmetic series that starts with " +
        firstTermValueArith + " and changes by " + arithmeticChange + " is " +
        Formulas.findArithmeticSeriesSum(firstTermValueArith, arithmeticChange, numberOfTermsArith));
        //---------------------------------

        //Sum of a geometric series
        System.out.println("\nSUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        int numberOfTermsGeo = input.nextInt();
        System.out.print("Starts with: ");
        double firstTermValueGeo = input.nextDouble();
        System.out.print("Changes by: ");
        double geometricChange = input.nextDouble();
        System.out.println("The sum of the first " + numberOfTermsGeo + " terms of a geometric series that starts with " +
        firstTermValueGeo + " and changes by " + geometricChange + " is " +
        Formulas.findGeometricSeriesSum(firstTermValueGeo, geometricChange, numberOfTermsGeo));
        //---------------------------------
         
        //Die roller
        System.out.println("\nDIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int numberOfSides = input.nextInt();
        System.out.println("Rolling a " + numberOfSides +
        "-sided die... you got a " + Formulas.rollDie(numberOfSides) + "!");
        


    }
}