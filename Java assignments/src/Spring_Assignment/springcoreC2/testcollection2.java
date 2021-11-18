package com.springcoreC2;

//MAIN

	import org.springframework.context.ApplicationContext;

	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class testcollection2 {
		public static void main( String[] args )
	    {
	        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcoreC2/config2.xml");
	        Collection2 collectionlist = (Collection2) context.getBean("collectionlist");
	        
	        System.out.println(collectionlist.getQuestionId());
	        System.out.println(collectionlist.getQuestions());
	        System.out.println(collectionlist.getAnswers());

	}

	}
