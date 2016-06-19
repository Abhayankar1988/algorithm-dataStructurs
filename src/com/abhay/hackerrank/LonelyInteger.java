package com.abhay.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LonelyInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		// String input[]=new String[n];
		int input[]= {1,3,2,2,3,5,5};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<input.length;i++)
		{
			if(map.containsKey(input[i])){
				int count = map.get(input[i]);
				map.put(input[i], ++count);
			}else
			{
				map.put(input[i], 1);
			}


		}

		for( Map.Entry<Integer,Integer> entry : map.entrySet()){
			if(entry.getValue()==1){
				System.out.println(entry.getKey());
			}
		}

	}
}
