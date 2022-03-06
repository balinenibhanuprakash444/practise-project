
public class Diamond {
	interface First 
	{  
	    default void show() 
	    { 
	        System.out.println("Default First"); 
	    } 
	} 
	interface Second 
	{  
	    default void show() 
	    { 
	        System.out.println("Default Second"); 
	    } 
	}  
	public class TestClass implements First, Second 
	{  
		 public void show() 
		    {  
		        First.super.show(); 
		        Second.super.show(); 
		    } 
		   
	}
}