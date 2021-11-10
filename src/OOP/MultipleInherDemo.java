package OOP;
/*
 * The problem of Multiple Inheritance
 */
class A{
	void display(){
		System.out.println("From class A");
	}
}

class B {
	void display(){
		System.out.println("From class B");
	}
}

class C extends B{
	
}
public class MultipleInherDemo {

	public static void main(String[] args) {
		C c = new C();
		c.display();

	}

}
