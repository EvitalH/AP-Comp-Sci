//Evital Heyl
//1-3
//October 21

public class SierpinskiTriangle{
    public static void main (String[] args) {
        StdDraw.setScale(0, 1);
        StdDraw.setPenRadius (0.0005);
        StdDraw.setPenColor (StdDraw.BLACK);
        
        OrderedPair vertex1 = new OrderedPair (0, 1);
        OrderedPair vertex2 = new OrderedPair (1, 1);
        OrderedPair vertex3 = new OrderedPair (0.5, 0);
        
        StdDraw.point(vertex1.getX(), vertex1.getY());
        StdDraw.point(vertex2.getX(), vertex2.getY());
        StdDraw.point(vertex3.getX(), vertex3.getY());
        
        OrderedPair initialPoint = new OrderedPair (Math.random(), Math.random());
        OrderedPair currentPoint = initialPoint;
        
        for (int i = 0; i <= 10000; i++) {
            OrderedPair chosenVertex = new OrderedPair();
            int vertexNumber = (int) (Math.random() * 3) + 1;
            if (vertexNumber == 1) chosenVertex = vertex1;
            if (vertexNumber == 2) chosenVertex = vertex2;
            if (vertexNumber == 3) chosenVertex = vertex3;
            
            OrderedPair midPoint = findMidpoint (chosenVertex, currentPoint);
            
            StdDraw.point(midPoint.getX(), midPoint.getY());
            
            currentPoint = midPoint;
            
            
        }
        
        
        
        
        
    }
    
        public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {
        double aveX, aveY;
        aveX = (A.X + B.X)/2;
        aveY = (A.Y + B.Y)/2;
        OrderedPair midPoint = new OrderedPair(aveX, aveY);
        return midPoint;
    }
}
