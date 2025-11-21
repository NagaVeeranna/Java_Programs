class StudentInfo 
{
    // Instance variables
    	public String name;
    	private int id;
    	protected int age;
	
	static int count=0;

    // Default constructor
    StudentInfo() 
	{
        	name = ""; // Initialize with default values
        	id = 0;
        	age = 0;
        	System.out.println("Default constructor called");
    	
	}

    // Parameterized constructor

    StudentInfo(String name, int id, int age) 
	{
        	this.name = name;
        	this.id = id;
        	this.age = age;
        	System.out.println("Parameterized constructor called");
    	}

    // Copy constructor

    StudentInfo(StudentInfo obj) 
	{
	
        	this.name = obj.name;
        	this.id = obj.id;
        	this.age = obj.age;
        	System.out.println("Copy constructor called");
    	
	}

    // Method to display student information
	String dispStudentInfo()
	{
		return "count: " + ++count +  "name: " + name + "id: " + id+ "age: " + age; 
	}

    void getStudentInfo() 
	{
        	System.out.println("count:" + ++count +  "name: " + name +  "id: " + id +  "age: " + age);

    	}
}

class StudentDemo1
{
    public static void main(String[] args) 
{
        // Calling the default constructor
        StudentInfo student1 = new StudentInfo();
        student1.getStudentInfo();

        // Calling the parameterized constructor
        StudentInfo student2 = new StudentInfo("Naga", 6103, 18);
        student2.getStudentInfo();

        // Calling the copy constructor
        StudentInfo student3 = new StudentInfo(student2);
        student3.getStudentInfo();
	
	System.out.println(student3.dispStudentInfo());


    }
}
