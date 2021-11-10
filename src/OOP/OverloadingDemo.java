package OOP;
/***
 * 
 * Method Overloading
 *
 */

public class OverloadingDemo {
	
	static int max(int a,int b) {
		return a>b?a:b;
	}
	
	static double max(double a,double b) {
		return a>b?a:b;
	}
	
	static char max(char a,char b) {
		return a>b?a:b;
	}

	public static void main(String[] args) {
		System.out.println(max(5,7));
		System.out.println(max(5.5,6.7));
		System.out.println(max('p','c'));
		
		System.out.println(Math.abs(-4.5));
		System.out.println(Math.abs(10));
	}

}
