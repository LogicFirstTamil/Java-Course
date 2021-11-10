package OOP;
import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		q.add(3);
		q.add(10);
		q.add(1);
		q.add(8);
		
		System.out.println("Head is " + q.peek());
		
		System.out.println("Removed " + q.poll());
		
		System.out.println("Head is " + q.peek());
		
		
	
	}

}
