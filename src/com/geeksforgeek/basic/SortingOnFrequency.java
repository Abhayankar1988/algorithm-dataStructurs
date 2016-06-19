package com.geeksforgeek.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class SortingOnFrequency {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			TreeMap<Integer, Integer> map =  new TreeMap<Integer, Integer>();

			int size = scan.nextInt();

			int arr[] = new int[size];

			for(int j=0; j<size; j++){
				arr[j]=scan.nextInt();	
				if(map.containsKey(arr[j])){
					map.put(arr[j], 1+map.get(arr[j]));
				}else{
					map.put(arr[j], 1);
				}
			}

			List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
			Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
					{
				public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
				{
					return (o2.getValue()).compareTo( o1.getValue() );
				}
					} );


			for(Entry<Integer, Integer> entry : list){
				for(int k=0; k<entry.getValue(); k++){
					System.out.print(entry.getKey() + " ");
				}

			}


		}	

	}

}
