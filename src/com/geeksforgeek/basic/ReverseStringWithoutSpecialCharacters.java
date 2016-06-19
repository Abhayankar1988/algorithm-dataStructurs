package com.geeksforgeek.basic;

public class ReverseStringWithoutSpecialCharacters {

	public static void main(String[] args) {
		
		String s1 = "a!!!b.c.d,e'f,ghi";
		
		char ch[] = s1.toCharArray();
		
		//c$b,a int l =0; 
		int l=0, r = s1.length()-1;
		
		
		while(l<r){
			if(!isAlphabet(ch[l])){
				l++;
			}else if(!isAlphabet(ch[r])){
				r--;
			}else{
				char ch3 = ch[l];
				ch[l] =ch[r];
				ch[r]= ch3;
				l++;
				r--;		
			}
		}
		
		for(char ch1 : ch)
		System.out.print(ch1);
	}
	
	private static void swap(char x, char y) {
	
		
	}

	static boolean  isAlphabet(char x)
	{
	    return ( (x >= 'A' &&  x <= 'Z') ||
	             (x >= 'a' &&  x <= 'z') );
	}

}
