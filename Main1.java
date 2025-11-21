class Person 
{
    String name;
    Person(String name) 
	{
        	this.name = name;
        	System.out.println("Person constructor called: " + name);
    	}
    void displayInfo() 
	{
        	System.out.println("Name: " + name);
    	}
}
class Employee extends Person 
{
    int employeeId;
    Employee(String name, int employeeId) 
	{
        	super(name);
        	this.employeeId = employeeId;
        	System.out.println("Employee constructor called with ID: " + employeeId);
    	}
  
    void displayInfo() 
	{
       
        	super.displayInfo();
        	System.out.println("Employee ID: " + employeeId);
    	}
}
class Main1 
{
    	public static void main(String[] args) 
	{
        	Employee emp = new Employee("Naga", 6103);
        	emp.displayInfo();
    	}
}
