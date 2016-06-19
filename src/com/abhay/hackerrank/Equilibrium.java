package com.abhay.hackerrank;

public class Equilibrium {

	public static void main(String[] args) {
		int arr[] = {-1, 3, -4, 5,1,-6,2,1};

		solution(arr);

	}

	public static int solution(int[] A) {
		
		for(int i=1; i<A.length; i++ ){
			
			int j=i+1;
			int k=i-1;
			int firstCount =0;
			int secoundCount =0;
			while(j<A.length){
				firstCount+=A[j];			
				++j;
			}
				
			while(k>=0){
				secoundCount+=A[k];
				--k;
			}
			
			if(firstCount==secoundCount){
				System.out.print(i + " ");
			}
		}


	return 0;

	}

}
