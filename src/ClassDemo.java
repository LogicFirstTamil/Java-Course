
/**
 * 
 * static data and static methods
 *
 */
class Box{
	
	int length; //instance variables
	int breadth;
	int height;
	static int boxCount; //when class is loaded 

	Box(int l,int b, int h){ //constructor
		length = l;
		breadth = b;
		height = h;
		boxCount++;
	}
	
	Box(){
		length = -1;
		breadth = -1;
		height = -1;
		boxCount++;
		
	}
	
	static {
		System.out.println("from the static block");
		boxCount = 0;
	}
	
	Box(int l){
		length = breadth = height = l;
		boxCount++;
	}
	
	Box(Box b){ //copy constructor
		length = b.length;
		breadth = b.breadth;
		height = b.height;
		boxCount++;
	}
	
	void setDim(int l,int b, int h){ 
		length = l;
		breadth = b;
		height = h;
	}
	
	int volume(){
		return length*breadth*height;
	}
	
	boolean isEqual(Box b) {
		if(length==b.length && breadth == b.breadth && height == b.height)
			return true;
		
		return false;
	}
	
	static void displayBoxCount(){
		
		System.out.println("Box count is " + boxCount);
	}
}

public class ClassDemo {

	public static void main(String[] args) {
			System.out.println("main starts here....");
			Box blackBox;
			System.out.println("before creating box obj");
			blackBox=new Box(5,4,3);
			System.out.println("after creating box obj");
			blackBox.setDim(6,4,3);
			System.out.println("vol of black box is " + blackBox.volume());  //invoke
	
			
			Box woodBox = new Box(30,24,25);
		
			System.out.println("vol of wood box is " + woodBox.volume() ); 	
			
			woodBox.setDim(56,45,23);
			
			Box b1 = new Box(6,5,3);
			
			System.out.println("blackBox == b1 " + blackBox.isEqual(b1));
			
			Box b2 = new Box(b1);
			
			b2.length = 10;
			
			Box.displayBoxCount();
			
			
		}
 
}


