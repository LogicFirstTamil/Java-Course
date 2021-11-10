package OOP;
import java.util.*;

public class CollectionsDemo {
	
	public static void main(String[] args) {
			
		int a[] = new int[5]; //fixed size
		
		ArrayList<Integer> alist = new ArrayList<Integer>(); //flexible, supports redundancy
	
		for(int i=1;i<=10;i++)
			alist.add(i);
		
		alist.add(100);
		alist.add(100);
		alist.add(100);
		
		System.out.println(alist);
		System.out.println(alist.get(3));
		
		alist.set(0,100); //update
		
		
		alist.remove(5);
		System.out.println(alist);
		
		for(int i:alist)
			System.out.println(i);
		
		Iterator<Integer> i = alist.iterator();
		System.out.println("Using iterator");
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ArrayList slist = new ArrayList();
		
		slist.add("John");
		slist.add(10);
		slist.add('t');
		
		LinkedList<String> ll = new LinkedList<String>();
		
		
	}

}
