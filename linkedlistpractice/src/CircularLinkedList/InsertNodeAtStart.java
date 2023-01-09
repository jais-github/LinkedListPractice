package CircularLinkedList;


public class InsertNodeAtStart {
	private ListNode last;
	private int length;
	
	private class ListNode{
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public InsertNodeAtStart() {
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
	public static void main(String[] args) {
		InsertNodeAtStart scll=new InsertNodeAtStart();
		scll.insertFirst(10);
		scll.insertFirst(14);
		scll.display();
		
		
	}

}
