
public class MethodsDemo {
/*
 * Methods - carries out a specific task
 * method input - parameters/arguments
 */
	 static int boxVolume(int length, int breadth, int height){ //method definition
		int vol;
		vol = length*breadth*height;
		return vol;
		
	}
	 
	 static void printLine() {
		 System.out.println("---------------------------------------------");
	 }
	
	
	public static void main(String[] args) {
		
		printLine();
		System.out.println("Hello"); //method call
		System.out.println(boxVolume(10,4,6)); //passing arguments
		printLine();	
	}

}
