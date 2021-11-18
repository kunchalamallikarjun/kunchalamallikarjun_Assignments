//9.Complete Bean Life Cycle

package com.java.lifecycle_9;


	import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Test {

		public static void main(String[] args) {
			
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/java/lifecycle_9/bean.xml");
			
			context.registerShutdownHook();
			
			Example example=(Example) context.getBean("example");
			System.out.println(example);
			

		}

	}
