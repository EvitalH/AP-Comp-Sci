
/**
 * Evital Heyl
 * 1-3
 * Problem Set 8A
 */
public class Grid {
     private String[][] grid;
     
    Grid (){
      grid = new String[3][3]; 
      for (int row = 0; row < grid.length; row++) {
          for (int column = 0; column < grid[0].length; column++) {
              grid[row][column] = "";
          }
      }
      
    }
    
  public void draw () {
      
      
      for (int row = 0; row < grid.length; row++) {
          for (int column = 0; column < grid[0].length; column++) {
              System.out.print("[ " + grid[row][column] + " ]");
          }
          System.out.println();
      }
  }
  
  public void add (int row, int column, String play) {
      grid[row][column] = play;
  }
  
  public static int getRow (String move) {
      for (int i = 0; i < move.length(); i++) {
          //if (move.charAt(i) != ' ') return 
      }
      return 0;
  }
}
