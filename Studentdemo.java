class StudentInfo
{
	//instance variables
	
	public String name;
	private int id;
	protected int age;
	
	StudentInfo()
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
	
	// parameterized Constructor
	StudentInfo(String name, int id, int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;

	}
	
	//copy constructor
	
	StudentInfo(StudentInfo obj)
	{
		this.name=name;
		this.id=id;
		this.age=age;


	
	}
	//method

	void getStudentInfo()
	{
		System.out.println("Name: " + name + " Id: " + id + " Age: " + age);

	
	}

}
class Studentdemo
{
	public static void main(String[]args)
	{
		StudentInfo ng= new StudentInfo("Naga",6103,18);
		ng.getStudentInfo();
	
	}
	
}