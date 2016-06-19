package com.ds.stack;

/**
 * @author abchaubey
 *
 *Create a data structure twoStacks that represents two stacks. Implementation of twoStacks should use only one array, i.e., 
 *
 *both stacks should use the same array for storing elements. Following functions must be supported by twoStacks.

			push1(int x) –> pushes x to first stack
			push2(int x) –> pushes x to second stack
			
			pop1() –> pops an element from first stack and return the popped element
			pop2() –> pops an element from second stack and return the popped element
			
			Implementation of twoStack should be space efficient.
 */
public class TwoStacks {
	
	public int top1;
	public int top2;
	
	public int [] stackarray;
	
	public int maxSize;
	
	public TwoStacks(int size){
		this.top1=-1;
		this.top2=size;
		this.stackarray = new int[size];
		this.maxSize=size;
	}
	
	
	public void push1(int x){
		if(top1<top2-1){
			stackarray[++top1] = x;
		}else{
			System.out.println("Stack Overflow");
		}
	}
	
	public void push2(int x){
		if(top1 < top2-1){
			stackarray[--top2] = x;
		}else{
			System.out.println("Stack Overflow");
		}
	}
	
	public int pop1(){
		if(top1>=0){
			return stackarray[top1--];
		}else{
			System.out.println("Empty Stack");
			return 9999;
		}
		
	}
	
	public int pop2(){
		if(top2<maxSize){
			return stackarray[top2++];
		}else{
			System.out.println("Empty Stack");
			return 9999;
		}
		
	}

	public static void main(String[] args) {
		
		TwoStacks ts = new TwoStacks(10);
		ts.push1(5);
	    ts.push2(10);
	    ts.push2(15);
	    ts.push1(11);
	    ts.push2(7);
	    
	    System.out.println("Pop from stack1 " + ts.pop1());
	    
	    ts.push2(40);
	    
	    System.out.println("Pop from stack2 " + ts.pop2());
		

	}

}
