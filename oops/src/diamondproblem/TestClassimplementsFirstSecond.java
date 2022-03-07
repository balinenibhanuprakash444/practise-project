package diamondproblem;

public class TestClassimplementsFirstSecond implements Second {

	 public void show() 
	    {  
	        
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	        TestClassimplementsFirstSecond ob = new TestClassimplementsFirstSecond(); 
	        ob.show(); 
	    } 
	}
