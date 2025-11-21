class Shape
{
	String sname;
	Shape(String sname)
	{
		this.sname= sname;
	}
	String display()
	{
		return sname;
	}	
}


class Rectangle extends Shape
{
	double length,breadth;
	Rectangle(String sname,double length, double breadth)
	{
		super(sname);
		this.length=length;
		this.breadth=breadth;
	}
	
	double area()
	{
		return length*breadth;
	}
}


class ShapeDemoSI
{
	public static void main (String[]args)
	{
		Rectangle r=new Rectangle("Rectangle",6.8,8.9);
		System.out.println(r.display());
		System.out.println(r.area());
	}
}
