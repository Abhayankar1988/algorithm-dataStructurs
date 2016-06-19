package com.abhay.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;


public class Solution {

	public static void main(String[] args){
		
		List<String> arrwords = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()){	
			String s1 = scan.nextLine().trim();
			//s1 = s1.replaceAll("\\s+","");
			arrwords.add(s1);	
			
			String[] srtdarrwords = sortAlphabetsInEachWord(arrwords);
			LinkedHashMap<String, String> wordmap = new LinkedHashMap<String,String>();
			int i=0;
			for(String s : srtdarrwords){
				if(wordmap.containsKey(s)){
					wordmap.put(s,wordmap.get(s)+","+arrwords.get(i++));
				}
				else{
					wordmap.put(s,arrwords.get(i++));
				}
			}
			for(String s : wordmap.keySet()){
				System.out.println(wordmap.get(s));
			}
		}	
		
		
	}
	
	
	private static String[] sortAlphabetsInEachWord(List<String> inparr){
		String[] retstr = new String[inparr.size()];
		int i=0;
		for (String s : inparr){
			retstr[i++] = s;
		}
		i=0;
		for (String s : retstr){
			s = s.replaceAll("\\s+","");
			char[] alphword = s.toCharArray();
			Arrays.sort(alphword);
			s = new String(alphword);
			retstr[i++] = s;
		}
		return retstr;
	}
	

}
