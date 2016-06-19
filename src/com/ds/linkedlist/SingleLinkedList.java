package com.ds.linkedlist;

public class SingleLinkedList<T extends Object> {

	public T item;

	public Link<T> first;

	public SingleLinkedList(T item){
		this.item = item;
		this.first = null;
	}

	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public void insertFirst(T key){
		Link<T> newLink = new Link<T>(key);

		newLink.next = first;
		first = newLink;
	}

	public Link<T> deleteFirst(){
		Link<T> temp = first;

		first.next = first;

		return temp;
	}

	public Link<T> find (T key){
		Link<T> current = first;
		while(current.data!=key){
			if(current.next==null){
				return null;
			}else{
				current = current.next;
			}
		}		
		return current;
	}

	public Link<T> deleteNode(T key){
		Link<T> current = first;
		Link<T> previous = first;

		while(current.data!=key){
			if(current.next==null){
				return null;
			}else{
				previous = current ;
				current  =current.next;

			}
		}

		if(current==first){
			first = first.next;
		}else{
			previous.next = current.next;
		}

		return current;

	}

	public  Link<T> deletePosition(int value){

		int count =0;
		Link current = first;
		Link previous = null;
		if(value==0){
			first = current.next;
			return first;
		}
		
		while(current!=null && value>count){
			previous = current;
			current = current.next;
			++count;
		}

		if(current == first){
			current = first.next;
		}else{
			previous.next = current.next;
		}

		return current;
	}

	
	public void display (Link head){
		Link current = head;
		
		while(current!= null){
			System.out.print(current.data + " ");
			current =current.next;
		}
		
		System.out.println("");
		
	}
	
	public int getCount(Link head){
		int count =0;
		Link current = head;
		
		while(current!= null){
			++count;
			current = current.next;
		}
		return count;
		
		
	}
	
	public int recursiveGetCount(Link head){
		
		if(head==null){
			return 0;
		}
		
		return 1+ recursiveGetCount(head.next);
	}
	
	public Link reverse(Link head){
		
		Link current = head;
		Link next= null;
		Link prev = null;
		
		while(current!=null){
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		return prev;
	}

	public static void main (String args[]){

		SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();

		list.insertFirst(10);
		list.insertFirst(9);
		list.insertFirst(8);
		list.insertFirst(7);
		list.insertFirst(6);
		list.insertFirst(5);
		list.insertFirst(4);
		list.insertFirst(3);list.insertFirst(2);
		list.insertFirst(1);
		
		list.display(list.first);
		
		list.deleteNode(6);
		
		System.out.println("After deletion  Node 6");
		
		list.display(list.first);
		
		System.out.println("After deletion value position at 6");
		
		list.deletePosition(3);
		
		list.display(list.first);
		
		System.out.println(list.getCount(list.first));
		
		System.out.println(list.recursiveGetCount(list.first));
		
		Link node = list.reverse(list.first);
		list.display(node);
		
		
	}


}
