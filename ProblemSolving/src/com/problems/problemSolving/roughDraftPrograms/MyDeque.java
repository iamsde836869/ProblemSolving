package com.problems.problemSolving.roughDraftPrograms;

public class MyDeque<E> {
	Node<E> head, tail;
	public static class Node<E>{
	E data;
	Node<E> next,prev;
	public Node(E data) {
		this.data=data;
		this.next=this.prev=null;
	}
  }
	public void addToHead(E data) {
		Node<E> toAdd=new Node<E>(data);
		if(head==null) {
			head=tail=toAdd;
		return;
		}
			
				head.prev=toAdd;
				toAdd.next=head;
				head=toAdd;
			
		
	}
	public void addToTail(E data) {
		Node<E> toAdde=new Node<E>(data);
		if(tail==null && head==null) {
			head=tail=toAdde;
		return;
		}
			tail.next=toAdde;
			toAdde.prev=tail;
			tail=toAdde;	
			 System.out.println("Tail.next value is:" + tail.next);
			
		
	}
	public E removeLast() {
		if(head==null) {
			return null;
		}
		if(head==tail) {
			return null;
		}
		Node<E> toRemove=tail;
		tail=tail.prev;
		tail.next=null;
		return toRemove.data;
		
		
			 
			
		
	}
	public E removeFirst() {
		if(head==null) {
			return null;
		}
		if(head==tail) {
			return null;
		}
		Node<E> toRemove=head;
		head=head.next;
		head.prev=null;
		return toRemove.data;
		
		
			 	
	
	}
	 public void display() {  
	        //Node current will point to head  
	        Node<E> current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        while(current != null) {  
	            //Prints each node by incrementing the pointer.  
	  
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	        System.out.println();  
	    }  
}
