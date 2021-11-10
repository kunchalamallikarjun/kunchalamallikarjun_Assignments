package AssignmentOn_Lambda_7;

import java.util.ArrayList;
import java.util.List;

public class  RemoveTheWord_4
{
	public static void main(String[] args) 
	{
		List<String> li=new ArrayList<>();
		li.add("mallikarjun");
		li.add("giri");
		li.add("vinith");
		li.add("Arjun");
		
		System.out.println("-------------------------------");
		System.out.println("Elements in the list are:");
		
		for (String string : li) {
			System.out.println(string);
		}
		System.out.println("-------------------------------");
		System.out.println(" ");
		
		li.removeIf(a->(a.length()%2 !=0));
		System.out.println("------------------------------------------");
		System.out.println("Elements in the list with odd lengths are:");
		
		for (String string : li) {
			System.out.println(string);
		}
		System.out.println("------------------------------------------");
	}
}

