package DSA01;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] arr = {20,10,55,40,20};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			
		}
		
		System.out.println("Sum = " + sum);
		// Output= Sum = 145

	}

}
