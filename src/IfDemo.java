import java.util.Scanner;

/*
 *   >=90  - A
 *   80 - 89    - B
 *   70 - 79   - C
 *   60 - 69   - D
 *   <60 - E
 * 
 */

public class IfDemo {

	public static void main(String[] args) {
		int mark;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks (0-100): ");
		mark = scanner.nextInt();
		
		if(mark >= 90)
			System.out.println("Grade A");
		else if(mark >= 80 )
			System.out.println("Grade B");
		else if(mark >= 70)
			System.out.println("Grade C");
		else if(mark >= 60)
			System.out.println("Grade D");
		else
			System.out.println("Grade E");
	}

}
