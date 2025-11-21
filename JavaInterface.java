interface Polygon {
    void getArea(int length, int breadth);  
}


class Rectangle implements Polygon {
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of rectangle is " + (length * breadth));
    }
}


class Triangle implements Polygon {
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of triangle is " + ((length * breadth) / 2.0));
    }
}

// Main class
public class JavaInterface {
    public static void main(String[] args) {

     
        Rectangle rect = new Rectangle();
        rect.getArea(7, 5); 

       
        Triangle tri = new Triangle();
        tri.getArea(10, 8); 
    }
}
