package constructor;

public class constructor {
	private String name;
	public constructor(String name) {
		this.name=name;
		System.out.println("this is a parameterized constructor");
		
	}
	public constructor() {
		System.out.println("This is a nonparameterized constructor");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
		constructor con=new constructor();
		constructor con1=new constructor("Bhanu");
		con1.setName("Bhanu");
		System.out.println("The passed parameter is "+con1.getName());	

	}

}


	

