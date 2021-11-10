package OOP;

import java.io.*;
import java.util.Scanner;

/*
 * Exception handling
 * 
 */
public class ExceptionDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=3;
		int c=0;
	
		try {
			int arr[] = null;
			//System.out.println(arr[1]);
			c=a/b; //throw
			System.out.println("try block");
			
			
			
		}
		
		catch(ArithmeticException | NullPointerException e) { //java 1.7
			System.out.println("Exception has occurred");
		}
		
		catch(Exception e) {
			System.out.println("Error occurred");
		}
		finally {
			System.out.println("This gets printed no matter what");
		}
		
		//checked exception
		File file = new File("abc.txt");
		try {
			FileInputStream fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		System.out.println(c);
		System.out.println("End of program");
		
		/*int i=0;
		try(Scanner scanner = new Scanner(System.in)) //try with resource
		{
			
		i = scanner.nextInt();
		
		}*/
		
		//System.out.println(i);
		//Account
		
		double bal = 500, withdraw = 700;
		
		try {
		if(bal<withdraw)
			throw new InsufficientFundException(withdraw-bal);
		}
		catch(InsufficientFundException e) {
			System.out.println("Not enought money");
		}

	}

}
