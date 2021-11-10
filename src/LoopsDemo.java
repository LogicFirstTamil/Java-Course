import java.util.Scanner;
public class LoopsDemo {
	public static void main(String args[]) {
		int i=1;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many stars do you want ");
		n = scanner.nextInt();	
		
		do{
			System.out.print("*");
			i++;
		}while(i<=n);
	}
}
