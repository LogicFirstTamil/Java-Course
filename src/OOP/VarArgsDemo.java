package OOP;

/*
 * varargs
 */
public class VarArgsDemo {
	
	static int minValue(int... vals ){ //SE 5.0
		int min = Integer.MAX_VALUE; 
		for(int k:vals) {
			if(k<min)
				min = k;
		}
		
		return min;
		
	}
	
	public static void main(String[] args) {
		int m = minValue();
		System.out.println(m);
		int n = minValue(4,7,2,0,-1);
		System.out.println(n);
		

	}

}
