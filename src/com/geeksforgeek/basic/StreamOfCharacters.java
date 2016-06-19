package com.geeksforgeek.basic;

import java.util.HashMap;

public class StreamOfCharacters {

	public static void main(String[] args) {
		
		String input = "acacabcatghhellomvnsdb";
		
		String[] arr={"aca","cat","hello","world"};
		
		countWords(input, arr);

	}

	private static void countWords(String input, String[] arr) {
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		for(String word : arr){
			int i = input.indexOf(word);
			
			if(i>=0){
				map.put(word, 1);
				
				i = input.indexOf(word, i+1);
				
				while(i>=0){
					
				}
			}
			
		}
		
		
	}

}
