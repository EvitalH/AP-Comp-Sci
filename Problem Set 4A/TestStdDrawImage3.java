//Evital Heyl
//1-3
//October 21
public class TestStdDrawImage3{
    public static void main (String[] args) {
        StdDraw.setScale(0, 500);
        StdDraw.setPenRadius(0.0005);
        int i = 2;
        //filledCircle(double x, double y, double radius)

        for (int r = 500; r >= 0; r-=10) {
            if (i%2 == 0) {
                StdDraw.setPenColor(StdDraw.BLACK);
            } else {
                StdDraw.setPenColor(StdDraw.WHITE);
            }
            StdDraw.filledCircle(250, 250, r);
            i++;
        }

    }
}
