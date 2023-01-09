package linkedlistpracticebasics;

public class LL {
	Node head;
	public class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=next;
		}
	}
	
	// add at start 
	public void adFirst(String data) {
		Node newNode= new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head=newNode;
	}
	
	//add Last
	public void addLast(String data) {
		Node newNode =new Node(data);
		if(head == null) {
			head =newNode;
			return;
		}
		
		Node currNode= head;
		
		while(currNode.next==null) {
			currNode=currNode.next;
		}
		
		currNode.next=newNode;
	}
	
	//delete first
	public void deleteFirst(){
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		head=head.next;
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		if(head.next == null) {
			head=null;
			return;
		}
		Node secondLast=head;
		Node LastNode=head.next;
		while(LastNode.next != null) {
			LastNode=LastNode.next;
			secondLast=secondLast.next;
		}
		secondLast.next=null;
		
	}
	//print 
	public void printList() {
		if(head==null) {
			System.out.println("List is emppty");
		}
     Node currNode= head;
		
		while(currNode!=null) {
			System.out.print(currNode.data+" ->");
			currNode=currNode.next;
		}
		
		System.out.println("NULL");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list=new LL();
		list.adFirst("I");
		list.adFirst("have");

		list.printList();
		
		list.addLast("a");
	//	list.addLast("list");
		
		list.printList();
		list.deleteFirst();
		list.printList();
	}

}
