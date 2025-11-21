class Shape 
{
	void calculateArea() 
	{
        	System.out.println("Calculating area of a generic shape");
    	}
}


class Circle extends Shape 
{
    double radius;
    Circle(double radius) 
	{
        	this.radius = radius;
    	}
    void calculateArea() 
	{
        	double area = Math.PI * radius * radius;
        	System.out.println("Area of the circle: " + area);
    	}
}
class Rectangle extends Shape 
{
    double length, width;
    Rectangle(double length, double width) 
	{
        	this.length = length;
        	this.width = width;
    	}
    void calculateArea() 
	{
        	double area = length * width;
        	System.out.println("Area of the rectangle: " + area);
    	}
}
class Triangle extends Shape 
{
    double base, height;
    Triangle(double base, double height) 
	{
        	this.base = base;
        	this.height = height;
    	}
    void calculateArea() 
	{
        	double area = 0.5 * base * height;
        	System.out.println("Area of the triangle: " + area);
    	}
}

public class Polymorphism
{
	public static void main(String[] args) 
	{
        	Shape shape;
		shape = new Circle(5.0);
        	shape.calculateArea();  
		shape = new Rectangle(4.0, 6.0);
        	shape.calculateArea();  
        	shape = new Triangle(3.0, 8.0);
        	shape.calculateArea();      
	}
}
