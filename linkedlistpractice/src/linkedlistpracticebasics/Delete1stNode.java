package linkedlistpracticebasics;



public class Delete1stNode {

private ListNode head;
	
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
	
	public ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		
		ListNode temp=head;
		head =head.next;
		temp.next=null;
		return temp;
	}
	
	public static void main(String[] args) {
		Delete1stNode sll=new Delete1stNode();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(2);
		ListNode fourth=new ListNode(11);
		
		
		  //connect all the together 
		sll.head.next=second; second.next=third;
		  third.next=fourth;
		 
		
		
		sll.display();
		System.out.println("Length of the LinkedList is: "+sll.length());
		
		//after deleting first node
		System.out.println(sll.deleteFirst().data);
		sll.display();
	}

}
