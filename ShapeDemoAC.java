abstract class Shape
{
	String shapetype;
	Shape(String Shapetype)
	{
		this.shapetype= Shapetype;
	}

	String dispShape()
	{
		return shapetype;
	}

	abstract double area();
	{
	
	} 
}

class Square extends Shape
{
	double side;
	
	Square (String shapetype,double side)
	{
		super(shapetype);
		this.side=side;
	}
	
	double area()
	{
		return side*side;	
	}
}

class Rectangle extends Shape
{
	double length,breadth;
	Rectangle(String shapetype,double length, double breadth)
	{
		super(shapetype);
		this.length=length;
		this.breadth=breadth;
	}
	
	double area()
	{
		return length*breadth;
	}

}

class Circle extends Shape
{
	
    	double radius;
	Circle(String shapetype, double radius) 

	{
        	super(shapetype);
        	this.radius = radius;
    	}

    double area() 
	{
        	return Math.PI * radius * radius;
    	}
	
}

class Triangle extends Shape 
{
    double base, height;

    Triangle(String shapetype, double base, double height) 
	{
        	super(shapetype);
        	this.base = base;
        	this.height = height;
    	}

    double area() 
	{
        	return 0.5 * base * height;
    	}
}



class ShapeDemoAC
{
	public static void main (String[]args)
	{
		Square sq=new Square("SQUARE",25.4);

		Rectangle r=new Rectangle("RECTANGLE",6.8,7.9);

		Circle c= new Circle("CIRCLE",10.0);

		Triangle t=new Triangle("TRIANGLE",10.80,20.84);
		
		

		Shape[] sh = {sq, r, c, t};

		for(Shape sh1:sh)
		{
			
           		System.out.println(sh1.dispShape() + ": " + sh1.area());
		}		
	
	}
}