/*
 * Evital Heyl
 * 1-3
 * October 21th
 */
public class TestStdDrawImage2 {

   public static void main (String[] args) {

           StdDraw.setScale(0, 500);
           StdDraw.setPenRadius(0.0005);
           StdDraw.setPenColor(StdDraw.BLACK);

           
           for (int i = 0; i <= 500; i += 20) {
               StdDraw.line (500, i, i, 0 );
               StdDraw.line (0, 500-i, 500-i, 500);
            }
            
            
            

       }
   } 

