package com.geeksforgeek.basic;

import java.util.Scanner;

import com.ds.linkedlist.Link;



public class ReverseLinkedList {

	Link first;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();

			for(int j=0; j<size; j++){
				Link newNode = new Link(scan.nextInt());
				reverseLinkedList.insert(newNode);
			}

			//reverseLinkedList.display();

			Link node = reverseLinkedList.reverse(reverseLinkedList.first,  scan.nextInt());

			display(node);
		}	
	}

	private static void display(Link node) {

		Link current = node;

		while(current!=null){
			System.out.print(current.data + " ");
			current= current.next;
		}



	}

	private Link reverse(Link head, int nextInt) 
	{
		Link current = head;
		Link next = null;
		Link prev = null;

		int count = 0;

	//	Reverse first k nodes of linked list 
		while (count < nextInt && current != null) 
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		/*next is now a pointer to (k+1)th node 
		Recursively call for the list starting from current.
		And make rest of the list as next of first node */
		if (next != null) 
			head.next = reverse(next, nextInt);

				// prev is now head of input list
		return prev;
	}  


private void display() {
	Link current = first;

	while(current!=null){
		System.out.print(current.data + " ");
		current= current.next;
	}

}

private  void insert(Link newNode) {

	if(first==null){
		newNode.next = first;
		first = newNode;	
	}else{
		Link current = first;
		while(current.next!=null){
			current = current.next;
		}

		current.next = newNode;



	}

}

}


