package OOP;

public class wrapperDemo {
	public static void main(String args[]) {
		
		int i = 10; //primitive data types
		float f;
		
		Integer i2 = Integer.valueOf(i); //Boxing, wrapping
		
		int j = i2.intValue(); //unboxing
		
		Integer i3 = 20; //Integer.valueOf(20) - autoboxing
		
		int k = i2; //autounboxing
		
		String s = "123";
		
		int i4 = Integer.parseInt(s);
		
		System.out.println(i4);
	}
}
