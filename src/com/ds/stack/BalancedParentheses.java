package com.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for(int i = 0; i<number; i++){
			String paranthesesString  = scan.next();
			System.out.println(isBalanced(paranthesesString));
			
			System.out.println(validSubstring(paranthesesString));
		}

	}

	private static int validSubstring(String word) {
		int count=0;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<word.toCharArray().length; i++){
            if((word.charAt(i)=='{' || word.charAt(i)=='[' ||  word.charAt(i)=='(') ){
                stack.push(word.charAt(i));
            }else if((word.charAt(i)=='}' || word.charAt(i)==']' ||  word.charAt(i)==')')  && (!stack.isEmpty())){
                char x = stack.pop();
                if((x != '{' && word.charAt(i)=='}') || (x != '[' && word.charAt(i)==']') || (x !='(' && word.charAt(i)==')')){
                
                }else{
                	   count+=2;
                }
            }
        }
        
        return count;
    }
	
	public static String isBalanced(String word){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<word.toCharArray().length; i++){
            if((word.charAt(i)=='{' || word.charAt(i)=='[' ||  word.charAt(i)=='(') ){
                stack.push(word.charAt(i));
            }else if((word.charAt(i)=='}' || word.charAt(i)==']' ||  word.charAt(i)==')')  && (!stack.isEmpty())){
                char x = stack.pop();
                if((x != '{' && word.charAt(i)=='}') || (x != '[' && word.charAt(i)==']') || (x !='(' && word.charAt(i)==')')){
                    return "NO";
                }
            }
        }
        
        if(stack.isEmpty()){
              return "YES";
        }else{
              return "NO";
        }
    }
}