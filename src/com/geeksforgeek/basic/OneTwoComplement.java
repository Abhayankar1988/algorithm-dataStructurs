package com.geeksforgeek.basic;

import java.util.Scanner;

public class OneTwoComplement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String input = scan.next();

		onesTwoComplement(input);



	}

	private static void onesTwoComplement(String input) {
		
		String ones = "";
		
		String tows = "";
		
		String rows = "";
		
		char [] word = input.toCharArray();
		
		for(int i=0;i<word.length;i++){
			if(word[i]=='0'){
				ones+=1;
			}else{
				ones+=0;
			}
		}
		
		tows = ones;
		char ch[] = tows.toCharArray();
		int j;
		for( j=ch.length-1; j>=0;--j){
			if(ch[j]=='1'){
				ch[j]='0';
			}else{
				ch[j]='1';
				break;
			}
		}
		for(char chr : ch){
			rows+=chr;
			
		}
		if(j==-1){
			rows = "1" + rows;
		}

		System.out.println(" 1 complemet "  +  ones);
		System.out.println(" 2 complemet " + rows);
		
		

	}

	

}
