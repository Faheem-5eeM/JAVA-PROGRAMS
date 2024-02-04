package lab_04;
public class employee 
{
	private int id;
	private String name;
	private double salary;
	
	public employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void raiseSalary(double percent)
	{
		if(percent > 0)
		{
			 double raiseAmount = (percent/100)*salary;
			salary = salary + raiseAmount;
			System.out.println(name+"'s Salary has been increased by "+percent+" and the salary become $"+salary);
			
		}
		else
		{
			System.out.println("\nInvalid Input for Increasing salary!!.");
		}
	}
    public String toString()
    {
    	return "Employee id:"+id+", Name: "+name+", Salary is : "+salary;
    } 
    
	public static void main(String[] args) 
	{
		employee Employee1 = new employee(1,"Faheem",50000);
		employee Employee2 = new employee(2,"Peyush",60000);
		
		System.out.println("\nInitial Employee Information : ");
		System.out.println(Employee1);
		System.out.println(Employee2);
		
		Employee1.raiseSalary(10);
		Employee2.raiseSalary(5);
		System.out.println("\nUpdated Result Salary :");
		
		System.out.println(Employee1);
		System.out.println(Employee2);
  
	}

}

