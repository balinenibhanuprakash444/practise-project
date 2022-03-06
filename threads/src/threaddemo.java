
public class threaddemo {


public void run()
	{
		System.out.println("Thread in java..");
}
	public static void main( String args[] )
	{
		threaddemo i = new  threaddemo();
		i.start();
	}
}

