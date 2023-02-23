package datastructurefile;

public class Queue {
	
	private ListNode front;
	private ListNode rear;
	private int length;
	
	private class ListNode {
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if(isEmpty()) {
			front = temp;
		}else {
			rear.next = temp;
		}
		rear = temp;
		length++;
		
	}
	public void print() {
		if(isEmpty()) {
			return;
		}
		ListNode current = front;
		while(current !=null) {
			System.out.print(current.data + " ->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(2);
		queue.print();
	}

}
