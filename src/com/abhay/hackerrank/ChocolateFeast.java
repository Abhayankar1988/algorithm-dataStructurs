package com.abhay.hackerrank;

import java.util.Scanner;

public class ChocolateFeast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
	}

	 private static long Solve(int N, int C, int M){
	        
	        int ab = N/C;
	        int result =0;
	        if(ab==M){
	        	ab = ab+1;
	        }else if(ab<M){
	        	
	        }
	        //System.out.println(result);
	         //Write code to solve each of the test over here
			return ab;
	    }
}
