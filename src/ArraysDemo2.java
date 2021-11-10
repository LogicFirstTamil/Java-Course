import java.util.Scanner;

public class ArraysDemo2 {

	public static void main(String[] args) {

		int[] a = new int[6];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 6 elements of the array: ");
		
		for(int i=0;i<a.length;i++)
			a[i]=scanner.nextInt();
		
		//a[0] a[1] a[2] a[3] a[4] a[5]
		
		for(int x:a)
			System.out.println(x);
	}

}
