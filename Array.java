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
		//List<Integer> lst = Arrays.asList(arr);자바 배열을 매개변수로 받았을 때에 리스트형으로 변환을 하는 방법을 찾아 봐야함
		
		for(int i =0; i < lst.size(); i++) {
			
			if(lst.get(i) % 2==0) {
				
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array Data Structure
		Array arr = new Array();
		arr.arrayDemo();		
	}


}
