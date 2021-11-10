package Assignment_2;
//5. To draw shapes and use abstract. (Shape.java,Line.java,Rectangle.java,Cube.java)

import java.io.*;
import java.util.*;
public abstract class Shape 
{
	abstract void draw();
	
	public static void main(String[] args) 
	{
		Shape l=new Line();
		l.draw();
		Shape r=new Rectangle();
		r.draw();
		Shape c=new Cube();
		c.draw();
	}

}

//Line.java

 class Line extends Shape
{
	@Override
	void draw() {
		System.out.println("The shape is LINE");
		
	}

}

//Rectangle.java

 class Rectangle  extends Shape
{
	@Override
	void draw() 
	{
		System.out.println("The shape is RECTANGLE");
		
	}

}

//Cube.java

 class Cube  extends Shape
{
	@Override
	void draw() 
	{
		System.out.println("The shape is CUBE");
		
	}

}