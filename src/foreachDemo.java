
public class foreachDemo {
	public static void main(String[] args) {
		int arr[] = {5,6,4,3,6,7};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		for(int j: arr) { //foreach
			sum += j;
		}
		
		System.out.println("sum is " + sum);
	}
}
