package com.geeksforgeek.basic;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class NutsAndBolts {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();

			String nuts[] = new String[size];
			String bolts[] = new String[size];

			for(int j=0; j<size; j++){
				nuts[j]=scan.next();
			}
			
			for(int j=0; j<size; j++){
				bolts[j]=scan.next();
			}
			
			LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
			//! # $ % & * @ ^ ~
			map.put("!", 1);
			map.put("#", 1);
			map.put("$", 1);
			map.put("%", 1);
			map.put("&", 1);
			map.put("*", 1);
			map.put("@", 1);
			map.put("^", 1);
			map.put("~", 1);

			nutsBolts(nuts, bolts, map);

		}	
	}

	private static void nutsBolts(String[] nuts, String[] bolts,
			LinkedHashMap<String, Integer> map) {
		
		for(int i=0;i<nuts.length; i++){
			for(int j=0;j<nuts.length; j++){
			//	if(map.containsKey(key))
			}	
		}
		
	}

}
