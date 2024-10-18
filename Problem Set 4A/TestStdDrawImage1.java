/*
 * Evital Heyl
 * 1-3
 * October 18th
 */

   public class TestStdDrawImage1 {
       public static void main(String[] args) {
           StdDraw.setScale(0, 500);
           StdDraw.setPenRadius(0.0005);
           StdDraw.setPenColor(StdDraw.BLACK);
           
           for (int X = 0; X <= 500; X += 20) {
               StdDraw.line (X, 0, X, 500);
            }
            
            for (int Y = 500; Y >= 0; Y-= 20) {
                StdDraw.line (0, Y, 500, Y);
            }

       }
   }