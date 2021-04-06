package Listing;

public class ParamTest
{
	public static void main(String[] args)
	{
		/*
		 * Test 1: Methods can't modify numeric parameters
		 */
		System.out.println("Testing tripleValue");
		double percent = 10;
		System.out.println("Before: percent=" + percent);
		tripleValue(percent);
		System.out.println("After: percent=" + percent);
		
		/*
		 * Test 2: Methods can change the state of object parameters
		 */
		System.out.println("\nTesting tripleSalary:");
		Employee1 harry = new Employee1("Harry", 50000);
		System.out.println("Before: salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary=" + harry.getSalary());
		
		/*
		 * Test 3: Methods can't attach new objects to object paarameters
		 */
		System.out.println("\nTesting swap:");
		Employee1 a = new Employee1("Alice", 70000);
		Employee1 b = new Employee1("Bob", 60000);
		System.out.println("Before: a=" + a.getName());
		System.out.println("Before: b=" + b.getName());
		swap(a, b);
		System.out.println("After: a=" + a.getName());
		System.out.println("After: b=" + b.getName());
	}
	
	public static void tripleValue(double x) // doesn't work
	{
		x = 3 * x;
		System.out.println("End of method: x=" + x);
	}
	
	public static void tripleSalary(Employee1 x) // works
	{
		x.raiseSalary(200);
		System.out.println("End of method: salary=" + x.getSalary());
	}
	
	public static void swap(Employee1 x, Employee1 y)
	{
		Employee1 temp = x;
		x = y;
		System.out.println("End of method: x=" + x.getName());
		System.out.println("End of method: y=" + y.getName());
	}
}

class Employee1 // simplified Employee class
{
	private String name;
	private double salary;
	
	public Employee1(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}