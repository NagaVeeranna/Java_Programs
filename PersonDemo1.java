
class PersonalInfo
{
	//instance variables
	String name;
	int id;
	int age;

	//constructor
	PersonalInfo()
	{
		System.out.println("I will be invoked automatically when an object is created");
	}

	//constructor overloading - more than 1 constructor with diff no. of param list 
	PersonalInfo(String name)
	{
		this();
		this.name = name;
		getPersonInfo();
	}

	PersonalInfo(String name, int id)
	{
		this(name);
		this.name = name;
		this.id = id;
		getPersonInfo();
	}

	PersonalInfo(String name, int id, int age)
	{
		this(name, id);
		this.name = name;
		this.id = id;
		this.age = age;
	}

	//method
	void getPersonInfo()
	{
		System.out.println("Name: " + name + " Id: " + id + " Age: " + age);
	}
}
class PersonDemo1
{
	public static void main(String[] args)
	{
		PersonalInfo pinfo = new PersonalInfo("venkat", 4891, 41);
		
		pinfo.getPersonInfo();
		
	}	
}