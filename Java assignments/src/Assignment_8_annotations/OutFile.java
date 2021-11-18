package Assignment_8_annotations;


	import java.io.File;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.jupiter.api.Test;

	public class OutFile {
	    	private File output; 
	    	@Before public void createOutputFile() 
	 	 { 
	       output = new File( );
	    	}
	  
		@After public void deleteOutputFile() 
	   		{
	        output.delete(); 
	   	} 
	     
	    @Test public void testFile1() 
	    		{
	       
	   		} 
		@Test public void testFile2() 
	   	 {
	       
	    		}
	}
