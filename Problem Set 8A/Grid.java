
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
              grid[row][column] = " ";
          }
      }
      
    }
    
  public void draw () {
      
      
      for (int row = 0; row < grid.length; row++) {
          for (int column = 0; column < grid[0].length; column++) {
              System.out.print("[" + grid[row][column] + "]");
          }
          System.out.println();
      }
  }
  
  public void add (int row, int column, String play) {
      grid[row][column] = play;
  }
  
  public static int getRow (String move) {
    move = move.trim();
    return Integer.parseInt(move.substring(0, 1));

  }
  
   public static int getColumn (String move) {
    move = move.trim();
    return Integer.parseInt(move.substring(move.length()-1));        
  }
  
  public boolean won () {
      for (int row = 0; row < grid.length; row++) {
          String current = grid[row][0];
          for (int column = 1; column < grid[0].length - 1; column++) {
              if(grid[row][column].equals(current) && grid[row][column + 1].equals(current) && !current.equals(" ")) return true;        
          }
      }
      
      for (int column = 0; column < grid[0].length; column++) {
          String current = grid[0][column];
          for (int row = 1; row < grid.length - 1; row++) {
              if(grid[row][column].equals(current) && grid[row + 1][column].equals(current) && !current.equals(" " )) return true;          
          }
      }
      
      if (!grid[0][0].equals(" ") && grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2])) return true;
      
      if (!grid[2][0].equals(" ") && grid[2][0].equals(grid[1][1]) && grid[1][1].equals(grid[0][2])) return true;
        
      return false;
      
      
  }
  
}
