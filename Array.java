package datastructurefile;

public class Array {

	public void arrayDemo() {
		int []myArray = new int[5];
		myArray[0] = 5;
		myArray[1] = 1;
		myArray[2] = 8;
		myArray[3] = 2;
		myArray[4] =10;
		print(myArray);
	}
	
	public void print(int arr[]) {
		int n = arr.length;
		for(int i =0; i < n; i++) {
			System.out.print(arr[i] + " ");
			System.out.println();
		}
	}
	
	public void remove_even_integer(int arr[]) {
		int oddCount =0;
		for(int i =0; i < arr.length; i++) {
			if(arr[i] % 2 ==0) {
				oddCount++;
			}
		}
		
		int[] result =  new int[oddCount];
		int idx = 0;
		for(int i =0; i < arr.length; i++) {
			if(arr[i] % 2 !=0) {
				result[idx] = arr[i];
				idx++;
			}
		}
		for(int i =0; i < oddCount;i++) {
			System.out.println(result[i]);
		}
		
		
		
	}
	
	public int findMinimum(int[] arr) {
		//edge
		if(arr == null || arr.length ==0) {
			throw new IllegalArgumentException("Invalid");
		}
		int min = arr[0];
		for(int i =1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	
	
	public static void print_rvs_array(int numbers[], int start, int end) {
		while(start < end) {
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array Data Structure
		Array arr = new Array();
		arr.arrayDemo();	
		int[] numbers = {2,11,5,10,7,8};
		print_rvs_array(numbers, 0 , numbers.length - 1);
		System.out.println("----------------------------");
		
		Array arr2 = new Array();
		arr2.print(numbers);
		
	}


}
