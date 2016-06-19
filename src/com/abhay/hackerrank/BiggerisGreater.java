package com.abhay.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BiggerisGreater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		
		Set<Character> common = new TreeSet<Character>();
		int input = scan.nextInt();
		int a[] = new int[input];

		for(int z =0; z<a.length; z++){
			List<Character> unique = new ArrayList<Character>();
			String input1 = scan.next().toLowerCase();
			for(char ch : input1.toCharArray()){
				
				
				unique.add(ch);
				
			}
			
			Collections.sort(unique);
			System.out.println(unique);
		}
	
	
	}

}
