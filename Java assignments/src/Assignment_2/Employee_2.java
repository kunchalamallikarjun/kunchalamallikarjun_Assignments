package Assignment_2;
//2. Hiearchy of an organisation (Employee.java,Manager.java,Labour.java)

import java.io.*;
import java.util.*;
public class Employee_2 
{
	void salary()
	{
		int sal=25000;
		System.out.println("The salary of an Employee is Rs:" +sal);
		
	}
	public static void main(String[] args) 
	{
		Employee_2 e1 = new Employee_2();
		e1.salary();
		Manager_2 m1=new Manager_2();
		m1.salary();
		Labour_2 l1=new Labour_2();
		l1.salary();
		
		
	}

}

