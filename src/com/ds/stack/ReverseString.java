package com.ds.stack;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String originalWord = scan.next();
		
		int length = originalWord.length();
		
		Stack<Character> charStack = new Stack<Character>(length);
		
		for(int i=0; i<length;i++){		
			charStack.push(originalWord.charAt(i));
		}
		
		while(!charStack.isEmpty()){
			System.out.print(charStack.pop());
		}

	}

}
