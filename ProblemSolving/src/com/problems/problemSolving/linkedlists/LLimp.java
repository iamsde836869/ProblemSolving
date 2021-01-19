package com.problems.problemSolving.linkedlists;
import java.io.*; 

//Java program to implement 
//a Singly Linked List 
public class LLimp { 

	Node head; // head of list 

	// Linked list Node. 
	// This inner class is made static 
	// so that main() can access it 
	static class Node { 

		int data; 
		Node next; 

		// Constructor 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	  public void deleteDuplicates() {
          Node curr = head; 
     while (curr != null) { 
          Node temp = curr; 
          while(temp!=null && temp.data==curr.data) { 
             temp = temp.next;  
         } // the last ouccurence of the linkedlist
         curr.next = temp; 
         curr = curr.next; //traversing the linkedlist
     } 
     //return head;
 }
	// Method to insert a new node 
	public static LLimp insert(LLimp list, int data) 
	{ 
		// Create a new node with given data 
		Node new_node = new Node(data); 
		new_node.next = null; 

		// If the Linked List is empty, 
		// then make the new node as head 
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			// Else traverse till the last node 
			// and insert the new_node there 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			// Insert the new_node at last node 
			last.next = new_node; 
		} 

		// Return the list by head 
		return list; 
	} 
	

	// Method to print the LLimp. 
	public static void printList(LLimp list) 
	{ 
		Node currNode = list.head; 

		System.out.print("LLimp: "); 

		// Traverse through the LLimp 
		while (currNode != null) { 
			// Print the data at current node 
			System.out.print(currNode.data + " "); 

			// Go to next node 
			currNode = currNode.next; 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LLimp list = new LLimp(); 

		// 
		// ******INSERTION****** 
		// 

		// Insert the values 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8);
		list = insert(list, 8);
        list.deleteDuplicates(); 

		// Print the LLimp 
		printList(list); 
	} 
} 
