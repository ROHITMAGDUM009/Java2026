package DSA01;

public class MaxNum {
	
	
public static void main(String[] args) {
	MaxNum max = new MaxNum();
	
	//Declare array
//	int[] arr;
	
	//Arry Careation(Memory Allocation)
//	int[] arr = new int[5];
	
	//arry initialization (Value add)
	int[] arr = {10,20,30,40,2};
	
	int max1 = arr[0];
	
	for(int i=1; i<arr.length; i++) {
		if(arr[i] > max1) {
			max1 = arr[i];
		}
	}
	System.out.println("Max = " + max1);
	
}
}
