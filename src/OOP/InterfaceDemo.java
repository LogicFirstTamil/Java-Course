package OOP;
/* 
 * Interface - what to do   but not how to do - total abstraction
 * 
 * java 1.8 - default method
 * 
 *  */
/*
 * Functional Interface - Java 8 lambda expression
 * 
 */
interface Ridable { //Single Abstract Method Interface - SAM interface
	  int MAX_SPEED = 90 ;  //FINAL,STATIC
	  void ride(); //abstract method
	  default void display() {
		  System.out.println("hello from ridable interface");
	  }	  
}
class Car implements Ridable {
	public void ride() {
		System.out.println("You are riding a car");
	}
	public void display() {
		System.out.println("hello from car class");
	}
}

class Bike implements Ridable{
	public void ride() {
		System.out.println("You are riding a bike");
	}
}

class Mechanic{
	void check(Ridable r) {
		System.out.println("Checking");
		r.ride();
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		
			Ridable r = new Car();
			Mechanic m = new Mechanic();
			Car c = new Car();
			Bike b = new Bike();
			
			c.display();
			m.check(c);
			m.check(b);
			
			Ridable r2 = new Ridable() {
							public void ride() {
								System.out.println("You are riding a vintage car");
							}
							};
							
			r2.ride();
			
			//lambda expression - functional interface
			Ridable r3 = () -> System.out.println("You are riding a Convertible car");
				
			r3.ride();
			
			
	}
}
