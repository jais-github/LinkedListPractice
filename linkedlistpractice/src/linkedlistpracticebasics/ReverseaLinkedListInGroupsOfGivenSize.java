  package linkedlistpracticebasics;

import java.util.LinkedList;

import linkedlistpracticebasics.LL.Node;

public class ReverseaLinkedListInGroupsOfGivenSize {
	static Node head;
	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=next;
		}
	}

	//addlast
	public void addLast(int data) {
		Node newNode =new Node(data);
		if(head == null) {
			head =newNode;
			return;
		}
		
		Node currNode= head;
		
		while(currNode.next != null) {
			currNode=currNode.next;
		}
		
		currNode.next=newNode;
	}
	
	//reverse
	 public static  Node reverse(Node node, int k)
	    {
	        Node newHead=node;
	        Node prev =null;
	        Node next =null;
	        Node curr=node;
	        int count =0;
	        
	        while(curr!=null && count <k){
	            next=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=next;
	            count++;
	            
	        }
	        if(node != null){
	            newHead.next=reverse(next,k);
	        }
	        return prev;
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
		ReverseaLinkedListInGroupsOfGivenSize list = new ReverseaLinkedListInGroupsOfGivenSize();
       list.addLast(1);
       list.addLast(2);
       list.addLast(2);
       list.addLast(4);
       list.addLast(5);
       list.addLast(6);
       list.addLast(7);
       list.addLast(8);
       
       int k =4;
       
        System.out.println("Given linked list");
       
        list.printList();

        list.reverse(head,k);
        
        System.out.println("");
        System.out.println("Reversed linked list ");
        
        list.printList();

	}

}
