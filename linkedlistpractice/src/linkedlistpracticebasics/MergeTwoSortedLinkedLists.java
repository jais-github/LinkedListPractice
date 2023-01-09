package linkedlistpracticebasics;

import linkedlistpracticebasics.LL.Node;

public class MergeTwoSortedLinkedLists {
private static ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data + "--> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public int length() {
		if(head == null) {
			return 0;
		}
		int count=0;
		ListNode current=head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	//to insert a node in the beg
	public void insertFirst(int value) {
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	//to insert a node in the last
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return;
		}
		ListNode current=head;
		while(null != current.next) {
			current=current.next;
		}
		current.next=newNode;
	}
	
	//to delete the first noode
	public ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		
		ListNode temp=head;
		head =head.next;
		temp.next=null;
		return temp;
	}
	
	//delete last node
	public ListNode deleteLast() {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode current=head;
		ListNode previous =head;
		
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next=null;
		return current;
	}
	 //delete from any position
	public void delete(int position) {
		if(position == 1) {
			head=head.next;
		}else {
			ListNode previous = head;
			int count=1;
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next=current.next;
		}
	}
	
	//search a node in alinked list
	public boolean find(ListNode head,int searchkey) {
		if(head == null) {
			return false;
		}
		
		ListNode current=head;
		while(current != null) {
			if(current.data == searchkey) {
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
	//Remove Duplicates
	public void removeDuplicates() {
		if(head==null) {
			return;
		}
		
		ListNode current=head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
			current.next=current.next.next;
		}else {
			current=current.next;
		}
	}
	}
	
	// insert a node in sorted linked list
	public ListNode insertInSortedList(int value) {
		ListNode newNode = new ListNode(value);
		
		if(head == null) {
			return newNode;
		}
		
		ListNode current=head;
		ListNode temp=null;
		
		while(current!= null && current.data < newNode.data) {
			temp=current;
			current=current.next;
		}
		newNode.next=current;
		temp.next=newNode;
		return head;
	}
	
	//remove given key from singly linked list
	public void deleteNode(int key) {
		ListNode current=head;
		ListNode temp=null;
		
		if(current !=null && current.data != key) {
			temp=current;
			current=current.next;
		}
		
		if(current == null) {
			return;
		}
		
		temp.next=current.next;
	}
	
	//contains a loop or not
	public boolean conatainsLoop() {
		ListNode fastPtr=head;
		ListNode slowPtr=head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			
			if(slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}
	
	//starting of the node
	public ListNode startNodeInALoop() {
		ListNode fastPtr=head;
		ListNode slowPtr=head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			
			if(slowPtr == fastPtr) {
				return getStartingNode(slowPtr);
			}
		}
		return null;
	}
	
	private ListNode getStartingNode(ListNode slowPtr) {
	ListNode temp=head;
	while(temp != slowPtr) {
		temp=temp.next;
		slowPtr=slowPtr.next;
		
	}
	return temp; //starting node of the loop
	}
	
	public void createLoopInLinkedList() {
		ListNode first =new ListNode(1);
		ListNode second =new ListNode(2);
		ListNode third =new ListNode(3);
		ListNode fourth =new ListNode(4);
		ListNode fifth =new ListNode(5);
		ListNode sixth =new ListNode(6);
		
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=third;
	}
	
	//method to remove loop
	public void removeLoop() {
		ListNode fastPtr=head;
		ListNode slowPtr=head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			
			if(slowPtr == fastPtr) {
				removeLoop (slowPtr);
				return;
			}
		}	
	}
	
	private void removeLoop(ListNode slow) {
		ListNode temp=head;
		while(temp.next != slow.next) {
			temp=temp.next;
			slow=slow.next;
			
		}
		slow.next=null;
		
	}
	
	//to merge the two linked lists
	public static ListNode merge(ListNode a, ListNode b) {
		ListNode dummy=new ListNode(0);
		ListNode tail=dummy;
		
		while(a != null && b != null) {
			if(a.data <= b.data) {
				tail.next=a;
				a=a.next;
			} else {
				tail.next=b;
				b=b.next;
			}
			tail=tail.next;
		}
		if(a == null) {
			tail.next=b;
		} else {
			tail.next=a;
		}
		
		return dummy.next;
	}
	public static void main(String[] args) {
		MergeTwoSortedLinkedLists sll=new MergeTwoSortedLinkedLists();
		sll.insertLast(1);
		sll.insertLast(4);
		sll.insertLast(8);
		sll.insertLast(6);
		
		
		  MergeTwoSortedLinkedLists sl2=new MergeTwoSortedLinkedLists();
		  sl2.insertLast(3); sl2.insertLast(5); sl2.insertLast(9); sl2.insertLast(13);
		  sl2.insertLast(19); sl2.insertLast(29);
		 
		
		sll.display();
		sl2.display();
		
		MergeTwoSortedLinkedLists result=new MergeTwoSortedLinkedLists();
		result.head=merge(sll.head,sl2.head);
		
		result.display();
		
		
		 
}
}