
/**
 * Evital Heyl
 */

public class Shape {
    private String color;
    private boolean filled;
    
    
    
    public Shape (String c, boolean f) {
        color = c;
        filled = f;
    }
    
    public double calculateArea() {
        return 0;
    }
    
    public double calculatePerimeter() {
        return 0;
    }
    
    public String toString() {
        String answer = "Color is " + color;
        if (filled) answer += ". Shape is filled";
        else answer += ". Shape is not filled";
        return answer;
    }
    
    //Accessor and mutator methods
    
    public String getColor () {
        return color;
    }
    
    public boolean getFilled () {
        return filled;
    }
    
    public void setColor (String color) {
        this.color = color;
    }
    
    public void setFilled (boolean filled) {
        this.filled = filled;
    }
    

}
