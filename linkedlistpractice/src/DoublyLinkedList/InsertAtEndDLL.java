package DoublyLinkedList;



public class InsertAtEndDLL {
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public InsertAtEndDLL() {
		this.head=head;
		this.tail=tail;
		this.length=length;
		
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public int length() {
		return length;
	}
	
	public void displayForward() {
		if(head == null) {
			return;
		}
		
		ListNode temp=head;
		while(temp != null) {
			System.out.print(temp.data+" -->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public void displayBackward() {
		if(tail == null) {
			return;
		}
		
		ListNode temp=tail;
		while(temp != null) {
			System.out.print(temp.data+" -->");
			temp=temp.previous;
		}
		System.out.println("null");
	}
	
	//insert in the beg
	public void insertFirst(int value) {
		ListNode newNode =new ListNode(value);
		if(isEmpty()) {
			tail=newNode;
		}else {
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}
	
	public void insetLast(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			head=newNode;
		}else {
			tail.next=newNode;
			newNode.previous=tail;
		}
		tail=newNode;
		length++;
	}
	public static void main(String[] args) {
		InsertAtEndDLL dll=new InsertAtEndDLL();
		dll.insetLast(12);
		dll.insetLast(23);
		
		
		dll.displayForward();
		dll.displayBackward();
}
}