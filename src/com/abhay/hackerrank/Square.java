package com.abhay.hackerrank;

import java.util.Scanner;

public class Square {
	
	private static int  square =0;

	private static int  rectange =0;
	private static int  ploygon =0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			
			
			if(a==b && b==c && c==d){
				++square;
				
			}else if ((a==c && b==d )){
				++rectange;
			}
			else {
				++ploygon;
			}
			
			System.out.println(square + " "  + rectange + " " + ploygon);
		}
		
		
}



}
