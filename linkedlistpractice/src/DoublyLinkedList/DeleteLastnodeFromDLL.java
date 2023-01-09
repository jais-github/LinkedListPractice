package DoublyLinkedList;

import java.util.NoSuchElementException;


public class DeleteLastnodeFromDLL {
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
	
	public DeleteLastnodeFromDLL() {
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
	
	//delete first node
	public ListNode deleteFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp=head;
		if(head == tail) {
			tail=null;
		}else {
			head.next.previous=null;
		}
			head=head.next;
			length--;
			return temp;	
	}
	
	//delete node in a doubly linked list
	public ListNode deleteLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode temp=tail;
		if(head == tail) {
			head=null;
		}else {
			tail.previous.next=null;
		}
		tail=tail.previous;
		temp.previous=null;
		length--;
		return temp;
	}
	public static void main(String[] args) {
		DeleteLastnodeFromDLL dll=new DeleteLastnodeFromDLL();
		dll.insetLast(12);
		dll.insetLast(23);
		
		
		dll.displayForward();
		dll.displayBackward();
		
		/*
		 * //delete node from front dll.deleteFirst(); dll.displayForward();
		 */
		
		dll.deleteLast();
		dll.displayForward();
}
}
