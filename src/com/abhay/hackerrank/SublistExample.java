package com.abhay.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SublistExample {

	
	public static void main(String[] args)  {
		
	/*	int[] myIntArray = {1,2,4,7,5,6,3,2,9,10};
		List<int[]> list = Arrays.asList(myIntArray);*/
		
		 ArrayList<Integer> alist = new ArrayList<Integer>();
	        alist.add(10);
	        alist.add(20);
	        alist.add(30);
	        alist.add(40);
	        alist.add(50);
	        alist.add(60);
	        alist.add(70);
	        alist.add(80);
		
		List<Integer> al = alist.subList(0, 3);
		List<Integer> a2 = alist.subList(4, 6);
		List<Integer> a3 = alist.subList(7, 8);
		
		System.out.println("size " +  al.size() + " "  +  al);
		System.out.println("size " +  a2.size() + " "  +  a2);
		System.out.println("size " +  a3.size() + " "  +  a3);
		
		Scanner scan = new Scanner(System.in);
		Integer a = scan.nextInt();
		
		for(Integer a5: alist){
			alist.set(a, null);
		}
		
		System.out.println(alist);
		
		Scanner scan1 = new Scanner(System.in);
		Integer a1 = scan.nextInt();

		System.out.println(alist.get(a1));
		
	}
}
