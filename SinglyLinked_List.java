package datastructurefile;


public class SinglyLinked_List {
	
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;//다음 데이터를 가르킬 포인터 담을 변수
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + "---->" );
			current = current.next;
		}
		System.out.println("Null 값");
	}
	
	public int length() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinked_List sll = new SinglyLinked_List();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
		System.out.println("Singly List의 길이 " + sll.length());
		
		
	}

}
