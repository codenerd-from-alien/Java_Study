package datastructurefile;


public class SinglyLinked_List {
	
	private ListNode head = null;
	
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
	
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		
		if(head ==null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while(null != current.next) {
			current = current.next; // 앞에 있는 헤드 값에서 최근 노드 객체에서
		}							// current 넥스트는 이미 null 값을 가르키기 전 노드를 가르키는 값은 저장
		current.next = newNode; // 이미 널을 가르키기는 직전 값의 current.next를 새롭게 끝에 삽입한 노드를 할당
	}
	
	public void insert(int position, int value) {
		ListNode node = new ListNode(value);
		if(position == 1) {
			node.next = head;
			head = node;
			return;
		}else {
			ListNode previous = head;
			int count =1;
			
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			
			ListNode current = previous.next; //만약 현재 previous가 head 정보를 담고 있으면 헤드 다음 객체 정보를 할당
			previous.next = node; // 현재 previous 변수에 head가 들어 있으면 새로 들어온 노드를 넣음
			node.next = current; //node 객체안에 next 생성자에서는 방금전 커런트가 가리킨 노드 객체 값을 할당
		}
		
		
		
		
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
		
		
		
		
		
		sll.insertFirst(11);
		sll.insertFirst(10);
		sll.insertLast(1);
		
		sll.insert(2, 7);
		
		
		
		
		
		
		
		sll.display();
		System.out.println("Singly List의 길이 " + sll.length());
		
		
	}

}
