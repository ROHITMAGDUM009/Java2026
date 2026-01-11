package DSA01;

public class LinearSearch_Program {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40};
		
		int key = 30;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				found = true;
				System.out.println("Found at index " + i);
				// Output = Found at index 2
				break;
			}
		}
		
		if (!found) {
			System.out.println("Not Found");
		}
	}
}
