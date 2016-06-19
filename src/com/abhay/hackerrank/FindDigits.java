package com.abhay.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int[] input = new int[n1];
		
		for(int z=0; z<input.length;z++){
			input[z]=scan.nextInt();
			List<Integer> a = getDigits(input[z]);
			int count = 0;
			for(int i=0;i<a.size();i++){
				if(a.get(i)!=0 && (input[z] % a.get(i))==0){
					++count;
				}
			}
			System.out.println(count);
		}
		
		
		
		}

	private static List<Integer> getDigits(int i) {
		// TODO Auto-generated method stub
		List<Integer> digits = new ArrayList<Integer>();
		 while (i > 0) {
		     digits.add(i%10);
		     i/=10;
		 }
	
		 return digits;
	}
		
	}


