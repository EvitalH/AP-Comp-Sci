/**
 * Evital Heyl
 * 1-3
 * Sept. 27th, 2024
 * Problem Set 2C
 */

public class OrderedPair {
    double X;
    double Y;

    OrderedPair () {
        X = 0;
        Y = 0;
    }

    OrderedPair (double newX, double newY) {
        X = newX;
        Y = newY;
    }

    public String toString()  {
        return "(" + X + ", " + Y + ")";

    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

}