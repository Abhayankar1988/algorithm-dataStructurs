package com.abhay.hackerrank;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Anagram {
	static List<String>  words = null;
 
	public static void  groupAnagramsList(List<String> anagram) {
	    Map<String, LinkedList<String>> anagramMap = new HashMap<String, LinkedList<String>>();
	    for(String word : anagram) {
	        char[] wordChars = word.toCharArray();
	        Arrays.sort(wordChars);
	        String sortedKey = new String(wordChars);
	        LinkedList<String> anagramList = anagramMap.get(sortedKey);
	        if(anagramList == null) {
	            anagramMap.put(sortedKey, anagramList = new LinkedList());
	        }
	        anagramList.add(word);
	    }
	    
	    for(Map.Entry<String, LinkedList<String>> a : anagramMap.entrySet()){
	    	System.out.println(a.getKey() + " " + a.getValue());
	    }
	   
	    
	}
    public static void main(String[] args) {
    	
    	words = new ArrayList<String>();
    	Collection<LinkedList<String>> anagramList = null;
    	Scanner scan = new Scanner(System.in);
		while (scan.hasNext()){	
			String s1 = scan.nextLine().trim();
			words.add(s1);	
			groupAnagramsList(words);
		}
		
		
	

		
		
    }
}