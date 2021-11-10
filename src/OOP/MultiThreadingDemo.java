package OOP;

/*
 * 
 * MultiThreading
 * 
 */


class Num extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException { //thread
		Runnable book = () ->
				{
						for(int i=1;i<=5;i++) {
							System.out.println("Updating Db");
							try {Thread.sleep(2000);} catch (InterruptedException e) {}
						}
				};
		Num num = new Num();
		
		Thread t1 = new Thread(book);
		//book.updateDb();
		t1.setName("book1");

		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority()); 
		
		
		t1.start(); //run
		
		num.start();
		
		/*
		if(book.isAlive()) {
			System.out.println("Still executing");
		}
		
		book.join();
		num.join();
		if(book.isAlive()) {
			System.out.println("Still executing");
		}
		
		
		System.out.println("Bye..");
		*/
	}

}
