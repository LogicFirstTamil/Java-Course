package OOP;

/**************** Returning objects *************************/
class Box{
	
	int length; //instance variables
	int breadth;
	int height;

	Box(int l,int b, int h){ //constructor
		length = l;
		breadth = b;
		height = h;
	}
	
	boolean isEqual(Box b) {
		b.length++;
		if(length==b.length && breadth == b.breadth && height == b.height)
			return true;
		
		return false;
	}
	
	Box doubleBox(){
		Box temp = new Box(2*length,2*breadth,2*height);
		return temp;
	}
}
public class PassingRefDemo {

	static void increment(int a){
		a++;
	}

	public static void main(String[] args) {
		int a = 10;
		increment(a);
		increment(a);
		//System.out.println(a);
		
		Box b1 = new Box(5,3,4);
		Box b2 = new Box(5,3,4);
		
		Box b3 = b1.doubleBox();
		
		/*
		 * System.out.println(b1.isEqual(b2));
		System.out.println(b2.length);
		*/
		
		System.out.println(b3.length);
	}

}
