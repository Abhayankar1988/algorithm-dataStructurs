package com.abhay.hackerrank;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GemStones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		 String noOfStones = in.nextLine();
		 Set<Character> unique = new TreeSet<Character>(); 
		 Set<Character> common = new TreeSet<Character>();
		 for(int i =0;i<Integer.parseInt(noOfStones);i++){
			 if(i>0){
				 String secondInput = in.nextLine();
				 for(int j=0;j<secondInput.length();j++){
					 common.add(secondInput.charAt(j));
				 }
				 unique.retainAll(common);
				 common = new TreeSet<Character>();
			 }
			 else{
				 String input = in.nextLine().toLowerCase();
				 for(int j =0;j<input.length();j++){
					 unique.add(input.charAt(j));
				 }
			 }
		 }
		 
		 System.out.println(unique.size());
	}
}
