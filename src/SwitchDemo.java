import java.util.Scanner;
/*
 * Switch statement, if else -> selection statements
 * 
 */
public class SwitchDemo {

	public static void main(String[] args) {
			int a,b;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter First Number: ");
			a = scanner.nextInt();
			System.out.println("Enter Second Number: ");
			b = scanner.nextInt();
			char operator;
			System.out.println("Enter the operator +,-,*,/ or % : ");
			operator = scanner.next().charAt(0);
			
			switch(operator) {	
			case '+':
				System.out.println(a + " + " + b + " = " + (a+b));
				break;
			case '-':
				System.out.println(a + " - " + b + " = " + (a-b));
				break;
			case '*':
				System.out.println(a + " * " + b + " = " + (a*b));
				break;
			case '/':
				System.out.println(a + " / " + b + " = " + (a/b));
				break;
			case '%':
				System.out.println(a + " % " + b + " = " + (a%b));
				break;
			default:
				System.out.println("You have entered incorrect operator");
			
			}
			
			
			
	}

}
