package OOP;

//Inner classes

class Outer{
	int num;
	void outerDisplay() {
		System.out.println("Outer display");
	}
	 class Inner{
		int x;
		
		void innerDisplay() {
			System.out.println("Inner display" + num);
		}
	}
}
public class InnerDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.num = 10;
		o.outerDisplay();
		Outer.Inner i = o.new Inner();
		i.innerDisplay();

	}

}
