package github.lugom.Dump.classes;

public class Employee 
{
	private int id = 0;
	private String name = "";
	private double salary = 0;
	
	
	public Employee(int id, String name, double salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() 
	{
		return id + ", " + name + ", " + salary;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public void increaseSalary(double salary) 
	{
		this.salary = this.salary + (this.salary*salary/100);
	}
	
}
