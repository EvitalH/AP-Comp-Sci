public class Driver {
    public static void main(String[] args) {   
        System.out.println("Creating a circle with the default constructor!");
        Circle circle1 = new Circle ();
        PrintCircle(circle1);
        
        System.out.println();
        
        System.out.println("Creating a circle with a parameterized constructor!");
        Circle circle2 = new Circle(2);
        PrintCircle(circle2);
        
        System.out.println();
        
        System.out.println("Creating a cylinder with a parameterized constructor!");
        Cylinder cylinder2 = new Cylinder(2, 2);
        PrintCylinder(cylinder2);
        
        
  

    }
    
     public static void PrintCircle (Circle c) {
        System.out.println(c);
        System.out.println("getRadius () --> " + c.getRadius() + " units");
        System.out.println("circumference() --> " + c.circumference() + " units");
        System.out.println("area() --> " + c.area() + " units^2");
    }
    
    public static void PrintCylinder (Cylinder c) {
        System.out.println(c);
        System.out.println("getRadius () --> " + c.getRadius() + " units");
        System.out.println("getHeight() --> " + c.getHeight() + " units");
        System.out.println("surfaceArea() --> " + c.surfaceArea() + " units^2");
        System.out.println("volume() --> " + c.volume() + " units^3");
    }

 }
