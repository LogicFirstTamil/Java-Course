package OOP;

public class OverloadingDemo2 {
	static void test(){
		System.out.println("test method with no argument");
	}
	
	static void test(int a){
		System.out.println("test method with 1 arg");
	}
	static void test(int a,int b){
		System.out.println("test method with 2 args");
	}
	public static void main(String[] args) {
		test();
		test(3,4);
		test(10);
	}
}
