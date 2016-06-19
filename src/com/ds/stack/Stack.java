package com.ds.stack;

public class Stack<T extends Object> {
	
	private int maxSize;
	private T[] stackArray;
	private int top;
	
	@SuppressWarnings("unchecked")
	public Stack(int size){
		this.maxSize = size;
		this.stackArray= (T[]) new Object[maxSize];
		top=-1;
	}
	
	public Stack() {
		// TODO Auto-generated constructor stub
	}

	public void push(T j){
		stackArray[++top]= j;
	}

	public T pop(){
		return this.stackArray[top--];
	}
	
	public T peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public boolean isFull(){
		return top==maxSize-1;
	}
	
	public T maxNumber(){
		T arr[] = stackArray;
		
		T max = arr[0];
		
		for(int j=0; j<=top; j++){
			if((int)max<(int)arr[j]){
				max = arr[j];
			}
		}
		
		return max;
	}
	
	public T getItem(int postion){
		if(postion<=top)
			return stackArray[postion];
		else
		return null;	
		
		
	}
	
}
