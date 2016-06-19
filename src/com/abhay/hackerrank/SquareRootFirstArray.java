package com.abhay.hackerrank;

public class SquareRootFirstArray {

	public static void main(String[] args) {

		int firstArray [] = {3,1,4,5,19,6};
		int secondArray [] = {14,9,22,36,8,0,64,25};
		
		for(int i=0; i<firstArray.length; i++){
			for(int j=0; j<secondArray.length; j++){		
				if((firstArray[i]*firstArray[i]) == secondArray[j] ){
					System.out.println(secondArray[j]);
					break;
				}			
			}
		}
	}

}
