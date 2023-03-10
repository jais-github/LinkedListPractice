package CircularLinkedList;

import java.util.NoSuchElementException;

public class RemoveFirstNode {
	private ListNode last;
	private int length;
	
	private class ListNode{
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public RemoveFirstNode() {
		last=null;
		length=0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	//to create 
	public void creteCircularLinkedList() {
		ListNode first=new ListNode(1);
		ListNode sec=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		
		first.next=sec;
		sec.next=third;
		third.next=fourth;
		fourth.next=first;
		
		last=fourth;
	}
	
	//print
	public void display() {
		if(last == null) {
			return;
		}
		
		ListNode first=last.next;
		while(first != last) {
			System.out.print(first.data +" ");
			first=first.next;
		}
		System.out.println(first.data);
	}
	
	public void insertFirst(int data) {
		ListNode temp=new ListNode(data);	
		if(last == null) {
			last=temp;
		}else {
			temp.next=last.next;
		}
		last.next=temp;
		length++;
	}
	
	//insert node at the end
	public void insertLast(int data) {
		ListNode temp=new ListNode(data);
		if(last == null) {
			last=temp;
			last.next=last;
		}else {
			temp.next=last.next;
			last.next=temp;
			last=temp;
		}
		length++;
	}
	
	
	public ListNode removefirst() {
		if(isEmpty()) {
			throw new NoSuchElementException("Circularly Singly Linked List is already empty");
		}
		
		ListNode temp=last.next;
		if(last.next == last) {
			last=null;
		}else {
			last.next=temp.next;
		}
		temp.next=null;
		length--;
		return temp;
	}
	public static void main(String[] args) {
		RemoveFirstNode scll=new RemoveFirstNode();
		scll.insertLast(1);
		scll.insertLast(23);
		scll.insertLast(45);
		
		scll.display();
		
		scll.removefirst();
		scll.display();
	}

}
