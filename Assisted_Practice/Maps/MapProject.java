package mapcol;
import java.util.*;
public class MapProject {
	public static void main(String[] args) {
		
		//Creating Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"abc");    
	      hm.put(2,"def");    
	      hm.put(3,"xyz");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //Creating HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(8,"Red");  
	      ht.put(12,"White");  
	      ht.put(4,"Black");   

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //Creating TreeMap
	      
	      TreeMap<Integer,String> tm=new TreeMap<Integer,String>();    
	      tm.put(1,"Apple");    
	      tm.put(2,"Grapes");    
	      tm.put(3,"Orange");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:tm.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}



