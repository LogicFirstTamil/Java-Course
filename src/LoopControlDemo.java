import java.util.Scanner;
/*
 * Jump Statements - break,continue
 * 
 */
public class LoopControlDemo {

	public static void main(String[] args) {
		
		outer:
		for(int i=1;i<=5;i++) {
			inner:
			for(int j=1; j<=5; j++) {
				if((i==2 && j==2) ||  (i==4 && j==2) || (i==3 && j==4)) {
					System.out.print("\n");
					continue outer;
				}
				System.out.print("*");
			}
			System.out.print("\n");
	
		}
		
			
	}

}
