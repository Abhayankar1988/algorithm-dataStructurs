package com.abhay.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingName{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> treeMap = new HashMap<String,Integer>();


		treeMap.put("John", 10);
		treeMap.put("Bob", 1);
		treeMap.put("Carlos", 5);
		treeMap.put("Alice", 5);
		treeMap.put("Donald", 7);


		Set<Entry<String, Integer>> set = treeMap.entrySet();
		System.out.println(set);
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		System.out.println(list);
		Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
				{
			public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
			{
				return (o2.getValue()).compareTo( o1.getValue() );
			}
				} );

		for(Map.Entry<String, Integer> entry:list){
			System.out.println("# "+entry.getKey());
		}


	}

}

