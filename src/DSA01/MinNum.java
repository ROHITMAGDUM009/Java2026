package DSA01;

public class MinNum {

	public static void main(String[] args) {
		
		int arr[] = {22,25,40,10,5,16};

		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min = " + min);
		//Min = 5

	}

}
