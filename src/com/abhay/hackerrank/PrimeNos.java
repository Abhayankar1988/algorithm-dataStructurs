package com.abhay.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrimeNos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] a = {"1", "7", "8", "2", "4", "5"};
		
		String[] b = {"3", "5", "1", "7", "6", "9" };
		/*List<int[]> aInt = Arrays.asList(a);
		List<int[]> bInt = Arrays.asList(b);*/
		
		Set<String> union = new HashSet<String>(Arrays.asList(a));
		union.addAll(Arrays.asList(b));
		
		Set<String> intersection = new HashSet<String>(Arrays.asList(a));
		intersection.retainAll(Arrays.asList(b));
		
		union.removeAll(intersection);
		
	

			System.out.println(union);

	}



}
