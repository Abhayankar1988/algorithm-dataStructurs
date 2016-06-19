package com.geeksforgeek.basic;

import java.math.BigDecimal;
import java.util.Scanner;


/**
 * @author abchaubey
 *
 *
 *Input
	2
	4
	2
	8
	3
	Output
	2
	2.(6)
 */
public class SimpleFraction {

	public static void main(String[] args) {
		


		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int firstNo = scan.nextInt();

			int secondNo = scan.nextInt();
			
			fraction(firstNo, secondNo);
		}	
	


	}

	private static void fraction(int firstNo, int secondNo) {
		String number = null;
		try {
		//	number = (long) (firstNo/secondNo);
			
			System.out.println(number);
		} catch (ArithmeticException e) {
			System.out.println(number);
		}
	}

}
