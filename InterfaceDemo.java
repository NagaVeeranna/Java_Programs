interface A
{
	int X = 10;

	void methX();
}

interface B
{
	int Y = 10;

	void methY();
}

interface C extends A, B
{
	int Z = 10;

	void methZ();
}

class D
{
	int p = 5;

	void methP()
	{
		System.out.println("I am from class D: " + p);	
	}
}

class E extends D
{
	int q = 7;

	void methQ()
	{
		System.out.println("I am from class E: " + q);	
	}
}

class F extends E implements C
{
	int r = 8;

	void methR()
	{
		System.out.println("I am from class F: " + r);	
	}

	public void methZ()
	{
		System.out.println("I have been declared in interface z and defined in class F: " + Z);	
	}

	public void methX()
	{
		System.out.println("I have been declared in interface X and defined in class F: " + X);	
	}

	public void methY()
	{
		System.out.println("I have been declared in interface Y and defined in class F: " + Y);	
	}
}

class InterfaceDemo
{
	public static void main(String[] args)
	{
		F f = new F();

		f.methX();

		f.methY();

		f.methZ();

		f.methP();

		f.methQ();

		f.methR();
	}
}