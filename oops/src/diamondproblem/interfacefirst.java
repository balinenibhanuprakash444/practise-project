package diamondproblem;

public class interfacefirst {



		    public static void main (String []args) 
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
