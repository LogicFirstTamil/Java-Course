package OOP;
import java.util.*;

/*
 * set - only unique elements
 * HashSet - hashing
 * 
 */

public class SetDemo {

	public static void main(String[] args) {
		TreeSet<String> h = new TreeSet<String>();
		
		h.add("Ram");
		h.add("Abi");
		h.add("Priya");
		h.add("Ravi");
		h.add("Abi");
		
		System.out.println(h);
		
	}

}
