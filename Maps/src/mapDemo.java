import java.util.*;
public class mapDemo {

	public static void main(String[] args) {
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"abbas");    
		      hm.put(2,"sakshi");    
		      hm.put(3,"prabha");   
		       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:hm.entrySet()) {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }

		       
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"Banu");  
		      ht.put(5,"akash");  
		      ht.put(6,"prakash");  
		      ht.put(7,"sallu");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      
		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(8,"lion");    
		      map.put(9,"cat");    
		      map.put(10,"tree");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    


	}

}
