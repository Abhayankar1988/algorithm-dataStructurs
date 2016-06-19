package com.ds.queue;

import com.ds.binarytree.Node;

public class Queue<T extends Object> {

	private int noOfItems;
	private int maxSize;
	private T[] queueArray;
	private int front;
	private int rear;
	
	public Queue(int size){
		this.maxSize = size;
		this.queueArray = (T[]) new Object[size];
		this.front=0;
		this.rear=-1;
		this.noOfItems=0;
	}
	
	public Queue() {
		// TODO Auto-generated constructor stub
	}

	public void enqueue(T val){
		if(rear== maxSize-1){
			rear =-1;
		}
		queueArray[++rear] = val;
		noOfItems++;
	}
	
	public T dequeue(){
		if(front==maxSize){
			front=0;
		}
		noOfItems--;
		return queueArray[front++];
	
	}
	public boolean isEmpty(){
		return noOfItems==0;
	}
	
	public boolean isFull(){
		return noOfItems==maxSize;
	}
	
	public int size(){
		return noOfItems;
	}

	public Node poll() {
		
		return (Node) queueArray[front];
	}
	
}
