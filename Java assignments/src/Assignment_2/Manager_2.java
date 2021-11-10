package Assignment_2;
//Manager.java

public class Manager_2 extends Employee_2 
{
	int incentives=6000;
	void salary()
	{
		int sal;
		sal=25000+incentives;
		System.out.println("The salary of a Manager is Rs:" +sal);
	}
}