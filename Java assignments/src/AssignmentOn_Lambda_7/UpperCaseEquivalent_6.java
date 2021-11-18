package AssignmentOn_Lambda_7;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.function.UnaryOperator;

	class MyOperator implements UnaryOperator<String>
	{
		@Override
		public String apply(String t) 
		{
			return t.toUpperCase();
		}
	}
	public class UpperCaseEquivalent_6 
	{	
		public static void main(String[] args)
		{
			List<String> li=new ArrayList<>();
			li.add("mallikarjun");
			li.add("giri");
			li.add("vinith");
			li.add("arjun");
			System.out.println("----------------------------------------------------------------");
			System.out.println("Elements in list are:");
			System.out.println(li);
			System.out.println("----------------------------------------------------------------");
			System.out.println(" ");
			li.replaceAll(new MyOperator());
			System.out.println("----------------------------------------------------------------");
			System.out.println("Elements in list after replacing with upper case letters are:");
			System.out.println(li);
			System.out.println("----------------------------------------------------------------");		
		}

	}

