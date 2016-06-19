package com.abhay.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AlternatingChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	

		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String input[]=new String[n];
        for(int i=0;i<input.length;i++)
        {
           input[i]=sc.next();
        
		char[]ch = input[i].toCharArray();
		
		ArrayList listString = new ArrayList();
		
		for(char a :ch){
			listString.add(a);
		}
		
		System.out.println(listString);
		int count =0;
		for(int k=0;k<=listString.size()-1;k++){
			if(k!=listString.size()-1){
				if(listString.get(k).equals(listString.get(k+1))){
					//listString.remove(k+1);
					count++;
				}	
			}
				
		}
		
		System.out.println(count);
	}
	
		
		List<Integer> list = new ArrayList<Integer>(); 

		list.add(new Integer(1)); 
		list.add(new Integer(2)); 
		list.add(new Integer(2)); 
		list.add(new Integer(3)); 
		list.add(new Integer(3)); 
		list.add(new Integer(2)); 
		list.add(new Integer(5)); 
		list.add(new Integer(4)); 
		list.add(new Integer(4)); 

		Set<Integer> withoutRepetition = new HashSet<Integer>(); 

		List<Integer> finalList = new ArrayList<Integer>(); 

		for(Integer intNum: list) 
		{ 
		if(!withoutRepetition.contains(intNum)) 
		{ 
		withoutRepetition.add(intNum); 
		finalList.add(intNum); 
		} 
		} 

		for(Integer intNum: finalList) 
		System.out.println(intNum); 
		} 
		}	

	

