class Progress
{
	
	{	
		// instance variables
		 String name;
		 int id;
		 int age;

	// constructor
		Progress()
	{
		System.out.println("I will be invoked when an object created");
	}

		Progress(String name, int id, int age)
	{
		this.name();
		this.id();
		this.age();
	}

	}
}
 // method 
void getProgress()
{
	System.out.println("Name:"+name+"Id:"+"Age:"+age);
}
}
class Progress
{
	public static void main(String[]args)
	{
		Progress nag =new Progress("NAGA",6119,18);
		nag.getProgress();
	}
}