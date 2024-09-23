public class Cylinder{
    double height;
    Circle base;
    
    Cylinder () {
        height = 1;
        base = new Circle ();
    }
    
    Cylinder (double h, double r) {
        height = h;
        base = new Circle (r);
    }
    
    public String toString() {
        return "Hello, I am a cylinder with a radius " + getRadius() + " and a height of " + height;
    }
    
    public double getRadius() {
        double radius = base.getRadius();
        return radius;
    }
    
    public double getHeight () {
        return height;
    }
    
    public double surfaceArea() {
        double surfaceArea = (base.circumference() * getHeight()) + (2 * base.area());
        return surfaceArea;
    }
    
    public double volume() {
        double volume = Math.PI * Math.pow(getRadius(), 2) * getHeight();
        return volume;
    }
}