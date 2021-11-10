package Assignment_6_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueProduts_2{

	public static void main(String[] args) {
		Set<Object> hs=new HashSet<>();
		hs.add(-10);
		hs.add(100);
		hs.add(null);
		hs.add("Hi");
		hs.add(1);
		hs.add(45);
		hs.add(-300);
		hs.add(-10); //will be negleted for being duplicate
		hs.add("hii");
		hs.add("6.14");
		
		System.out.println(hs);
	}
}
