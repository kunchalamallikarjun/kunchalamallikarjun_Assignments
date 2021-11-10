package Assignment_3_Strings;

public class StringOperations_3 {
	public static void main(String[] args) {
		
	String s="Java string pool refers to collection of string which are stored in heap memory";
	 System.out.println(s.toLowerCase());
	 System.out.println(s.toUpperCase());
	 System.out.println(s.replace('a', '$'));
	 System.out.println(s.contains("collection"));
	 System.out.println(s.matches("java string pool refers to collection of strings which  are sorted in heap memory"));
     System.out.println(s.equals("java string pool refers to collection of strings which  are sorted in heap memory"));
	}
}