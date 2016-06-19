package com.ds.stack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author abchaubey
 *
 *
		 *There are NN plants in a garden. Each of these plants has been added with some amount of pesticide. 
		 *After each day, if any plant has more pesticide than the plant at its left, being weaker than the left one, it dies.
		 * You are given the initial values of the pesticide in each plant. Print the number of days after which no plant dies, 
		 * i.e. the time after which there are no plants with more pesticide content than the plant to their left.

 */
public class PoisonousPlant {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean flag = false;
		int number = scan.nextInt();
		
		Stack<Integer> intStack = new Stack<Integer>(number);
		
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		
		for(int i=0; i<number; i++){
			intStack.push(scan.nextInt());		
		/*	intArray.add(scan.nextInt());*/
		}
		
		for(int j=0; j<number-1; j++){
			if(j<number-1 && intStack.getItem(j+1)>intStack.getItem(j) ){
				intStack.pop();
			}
		}
		/*
		for(int j=0, k=0; j<intArray.size()-1;j++,k++){
			System.out.println("k "  +   intArray.get(k)  +   "  k+1  "   + intArray.get(k+1) + " size "  + intArray.size());
			if(j<=number-1 && intArray.get(k+1)>intArray.get(k) ){
				intArray.remove(j+1);
				//j = j-1;
			}
		}
		
		for(int ws  : intArray ){
			System.out.println(ws);
		}*/
	}

}
