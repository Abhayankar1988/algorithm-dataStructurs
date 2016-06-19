package com.abhay.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MaxDuplicateWordCount{

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("C:/Users/abchaubey/Documents/abc.txt"));
		while (scanner.hasNextLine()){
			String s1 = scanner.nextLine();
			wordCount(s1);	 
		}
		scanner.close();
	}

	private static void wordCount(String s1) {
		String st[]=s1.split(" ");
		Map<String, Integer> mp= new TreeMap<String, Integer>();
		for(int i=0;i<st.length;i++){

			Integer count=mp.get(st[i]);
			if(count == null){
				count=0;
			}           
			mp.put(st[i],++count);
		}
		int maxValueInMap=(Collections.max(mp.values()));
		System.out.println( "value "+ maxValueInMap);
		for(Entry<String, Integer> entry : mp.entrySet()){
			if(entry.getValue()==maxValueInMap){
				System.out.println(entry.getKey());
			}	  
			List<Integer> c = new ArrayList<Integer>(mp.values());
			Collections.sort(c);
			c = c.subList(0,5);
			System.out.println("Sublist " + c);
			for(int i=0 ; i< 5; ++i) {
				System.out.println(i + " rank is " + c.get(i)); 
			}
		}
	}


}