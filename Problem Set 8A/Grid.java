
/**
 * Evital Heyl
 * 1-3
 * Problem Set 8A
 */
public class Grid {
    private String[][] grid;

    public void instantiate (){
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

    public boolean action (int row, int column, String play) {
        if(row < 0 || row > 2 || column < 0 || column > 2) return false; //is play in range?
        
        if (grid[row][column].equals(" ")) {  //has this space already been filled?
            grid[row][column] = play;
            return true;
        }
        else {
            return false;
        }
    }

    public static int getRow (String move) {
        move = move.trim();
        
        int index = 0;
        for (int i = 0; i < move.length(); i++) {
            if (move.charAt(i) == ',') index = i;     
        }

        boolean numeric = true; //will check if the move is in the right format
        
        try {
            Integer.parseInt(move.substring(0, index));
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)return Integer.parseInt(move.substring(0, index));
        else return -1;

    }

    public static int getColumn (String move) {
        move = move.trim();
        int index = 0;
        for (int i = 0; i < move.length(); i++) {
            if (move.charAt(i) == ',') index = i;     
        }

        boolean numeric = true; //will check if the move is in the right format
        try {
            Integer.parseInt(move.substring(index + 1));
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)return Integer.parseInt(move.substring(index + 1));
        else return -1;        
    }

    public boolean won () {
        //Won a row
        
        for (int row = 0; row < grid.length; row++) {
            String current = grid[row][0];
            for (int column = 1; column < grid[0].length - 1; column++) {
                if(grid[row][column].equals(current) && grid[row][column + 1].equals(current) && !current.equals(" ")) return true;        
            }
        }

        //Won a column
        
        for (int column = 0; column < grid[0].length; column++) {
            String current = grid[0][column];
            for (int row = 1; row < grid.length - 1; row++) {
                if(grid[row][column].equals(current) && grid[row + 1][column].equals(current) && !current.equals(" " )) return true;          
            }
        }

        //Won a diagonal
        
        if (!grid[0][0].equals(" ") && grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2])) return true;

        if (!grid[2][0].equals(" ") && grid[2][0].equals(grid[1][1]) && grid[1][1].equals(grid[0][2])) return true;

        return false; //didn't win

    }
}
