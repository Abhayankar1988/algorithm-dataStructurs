package com.geeksforgeek.basic;

import java.util.Scanner;
import java.util.TreeSet;

public class UnionOfTwoArraysSortedWay {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int sizeM = scan.nextInt();

			int sizeN = scan.nextInt();

			TreeSet<Integer> setM = new TreeSet<Integer>();
			
			for(int j=0; j<sizeM; j++){
				setM.add(scan.nextInt());
			}

			for(int j=0; j<sizeN; j++){
				setM.add(scan.nextInt());
			}

			for(Integer a : setM){
				System.out.print(a + " ");
			}
			
			System.out.println(" ");

		}	
	}


}
