package com.ds.stack;

import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		int number = scan.nextInt();
		Stack<Integer> stack = new Stack<Integer>(number);
		for(int i =0; i<number+1; i++ ){
			int operation = scan.nextInt();
			if(operation==1){
				if(!stack.isFull()){
					stack.push(scan.nextInt());		
				}
			}else if(operation==2){
				if(!stack.isEmpty()){
					stack.pop();	
			}		
			}else if(operation==3){	
				System.out.println(stack.maxNumber());
			}
		}
	}
	
	

}
