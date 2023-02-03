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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array Data Structure
		Array arr = new Array();
		arr.arrayDemo();		
	}


}
