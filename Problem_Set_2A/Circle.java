/**
 * Evital Heyl
 * 1-3
 * September 23rd, 2024
 */

public class Circle {
    
    double radius;
    
    Circle () {
        radius = 1;
    }
    
    Circle (double r) {
        radius = r; 
    }
    
    public String toString () { 
        //defines what it means to print a dog
        //gets called when class is called
        return "Hello, I am a circle with radius " + radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double circumference() {
        double circumference = Math.PI * 2 * radius;
        return circumference;
    }
    
    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
        
    }
    
   
            
}
