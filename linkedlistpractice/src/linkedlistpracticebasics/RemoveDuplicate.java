package linkedlistpracticebasics;


public class RemoveDuplicate {
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
	public static void main(String[] args) {
		RemoveDuplicate sll=new RemoveDuplicate();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(2);
		ListNode fourth=new ListNode(11);
		
		
		  //connect all the together 
		sll.head.next=second; second.next=third;
		  third.next=fourth;
		 
		
		
		sll.display();
		System.out.println("Length of the LinkedList is: "+sll.length());
		
		/*
		 * //after deleting first node System.out.println(sll.deleteFirst().data);
		 * sll.display();
		 */
		
		/*
		 * //after deleting last node System.out.println(sll.deleteLast().data);
		 * sll.display();
		 */
		
		/*//deleting a node from any position
		sll.delete(1);
		sll.display();*/
		
		
		/*//search a key
		try {
			if(sll.find(head, 1)) {
				System.out.println("Search key found!!");
			}else {
				System.out.println("Search key not found");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		//remove duplicate
		sll.removeDuplicates();
		sll.display();
			}

}