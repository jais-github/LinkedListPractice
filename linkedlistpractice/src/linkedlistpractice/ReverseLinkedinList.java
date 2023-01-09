package linkedlistpractice;

import linkedlistpracticebasics.LL.Node;

public class ReverseLinkedinList {

	
		static Node head;
		
		static class Node{
			int data;
			Node next;
			
			Node(int i){
				data = i;
				next = null;
			}
		}
		
		// add at start 
		public void adFirst(String data) {
			Node newNode= new Node(0);
			
			if(head == null) {
				head = newNode;
				return;
			}
			
			newNode.next = head;
			head=newNode;
		}
		
		//add Last
		public void addLast(int i) {
			Node newNode =new Node(i);
			if(head == null) {
				head =newNode;
				return;
			}
			
			Node currNode= head;
			
			while(currNode.next!=null) {
				currNode=currNode.next;
			}
			
			currNode.next=newNode;
		}
	public	void  reverse () {
			Node prev = null;
			Node currNode = head.next;
			Node next = null;
			
			if(head == null || head.next == null) {
				return;
			}
			
			while(currNode != null) {
				next = currNode.next;
				currNode.next=prev;
				prev = currNode;
				currNode = next;
			}
			head.next=null;
			head = prev;
		}
		
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
			
			ReverseLinkedinList list = new ReverseLinkedinList(); 
			 list.addLast(1);
			 list.addLast(2);
			 list.addLast(3);
			 list.addLast(4);
			 list.printList();
			  
			 list.reverse();
			 list.printList();
	}

}
