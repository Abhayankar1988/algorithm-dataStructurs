package com.abhay.hackerrank;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TwoStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Set<Character> unique = new TreeSet<Character>();
		Set<Character> common = new TreeSet<Character>();
		int input = scan.nextInt();
		int a[] = new int[input];

		for(int z =0; z<a.length; z++){
			String input1 = scan.next().toLowerCase();
			for(char ch : input1.toCharArray()){
				unique.add(ch);
			}

			String abx = scan.next().toLowerCase();
			for(char ch : abx.toCharArray()){
				common.add(ch);
			}
			unique.retainAll(common);			
			if(unique.size()>0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			unique = new TreeSet<Character>();
			common = new TreeSet<Character>();
		}
	}
}
