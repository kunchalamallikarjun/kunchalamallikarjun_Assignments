package com.java.bank;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;  


	public class one
	{
	    public static void main( String[] args )
	    {
	    	ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("com/java/bank/ConfigB.xml");  
	        ActBank obj=(ActBank)applicationcontext.getBean("obj");  
	        obj.withdraw();     
	        }
	}