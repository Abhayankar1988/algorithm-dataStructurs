package com.ds.queue;

public class PriorityQueue {

	private int maxSize;
	private int[] priorityQueueArray;
	private int noOfItems;

	public PriorityQueue(int size){
		this.maxSize=size;
		this.priorityQueueArray = new int [maxSize];
		this.noOfItems = 0;
	}

	public void insert(int item){
		int j;
		if(noOfItems==0){
			priorityQueueArray[noOfItems++]= item;

		}else{

			for(j=noOfItems-1; j>=0; j--){
				if(item >priorityQueueArray[j]){
					priorityQueueArray[j+1] = priorityQueueArray[j];	
				}else{
					break;
				}
			}

			priorityQueueArray[j+1] = item;
			noOfItems++;

		}
	}

	public int remove(){
		return priorityQueueArray[--noOfItems];

	}

	public boolean isFull(){
		return (noOfItems==maxSize-1);
	}

	public boolean isEmpty(){
		return (noOfItems==0);
	}

	public static void main(String[] args) 
	{



		int x, y;
		x = 5 >> 2;
		y = x >>> 2;
		System.out.println(y);

		PriorityQueue thePQ = new PriorityQueue(5);
		thePQ.insert(40);
		thePQ.insert(30);
		thePQ.insert(20);
		thePQ.insert(50);
		thePQ.insert(80);
		while( !thePQ.isEmpty() )
		{
			long item = thePQ.remove();
			System.out.println(item + " "); // 10, 20, 30, 40, 50
		} // end while
		System.out.println(" ");
	}


}
