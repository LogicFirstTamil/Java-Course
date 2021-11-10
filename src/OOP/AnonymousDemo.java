package OOP;

class Cycle{
	void display() {
		System.out.println("I am a cylce");
	}
	
}



public class AnonymousDemo {

	public static void main(String[] args) {
		Cycle c = new Cycle()   // anonymous class
				{
					void display() {
						System.out.println("I am a tricyle");
					}
				};
				
		Cycle c2 = new Cycle();
		
		c.display();
		c2.display();
		
	}

}
	