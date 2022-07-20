package collection;

import java.util.*;

public class CollectionProject {
public static void main(String[] args) {
		//Creating ArrayList
		ArrayList<String> clr= new ArrayList<String>();
		
		clr.add("Red");
		clr.add("Blue");
		clr.add("White");
		clr.add("Yellow");
		System.out.println("ArrayList");
		System.out.println("Colors :"+clr);
		//Creating Vector
		Vector<Integer> v= new Vector<Integer>();
		v.add(4);
		v.add(67);
		v.add(2);
		System.out.println("\nVector");
   Iterator<Integer> itr= v.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Number: "+itr.next());
         }
		//Creating LinkedList
    LinkedList<Integer>lt= new LinkedList<Integer>();
		
		lt.add(56);
		lt.add(67);
		lt.add(89);
		lt.add(13);
		System.out.println("\nLinkedList");
		System.out.println("Elements :"+lt);
		//Creating HashSet
   HashSet<Integer> hs= new HashSet<Integer>();
		
		hs.add(20);
		hs.add(55);
		hs.add(2);
		hs.add(36);
		hs.add(67);
		hs.add(67);
		System.out.println("\nHashSet");
		System.out.println(hs);
}
}