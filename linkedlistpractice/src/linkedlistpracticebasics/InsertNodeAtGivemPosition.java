package linkedlistpracticebasics;



public class InsertNodeAtGivemPosition {

private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void insert(int position, int value) {
		ListNode node=new ListNode(value);
		
		if(position == 1) {
			node.next=head;
			head=node;
		}
		else {
			ListNode previous=head;
			int count=1;
			
			while(count < position - 1) {
				previous =previous.next;
				count++;
			}
			ListNode current =previous.next;
			previous.next=node;
			node.next=current;
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
	public static void main(String[] args) {
		InsertNodeAtGivemPosition sll=new InsertNodeAtGivemPosition();
		
		  sll.head=new ListNode(10); 
		  ListNode second=new ListNode(1); 
		  ListNode third=new ListNode(2); 
		  ListNode fourth=new ListNode(11);
		  
		  //connect all the together sll.head.next=second; second.next=third;
		  third.next=fourth;
		  
		  sll.display();
		 
		
		//to insert at given position
		sll.insert(1, 3); //3-->null
		sll.insert(2, 5); //3-->5-->null
		sll.insert(1, 2); //2-->3-->5-->null
		sll.insert(2, 4); //2-->4-->3-->5-->null
		sll.display();
	}

}
