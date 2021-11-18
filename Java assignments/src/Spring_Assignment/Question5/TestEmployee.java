package Question5;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class TestEmployee {


	public static void main(String[] args) {

	    ApplicationContext context = new ClassPathXmlApplicationContext("Question5/Q52.xml");

	    Employee employee = (Employee)context.getBean("employee");

	    if(employee.getAddress()==null){
	     System.out.println("The Employee Name : " + employee.getName());
	     System.out.println("The Employee Age : " + employee.getAge());
	     System.out.println("The Employee Address : " + "is not provided");
	    }
	    else{
	     System.out.println("The Employee Name : " + employee.getName());
	     System.out.println("The Employee Age : " + employee.getAge());
	     System.out.println("The Employee Address : " +   
	       employee.getAddress().getStreet() + " " +
	       employee.getAddress().getCity() + " " +
	       employee.getAddress().getState());
	}
	}}
