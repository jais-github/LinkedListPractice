package linkedlistpractice;

public class InsertionDeletion {
	Node head;
	
	class Node{
		String data;
		Node next; 
		
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}
	
	//add first
	public void addfirst(String data) {
		Node newNode = new Node(data); 
		if(head == null) {
			head = newNode;
			return ;
		}
		newNode.next = head;
		head = newNode;
		
	}
	
	//add last
	public void addLast(String data) {
		Node newNode = new Node(data); 
		if(head == null) {
			head = newNode;
			return ;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	//print the list
	public void printList() {
		if(head == null) {
		 System.out.print("List is empty");	
		 return;
		}
		
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	
	//delete from the start/first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("This list is empty");
			return;
		}
		
		head = head.next;
	}
	
	//delete from the last
	public void deleteLast() {
		if(head == null) {
			System.out.println("This list is empty");
			return;
		}
		
		
		if(head == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast =secondLast.next;
		}
		secondLast.next = null;
	}
	
	//function that will return the size
	
	public static void main(String[] args) {
		InsertionDeletion list = new InsertionDeletion();
		
		//adding from the first
		list.addfirst("a");
		list.addfirst("is");
		list.printList();
		
		//adding from the last
		list.addLast("List");
		list.printList();
		
		list.addfirst("This");
		list.printList();
		
		
		//deleting from the front
		list.deleteFirst();
		list.printList();
		
		//deleting from the last
		list.deleteLast();
		list.printList();
		
		
	}

	

}
