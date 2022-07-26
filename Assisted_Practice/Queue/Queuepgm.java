package queuepro;
import java.util.*;

public class Queuepgm {
	public static void main(String[] args) {
		Queue<String> locationQueue= new LinkedList<String>();
		
		locationQueue.add("India");
		locationQueue.add("China");
		locationQueue.add("Sweden");
		locationQueue.add("Finland");
		locationQueue.add("Norway");
		locationQueue.add("US");
		
		System.out.println("Queue is : "+locationQueue);
		
		
		//find head of queue
		System.out.println("Head of Queue: "+locationQueue.peek());
		
		locationQueue.remove();
		
		System.out.println("After Removing Head: "+locationQueue);
		
	}
}
