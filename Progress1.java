class Progress1 
{

    // Instance variables
    String name;
    int id;
    int age;

    // Default constructor
    Progress() 
	{
        System.out.println("I will be invoked when an object is created");
	}

    // Parameterized constructor
    Progress(String name, int id, int age) 
	{
        this.name = name;
        this.id = id;
        this.age = age;
	}

    // Method to print progress
    void getProgress() 
	{
        System.out.println("Name: " + name + " Id: " + id + " Age: " + age);
    		}

    // Main method
    public static void main(String[] args) {
        Progress nag = new Progress("NAGA", 6119, 18);
        nag.getProgress();
    }
}
