package com.geeksforgeek.basic;

import java.util.Scanner;

public class ZigZagStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = "GEEKSFORGEEKS";
		
		int n = 3;
		
		zigZag(word, n);

	}
	
	//GEEKSFORGEEKS

	private static void zigZag(String word, int n) {
		
		if(n ==0){
			System.out.println(word);
			return;
		}
		
		char [] ch = word.toCharArray();
		
		char[] newCh = new char[word.length()];
		int row= 0;
		
		boolean flagUp = false;
		boolean flagDown = false ;
		
		for(int j=0; j<ch.length; j++){
			
			newCh[row] = ch[j];
			
			if(row == n-1){
				flagDown = false; 
			}else if(row == 0){
				flagDown= true;
			}
			
			if(flagDown){
				row++;
			}else{
				row--;
			}
		
		}
		
		for(char ch1 : newCh){
			System.out.print(ch1);
			
		}
		
	}

}
