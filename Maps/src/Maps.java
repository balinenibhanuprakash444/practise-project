import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				Map<String, Float> map = new HashMap<String, Float>();   
				map.put("ice with cream",  350.8f);  
				map.put("pulka", 10.12f);   
				map.put("Sandwich with milk", 150.00f);   
				map.put("Fries with dip", 50.89f);   
				for (Map.Entry<String,Float> entry : map.entrySet()) 
				{    
				System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());   
				}
				
				
				Map<String,String> map1=new HashMap<String, String>();
				map1.put("Bhanu", "Prakash");
				map1.put("Kumar", "Krishna");
				map1.put("King", "Queen");
				map1.put("Sheep", "Lion");
				map1.put("Man", "Women");
				
				for (String name: map1.keySet())         
				{  
				String lastname=map1.get(name);   
				System.out.println("Key: " + name + ", Value: " + lastname);   
				}     


	}

}
